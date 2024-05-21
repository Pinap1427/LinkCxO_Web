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

public class CreateClub extends TestBaseClassWeb {

	public CreateClub() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//button[@aria-label=\"account of current user\"]")
	private WebElement ThreeBar;

	public void Clickon3Bar() {
		action.clickElement(ThreeBar);
	}

	@FindBy(xpath = "(//span[.='Clubs'])[2]")
	private WebElement clubBtn;

	public void ClickonClubButton() {
		action.clickElement(clubBtn);
	}

	@FindBy(xpath = "(//h5[.='Create'])[1]")
	private WebElement createBtn;

	public void ClickonCreateButton() {
		action.clickElement(createBtn);
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

	@FindBy(xpath = "(//span[.='Public'])[1]")
	private WebElement scrollPublic;

	public void ScrolltillPublic() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(scrollPublic).perform();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	private WebElement freeCheck;

	public void ClickonFreeradioButton() {
		action.clickElement(freeCheck);
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

	@FindBy(xpath = "//li[.='CXO Networking']")
	private WebElement selectCate;

	public void SelectCategory() {
		action.clickElement(selectCate);
	}

	@FindBy(xpath = "(//button[.='Create'])[1]")
	private WebElement CreateClubfin;

	public void ClickonFinalCreateBtn() {
		action.clickElement(CreateClubfin);
	}

	@FindBy(xpath = "(//h2s[@class=\"MuiTypography-root MuiTypography-h2s css-2vhdp1\"])[1]")
	private WebElement verifyClub;

	public boolean VerifyClubCreatedORNot() {
		return action.isDisplay(verifyClub);
	}
	

}
