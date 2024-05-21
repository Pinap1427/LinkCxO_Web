package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class SaveJob extends TestBaseClassWeb {

	public SaveJob() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//h2[.='Jobs']")
	private WebElement jobsbtn;

	public void ClickOnJobButon() {
		action.clickElement(jobsbtn);
	}

	@FindBy(xpath = "(//h5s[.='Marketing Head'])[1]")
	private WebElement firstJob;

	public void ClickonFirstJob() {
		action.clickElement(firstJob);
	}

	@FindBy(xpath = "(//h5s[.='Skills'])[1]")
	private WebElement skills;

	public void scrollTillSave() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(skills).perform();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath = "(//button[.='Save'])[1]")
	private WebElement saveBtn;
	public void clickonSaveButton()
	{
		action.clickElement(saveBtn);
	}
	//then driver.navigate.refresh method call;
	
	@FindBy(xpath = "(//h5s[contains(text(),'Saved')])[1]")
	private WebElement Savedbtn;
	public void ClickonSavedButton()
	{
		action.clickElement(Savedbtn);
	}
	
	@FindBy(xpath = "(//button[.='Unsave'])")
	private WebElement UnsaveVerify;
	
	public boolean verifyJobSavedorNot()
	{
		return action.isDisplay(UnsaveVerify);
	}
	
	public void ClickonUnsave()
	{
		action.clickElement(UnsaveVerify);
	}

}
