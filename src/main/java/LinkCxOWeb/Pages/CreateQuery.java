package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class CreateQuery extends TestBaseClassWeb {

	public CreateQuery() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[4]")
	private WebElement CreateQuery;

	public void ClickonCreateQuery() {
		action.clickElement(CreateQuery);
	}

	@FindBy(xpath = "(//div[@class=\"MuiSelect-select MuiSelect-standard MuiSelect-multiple MuiInputBase-input MuiInput-input css-1yzqhai\"])")
	private WebElement clickCategory;

	public void ClickOnCategory() {
		action.clickElement(clickCategory);
	}

	@FindBy(xpath = "//li[.='Business Growth']")
	private WebElement categorySelect;

	public void SelectCategory() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		action.clickElement(categorySelect);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
	}

//	@FindBy(xpath = "(//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-multiline css-1fqjahx\"])")
//	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/label")
	@FindBy(xpath = "//textarea[@id=\"mui-1\"]")
	private WebElement questionEnter;
	String expectedQuery = "For Testing";

	public void EnterQuestion() {
		action.sendKeysElement(questionEnter, expectedQuery);
	}

	@FindBy(xpath = "//button[.='Create']")
	private WebElement queryCreate;

	public void CreateQueryBtn() {
		action.clickElement(queryCreate);
	}
	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 css-1wropfb\"])[1]")
	private WebElement queryverify;
	public String ActualQuery;
	public void VerifyQuerygettext() throws InterruptedException
	{
		ActualQuery=queryverify.getText();
		Thread.sleep(1000);
		System.out.println(ActualQuery);

	}
	
	public boolean VerifyQueryCreatedOrNot()
	{
		if (expectedQuery.equals(ActualQuery)) {
			System.out.println("TestCase pass");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		return true;
		
	}
}
