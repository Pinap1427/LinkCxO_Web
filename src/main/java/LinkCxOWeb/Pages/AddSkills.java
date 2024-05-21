package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class AddSkills extends TestBaseClassWeb{
	
	public AddSkills() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
//	@FindBy(xpath = "(//h5s[@class=\"MuiTypography-root MuiTypography-h5s css-szho60\"])[1]")
//	@FindBy(xpath = "(//h2s[normalize-space()='Affiliations'])[1]")
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/aside/div/div[1]/div/div[1]/div/img")
	private WebElement profileClick;
	public void ClickonProfile()
	{
		action.clickElement(profileClick);
	}

	@FindBy(xpath = "(//h2s[.='About'])[1]")
	private WebElement scrollabout;
	public void ScrollTilAbout() throws InterruptedException
	{

		Actions action = new Actions(driver);
		action.moveToElement(scrollabout).perform();
		Thread.sleep(1000);	
	}
	@FindBy(xpath = "(//h2s[.='Add new'])[1]")
	private WebElement AddnewSkill;
	public void addNewSkillsButton()
	{
		action.clickElement(AddnewSkill);
	}
	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"]")
	private WebElement skillsadd;
	public void pencilAdd()
	{
		action.clickElement(skillsadd);
	}
	public String Expectedskill= "RPA";
	 @FindBy (xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"])")
	 private WebElement skillEnter;
	 public void EnterSkill() throws AWTException, InterruptedException
	 {
		 Robot rb=new Robot();
		 action.sendKeysElement(skillEnter, Expectedskill);
		 Thread.sleep(1000);
		 rb.keyPress(KeyEvent.VK_ENTER);
	 }
	 @FindBy(xpath = "(//button[.='Save'])")
	 private WebElement SaveBtn;
	 public void ClickonSaveButton()
	 {
		 action.clickElement(SaveBtn);
	 }
	 @FindBy(xpath = "(//span[@class=\"MuiChip-label MuiChip-labelMedium css-9iedg7\"])[1]")
	 private WebElement gettextSkill;
	 public String actualSkill;
	 public void GettextofSkill()
	 {
		actualSkill=gettextSkill.getText();
		System.out.println(actualSkill);
	 }
	 
	 public boolean Verifyskillsaddedornot()
	 {
		 if (Expectedskill.equals(actualSkill)) {
			 System.out.println("TestCAse pass");
			
		}
		 else {
			 System.out.println("TestCAse Failed");
		 }
		 
		return true;
	 }
	 

}
