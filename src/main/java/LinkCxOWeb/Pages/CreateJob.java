package LinkCxOWeb.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class CreateJob extends TestBaseClassWeb {

	public CreateJob() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	

	@FindBy(xpath = "//h2[.='Jobs']")
	private WebElement jobsbtn;

	public void ClickOnJobButon() {
		action.clickElement(jobsbtn);
	}

	@FindBy(xpath = "//h5[.='Create']")
	private WebElement Createbtn;

	public void ClickOnCreateButon() {
		action.clickElement(Createbtn);
	}

	@FindBy(xpath = "(//*[@id=\"input-with-sx\"])[1]")
	private WebElement titleEnter;

	public void EnterJobTitle() {
		action.sendKeysElement(titleEnter, "Senior Automation Test Engineer");
	}
//	(//label[.='Company *'])[1]

	String CompanyName="LinkCxO";
	
	@FindBy(xpath = "(//*[@id=\"input-with-sx\"])[2]")
	private WebElement companyEnter;

	public void EnterCompany() {
		action.sendKeysElement(companyEnter, CompanyName);
	}

	@FindBy(xpath = "(//*[@id=\"demo-simple-select\"])[1]")
	private WebElement enterIndustry;

	public void ClickOnIndustry() {
		action.clickElement(enterIndustry);
	}

	@FindBy(xpath = "//span[.='Startup / VCs/ PEs']")
	private WebElement selectInudstry;

	public void ClickonIndustrySelect() throws AWTException, InterruptedException {
		 Robot robot = new Robot();
		action.clickElement(selectInudstry);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
//		action.clickElement(sideClick);
	}
//	@FindBy(xpath = "(//label[.='Company *'])[1]")
//	private WebElement sideClick;
//	
//	public void sideClickable()
//	{
//		action.clickElement(sideClick);
//	}

	@FindBy(xpath = "(//*[@id=\"demo-simple-select\"])[2]")
	private WebElement clickFunction;

	public void ClickonFunctionButton() {
		action.clickElement(clickFunction);
	}

	@FindBy(xpath = "//span[.='Quality']")
	private WebElement selectFunction;

	public void ClickonSelectFunction() throws AWTException, InterruptedException {
		 Robot robot = new Robot();
		action.clickElement(selectFunction);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
	}

	@FindBy(xpath = "(//div[@id=\"demo-simple-select\"])[3]")
	private WebElement clickMin;

	public void ClickOnMinSaldropDown() {
		action.clickElement(clickMin);
	}

	@FindBy(xpath = "(//li[.='50 lacs'])")
	private WebElement selectMinSal;

	public void SelectMinSalary() {
		action.clickElement(selectMinSal);
	}
	
	@FindBy(xpath = "(//div[@id=\"demo-simple-select\"])[4]")
	private WebElement clickMax;

	public void ClickOnMaxSaldropDown() {
		action.clickElement(clickMax);
	}

	@FindBy(xpath = "(//li[.='60 lacs'])")
	private WebElement selectMaxSal;	

	public void SelectMaxSalary() {
		action.clickElement(selectMaxSal);
	}
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[6]/div[2]/div/div[1]/div/div/input")
	private WebElement locationEnter;
	public void EnterLocation() throws InterruptedException
	{
		Actions act = new Actions(driver);
//		act.moveToElement(locationEnter).click().sendKeys("Vashi");
		 act.moveToElement(locationEnter).perform();
		 Thread.sleep(3000);
		 action.sendKeysElement(locationEnter, "Vashi");
		
	}
	@FindBy(xpath = "(//div[.='Full Time'])[2]")
	private WebElement clickJobType;
	public void ClickonJobType()
	{
		action.clickElement(clickJobType);
	}
	@FindBy(xpath = "//li[.='Full Time']")
	private WebElement JobtypeSelect;
	public void SelectJobType()
	{
		action.clickElement(JobtypeSelect);
	}
	
	@FindBy(xpath = "(//div[@id=\"demo-simple-select\"])[6]")
	private WebElement MinExp;
	public void ClickonMinExp() throws InterruptedException
	{
		Actions act = new Actions(driver);
		 act.moveToElement(MinExp).perform();
		 Thread.sleep(2000);
		action.clickElement(MinExp);
	}
	@FindBy(xpath = "//li[.='10 years']")
	private WebElement selectMinExp;
	public void ClickOnMinExpSelect()
	{
		action.clickElement(selectMinExp);
	}
	
	@FindBy(xpath = "(//div[@id=\"demo-simple-select\"])[7]")
	private WebElement MaxExp;
	public void ClickonMaxExp()
	{
		action.clickElement(MaxExp);
	}
	@FindBy(xpath = "//li[.='12 years']")
	private WebElement selectMaxExp;
	public void ClickOnMaxExpSelect()
	{
		
		 action.clickElement(selectMaxExp);
	}
	
	@FindBy(xpath = "(//input[@value=\"Company\"])[1]")
	private WebElement CompanyRadioButton;
	
	public void ClickonCompanyRadioButton() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(2000);
		action.clickElement(companyEnter);
	}
	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])[4]")
	private WebElement qualification;
	public void EnterQualification()
	{
		action.sendKeysElement(qualification, "B.E, MCA");
	}
	@FindBy(xpath = "(//input[@id=\"input-with-sx\"])[5]")
	private WebElement skills;
	public void EnterSkills() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(2000);
		action.sendKeysElement(skills, "Java, Selenium, WebDriver, Appium, APi");
	}
	
	String JobDescrip = "Design and implement automation test strategy and associated plans with risks\r\n"
			+ "Design,\r\n" + "implementation, maintenance and improvement of automation test scripts\r\n"
			+ "Understand,\r\n" + "apply and optimise appropriate test mechanisms (functional, regression. smoke.)";

	@FindBy(xpath = "(//textarea[@placeholder=\"Start Typing Here\"])[1]")
	private WebElement jobDesc;
	public void EnterJD()
	{
		action.sendKeysElement(jobDesc, JobDescrip);
	}
	
	@FindBy(xpath = "(//button[.='Create'])[1]")
	private WebElement CreateJobBtnF;
	public void ClickOnFinalCreateJobButton()
	{
		action.clickElement(CreateJobBtnF);
	}
	
	@FindBy(xpath = "(//h6[.='LinkCxO'])[1]")
	private WebElement Verifyjob;
	public String ActualCompanyname;
	public boolean VerifyJobgettext()
	{
		ActualCompanyname=Verifyjob.getText();
		System.out.println(ActualCompanyname);
		return true;
	
	}
	
	public boolean VerifyJobCreatedOrNot()
	{
		if (companyEnter.equals(ActualCompanyname)) {
			System.out.println("TestCase pass");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		return true;
		
	}
//	public void switchWindow()
//	{
//		Set<String> windowhandles=driver.getWindowHandles();
//		 for (String handle : windowhandles) {
//	            driver.switchTo().window(handle);
//	        }
//	}
	
	
	
}//final } dont change
