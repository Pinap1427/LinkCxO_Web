package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.xml.xpath.XPath;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class CreateSurvey extends TestBaseClassWeb  {
	
	public CreateSurvey() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[5]")
	private WebElement surveyBtn;
	public void ClickOnCreateSurveyIcon()
	{
		action.clickElement(surveyBtn);
	}
	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"]")
	private WebElement surveyTitle;
	public String ExpectedSurveyTitle="Qa Automation";
	public void EnterSuveryTitle()
	{
		action.sendKeysElement(surveyTitle, ExpectedSurveyTitle);
	}
	@FindBy(xpath = "(//textarea[@class=\"MuiInputBase-input MuiInput-input MuiInputBase-inputMultiline css-o0s11j\"])[1]")
	private WebElement surveyDesc;
	public void EnterSuveryDesc()
	{
		action.sendKeysElement(surveyDesc, "For Testing");
		
	}
	@FindBy(xpath = "(//div[@class=\"MuiSelect-select MuiSelect-standard MuiSelect-multiple MuiInputBase-input MuiInput-input css-1yzqhai\"])")
	private WebElement clickCategory;
	public void ClickonCategory()
	{
		action.clickElement(clickCategory);
	}
	@FindBy(xpath = "//li[.='Business Growth']")
	private WebElement categorySelect;
	public void SelectCategory() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
		action.clickElement(categorySelect);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
	}
	@FindBy(xpath = "(//textarea[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-aremad\"])[1]")
	private WebElement questionEnter1;
	public void EnterQuesion1()
	{
		action.sendKeysElement(questionEnter1, "Mention the types of Web locators.");
	//"What are some of the unique alternatives to Selenium?"
	}
	@FindBy(xpath = "//button[@aria-label=\"Multiple-choice\"]")
	private WebElement mcq;
	public void ClickOnMultipleChoice() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(2000);
		action.clickElement(mcq);
	}
	
	@FindBy(xpath = "//button[text()='Add Option']")
	private WebElement optionAdd;
	public void AddOption() {
		action.clickElement(optionAdd);
	//call this method 3 more times 	
	}
	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])")
private WebElement questionEnter2;
	public void EnterQuestion2()
	{
		action.sendKeysElement(questionEnter2, "What are some of the unique alternatives to Selenium?");
	}
	
	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"])[2]")
	private WebElement EnterOption1;
	public void EnterOption1forMCQ()
	{
		action.sendKeysElement(EnterOption1, "Cucumber");
	}
	
	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"])[3]")
	private WebElement EnterOption2;
	public void EnterOption2forMCQ()
	{
		action.sendKeysElement(EnterOption2, "Cypress");
	}
	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"])[4]")
	private WebElement EnterOption3;
	public void EnterOption3forMCQ()
	{
		action.sendKeysElement(EnterOption3, "Robot Framework");
	}
	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"])[5]")
	private WebElement EnterOption4;
	public void EnterOption4forMCQ()
	{
		action.sendKeysElement(EnterOption4, "All of Above");
	}
	
	@FindBy(xpath = "//button[@aria-label=\"Select\"]")
	private WebElement Selectbtn;
	public void ClickOnSelectButton() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(250,350)");
	Thread.sleep(2000);
		action.clickElement(Selectbtn);
	}

	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-1yrz7eg\"])[2]")
	private WebElement enterQuestion3;
	
	public void EnterQuestion3()
	{
		action.sendKeysElement(enterQuestion3, "Which method is used for handling dropdowns?");
	}
	
	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"])[6]")
	private WebElement EnterOption1forSelect;
	public void EnterOption1Select()
	{
		action.sendKeysElement(EnterOption1forSelect, "Action");
	}
	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiInput-input css-1jhxu0\"])[7]")
	private WebElement EnterOption2forSelect;
	public void EnterOption2Select()
	{
		action.sendKeysElement(EnterOption2forSelect, "Select");
	}
	@FindBy(xpath = "(//div[@id=\"demo-simple-select\"])[1]")
	private WebElement selectday;
	public void ClickonSelectDay() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(2000);
		action.clickElement(selectday);
	}
	@FindBy(xpath = "//li[.='1 Week']")
	private WebElement select1Week;
	public void SelectdayfromDropdown()
	{
		action.clickElement(select1Week);
	}
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement surveyCreate;
	public void ClickOnsurveyCreateFinal()
	{
		action.clickElement(surveyCreate);
	}
	
	@FindBy(xpath = "(//span[@class=\"MuiTypography-root MuiTypography-h2s css-1442t5n\"])[1]")
	private WebElement verifytextoftitle;
	public String actualSurveyTitle;
	public void GettextofTitleSuvery() throws InterruptedException
	{
		actualSurveyTitle=verifytextoftitle.getText();
		Thread.sleep(1000);
		System.out.println(actualSurveyTitle);
	}
	
	public boolean VerifySurveyCreatedOrNot()
	{
		if (ExpectedSurveyTitle.equals(actualSurveyTitle)) {
			System.out.println("TestCase pass");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		return true;
		
	}
}
