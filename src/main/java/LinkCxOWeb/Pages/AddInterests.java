package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class AddInterests extends TestBaseClassWeb {

	public AddInterests() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/aside/div/div[1]/div/div[1]/div/img")
	private WebElement profileClick;

	public void ClickonProfile() {
		action.clickElement(profileClick);
	}

	@FindBy(xpath = "(//h2s[.='Education'])[1]")
	private WebElement scrollabout;

	public void ScrollTilAbout() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(scrollabout).perform();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//h2s[.='Add new'])[2]")
	private WebElement AddnewInterest;

	public void ClickonAddnewInt() 
	{
		action.clickElement(AddnewInterest);
	}

	// Career Opportunities
	String ADdInt = "Career Opportunities";
	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"]")
	private WebElement enterInt;

	public void enterInterest() {
		action.sendKeysElement(enterInt, ADdInt);
	}

	@FindBy(xpath = "//button[.='Submit']")
	private WebElement Submitbtn;
	public void ClickonSubmitButton()
	{
		action.clickElement(Submitbtn);
	}
	@FindBy(xpath = "(//h2s[.='Interests'])[1]")
	private WebElement ClickInterest;
	public void ClickonInterest()
	{
		action.clickElement(ClickInterest);
	}
	@FindBy(xpath = "(//span[@class=\"MuiChip-label MuiChip-labelMedium css-9iedg7\"])[6]")
	private WebElement gettextofInt;
	
	public String ActualInterest;
	
//	public boolean GettextOFInterest() throws InterruptedException
//	{
//		ActualInterest=gettextofInt.getText();
//		Thread.sleep(1000);
//		System.out.println(ActualInterest);
//		return true;
//	}
	public boolean verifygettext()
	{
		ActualInterest=gettextofInt.getText();
	System.out.println(ActualInterest);
		return true;
	}
	
	public boolean VerifyBothString() throws InterruptedException
	{
		if (ADdInt.equals(ActualInterest)) {
//			System.out.println(ExpectedInterest);
//			System.out.println(ADdInt);
			Thread.sleep(2000);
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		
		return true;
		
	}
	
	
}
