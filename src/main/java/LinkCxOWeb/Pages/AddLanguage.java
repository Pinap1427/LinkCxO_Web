package LinkCxOWeb.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class AddLanguage extends TestBaseClassWeb {

	public AddLanguage() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/aside/div/div[1]/div/div[1]/div/img")
	private WebElement profileClick;

	public void ClickonProfile() {
		action.clickElement(profileClick);
	}

	@FindBy(xpath = "(//h2s[.='Additional Information'])[1]")
	private WebElement scrolllang;

	public void ScrollTilLanguage() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(scrolllang).perform();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//h2s[.='Add new'])[10]")
	private WebElement AddnewSkill;

	public void addNewSkillsButton() {
		action.clickElement(AddnewSkill);
	}

	@FindBy(xpath = "//div[@class=\"MuiSelect-select MuiSelect-standard MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-14hw72x\"]")
	private WebElement langdrop;

	public void clickonLanguageDropDown() {
		action.clickElement(langdrop);
	}

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	private WebElement firstLang;
	public void SelectFirstLanguage()
	{
		action.clickElement(firstLang);
	}
	@FindBy(xpath = "//input[@value=\"Beginner\"]")
	private WebElement selectBegin;
	public void SelectBegineerradio()
	{
		action.clickElement(selectBegin);
	}
	@FindBy(xpath = "(//input[@value=\"Yes\"])[1]")
	private WebElement yesradiobutton;
	public void ClickonReadingRadioButton()
	{
		action.clickElement(yesradiobutton);
	}
	@FindBy(xpath = "(//input[@value=\"Yes\"])[2]")
	private WebElement yesradiobutton2;
	public void ClickonWritingRadioButton()
	{
		action.clickElement(yesradiobutton2);
	}
	@FindBy(xpath = "(//input[@value=\"Yes\"])[3]")
	private WebElement yesradiobutton3;
	public void ClickonSpeakingRadioButton()
	{
		action.clickElement(yesradiobutton3);
	}
	@FindBy(xpath = "//button[.='Add']")
	private WebElement addBtn;
	public void ClickonAddLAngButton()
	{
		action.clickElement(addBtn);
	}
	@FindBy(xpath = "(//h2s[.='Languages'])[1]")
	private WebElement Languagestab;
	public void ClickonLangugaesTab()
	{
		action.clickElement(Languagestab);
	}
	@FindBy(xpath = "(//div[@class=\"MuiAccordionDetails-root css-u7qq7e\"])[10]")
	private WebElement VerifyLang;
	@FindBy(xpath = "(//h2s[.='Language:'])[1]")
	private WebElement scrollLanguage;
	public void scrolltillfirstLang() throws InterruptedException
	{
//		Actions action = new Actions(driver);
//		action.moveToElement(scrollLanguage).perform();
//		Thread.sleep(1000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);");
	        Thread.sleep(3000);
	}
	public boolean VerifyLanguageAddedorNot()
	{
		
		
		return action.isDisplay(VerifyLang);
	}
	
}
