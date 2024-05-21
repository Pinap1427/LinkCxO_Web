package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class CreateEvent extends TestBaseClassWeb {

	public CreateEvent() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//button[@aria-label=\"account of current user\"]")
	private WebElement ThreeBar;

	public void Clickon3Bar() {
		action.clickElement(ThreeBar);
	}

	@FindBy(xpath = "(//span[.='Events'])[3]")
	private WebElement EvenBtn;

	public void ClickonEventbButton() {
		action.clickElement(EvenBtn);
	}

	@FindBy(xpath = "(//h5[.='Create'])[1]")
	private WebElement CreateBtn;

	public void ClickonCreateEventBtn() {
		action.clickElement(CreateBtn);
	}

	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement clubImg;

	public void EnterImageforClub() throws InterruptedException {
		Thread.sleep(3000);
		clubImg.sendKeys("C:\\Users\\Mayur More\\OneDrive\\Documents\\Test.jpg");
	}

	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])[1]")
	private WebElement titleClub;

	public void EnterClubTitle() {
		action.sendKeysElement(titleClub, "Testing");
	}

	@FindBy(xpath = "(//textarea[@placeholder=\"Start Typing Here\"])[1]")
	private WebElement descClub;

	public void EnterClubDescription() {
		action.sendKeysElement(descClub, "For Testing");
	}

	@FindBy(xpath = "(//div[@class=\"MuiSelect-select MuiSelect-standard MuiSelect-multiple MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-14hw72x\"])[1]")
	private WebElement IndDrop;

	public void ClickonIndustryDropDown() {
		action.clickElement(IndDrop);
	}

	@FindBy(xpath = "(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-2w5ikc\"])[22]")
	private WebElement SelectInd;

	public void SelectFromIndustryDropdown() throws AWTException, InterruptedException {
		Robot rb = new Robot();
		action.clickElement(SelectInd);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
	}

	@FindBy(xpath = "(//div[@class=\"MuiSelect-select MuiSelect-standard MuiSelect-multiple MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-14hw72x\"])[2]")
	private WebElement FuncDrop;

	public void ClickonFunctionDropDown() {
		action.clickElement(FuncDrop);
	}

	@FindBy(xpath = "//span[.='Supply Chain and Purchase']")
	private WebElement selectFun;

	public void selectFunction() throws AWTException, InterruptedException {
		Robot rb = new Robot();
		action.clickElement(selectFun);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
	}

	@FindBy(xpath = "(//div[@class=\"MuiSelect-select MuiSelect-standard MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-14hw72x\"])[2]")
	private WebElement CateDrop;

	public void ClickonCategoryDropdown() {
		action.clickElement(CateDrop);
	}

	@FindBy(xpath = "//span[.='CXO Networking']")
	private WebElement selectCate;

	public void SelectCategory() throws AWTException, InterruptedException {
		Robot rb = new Robot();
		action.clickElement(selectCate);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
	}

	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-1yrz7eg\"])[2]")
	private WebElement scrolltillevent;

	public void scrollEvent() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(scrolltillevent).perform();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//input[@name=\"row-radio-buttons-group\"])[4]")
	private WebElement offline;

	public void ClickonofflineRadio() {
		action.clickElement(offline);
	}

	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-1yrz7eg\"])[2]")
	private WebElement enterrVenue;

	public void EnterVenue() {
		action.sendKeysElement(enterrVenue, "Vashi");
	}

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	private WebElement freeCheck;

	public void ClickonFreeradioButton() {
		action.clickElement(freeCheck);
	}

	@FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-19f3993\"])[3]")
	private WebElement enddate;

	public void ClickonStartDate() {
		action.clickElement(enddate);
	}

	@FindBy(xpath = "//button[.='30']")
	private WebElement selecctEndDate;

	public void SelectEndDAte() {
		action.clickElement(selecctEndDate);
	}

	@FindBy(xpath = "(//button[.='Create'])[1]")
	private WebElement FinalCreateEvent;

	public void ClickonFinalCreateEventButton() {
		action.clickElement(FinalCreateEvent);
	}

	@FindBy(xpath = "(//div[@class=\"MuiBox-root css-zoser8\"])[2]")
	private WebElement verifyEvent;

	public boolean VerifyEventCreatedorNot() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);");
	        Thread.sleep(3000);
		return action.isDisplay(verifyEvent);
	}

}
