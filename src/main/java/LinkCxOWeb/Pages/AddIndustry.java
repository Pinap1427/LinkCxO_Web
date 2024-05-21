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

public class AddIndustry extends TestBaseClassWeb {

	public AddIndustry() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/aside/div/div[1]/div/div[1]/div/img")
	private WebElement profileClick;

	public void ClickonProfile() {
		action.clickElement(profileClick);
	}

	@FindBy(xpath = "(//h2s[.='Interests'])[1]")
	private WebElement scrollInterest;

	public void ScrollTilAbout() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(scrollInterest).perform();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//h2s[.='Add new'])[3]")
	private WebElement AddnewIndustry;

	public void addNewSkillsButton() {
		action.clickElement(AddnewIndustry);
	}

	@FindBy(xpath = "(//h2s[.='Add new'])[3]")
	private WebElement AddnewBtnInd;

	public void ClickonAddNewIndButton() {
		action.clickElement(AddnewBtnInd);
	}

	@FindBy(xpath = "//div[@class=\"MuiSelect-select MuiSelect-standard MuiSelect-multiple MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-14hw72x\"]")
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

	@FindBy(xpath = "(//button[.='Save'])")
	private WebElement Savebtn;

	public void ClickonSaveIndustryButton() {
		action.clickElement(Savebtn);
		// again call ClickonAddNewIndButton in testclass
	}

	@FindBy(xpath = "(//span[@class=\"MuiChip-label MuiChip-labelMedium css-9iedg7\"])[14]")
	private WebElement verifyInd;

	public boolean VerifyIndustryAddedorNot() {
		return action.isDisplay(verifyInd);
	}

}
