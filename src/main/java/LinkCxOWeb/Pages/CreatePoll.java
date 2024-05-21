package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class CreatePoll extends TestBaseClassWeb {

	public CreatePoll() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[3]")
	private WebElement pollCreate;

	public void ClickonCreatePoll() {
		action.clickElement(pollCreate);
	}

	@FindBy(xpath = "//h6[.='+ Add another option']")
	private WebElement addOption;

	public void ClickonAddAnotherOption() {
		action.clickElement(addOption);
	}

	public void ClickonAddAnotherOption1() throws InterruptedException {
		Thread.sleep(2000);
		action.clickElement(addOption);
	}

	@FindBy(xpath = "//textarea[@placeholder=\"What is the poll about ?\"]")
	private WebElement questionEnter;
	String question = "Which is the fastest Selenium WebDriver?";

	public void EnterQuestion() {
		action.sendKeysElement(questionEnter, question);
	}

	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])[1]")
	private WebElement opt1;

	public void enterOption1() {
		action.sendKeysElement(opt1, "ChromeDriver");
	}

	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])[2]")
	private WebElement opt2;

	public void enterOption2() {
		action.sendKeysElement(opt2, "FirefoxDriver");
	}

	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])[3]")
	private WebElement opt3;

	public void enterOption3() {
		action.sendKeysElement(opt3, "RemoteWebDriver");
	}

	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])[4]")
	private WebElement opt4;

	public void enterOption4() {
		action.sendKeysElement(opt4, "Html Unit Driver");
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement postbtn;

	public void ClickOnPostPollButton() {
		action.clickElement(postbtn);
	}
	
	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body2 css-umtwfi\"])[1]")
	private WebElement verifytext;
	
	public String actual;
	public boolean verifygettext()
	{
	actual=verifytext.getText();
	System.out.println(actual);
		return true;
	}
	
	public boolean verifyPollCreatedorNot()
	{
		if (question.equals(actual)) {
			System.out.println("testcase PAsas");
					
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		return true;
	}
	
}
