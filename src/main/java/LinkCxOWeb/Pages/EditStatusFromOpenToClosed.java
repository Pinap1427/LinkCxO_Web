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

public class EditStatusFromOpenToClosed extends TestBaseClassWeb{
	
	public EditStatusFromOpenToClosed() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "(//button[.='Edit'])[1]")
	private WebElement editButton;
	public void ClickonEditButton()
	{
		action.clickElement(editButton);
	}
	
//	@FindBy(xpath = "(//div[@id=\"demo-simple-select\"])[1]")
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div/div")
	private WebElement jobStatusClick;
	public void ClickonJobStatus()
	{
		action.clickElement(jobStatusClick);
	}
	
	@FindBy(xpath = "//li[.='Closed']")
	private WebElement closed;
	public void SelectClosed()
	{
		action.clickElement(closed);
	}
	@FindBy(xpath = "(//button[.='Update'])[1]")
	private WebElement UpdateBtn;
	public void scrollTillUpdate() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(UpdateBtn).perform();
		Thread.sleep(1000);
	}
	public void ClickonUpdate()
	{
		action.clickElement(UpdateBtn);
	}
	
	@FindBy(xpath = "//h2[.='Networks']")
	private WebElement network;

	public void ClickonNetwork() throws InterruptedException, AWTException {
		
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
//		action.clickElement(network);
	}
	
	@FindBy(xpath = "//h2[.='Jobs']")
	private WebElement jobsbtn;

	public void ClickOnJobButon() {
		action.clickElement(jobsbtn);
	}

	@FindBy(xpath = "(//h5[.='Hire'])[1]")
	private WebElement hirebtn;

	public void ClickonHireButton() {
		action.clickElement(hirebtn);
	}
	
	@FindBy(xpath = "(//h5s[contains(text(),'Closed')])[1]")
	private WebElement ClosedTab;
	public void ClickonCloseTab()
	{
		action.clickElement(ClosedTab);
	}
	@FindBy(xpath = "(//h5s[@class=\"MuiTypography-root MuiTypography-h5s css-14tma7u\"])[1]")
	private WebElement verifyClosed;
	public boolean VerifyJobClosedorNot()
	{
		return action.isDisplay(verifyClosed);
	}
	

}
