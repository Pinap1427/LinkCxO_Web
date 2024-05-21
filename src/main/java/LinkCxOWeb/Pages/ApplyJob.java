package LinkCxOWeb.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class ApplyJob extends TestBaseClassWeb {

	public ApplyJob() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	@FindBy(xpath = "//div[@class='MuiBox-root css-eler4y']//a")
	private WebElement Logo;

	public void ClickonLogo() {
		action.clickElement(Logo);
	}

	@FindBy(xpath = "//h2[.='Jobs']")
	private WebElement jobsbtn;

	public void ClickOnJobButon() {
		action.clickElement(jobsbtn);
	}

	@FindBy(xpath = "(//button[.='Apply'])[2]")
	private WebElement jobApply;
	public void ClickonJobApply()
	{
		action.clickElement(jobApply);
	}
	
	String Msg="Hi Hiring Manager,     Please hire me!!!!!!!       Thanks,Prabhat";
	@FindBy(xpath = "//textarea[@rows=\"8\"]")
	private WebElement msgEnter;
	public void EnterMessgae() throws InterruptedException
	{
		Thread.sleep(2000);
		action.sendKeysElement(msgEnter, Msg);
	}
//	@FindBy(xpath = "//div[@class='MuiBox-root css-1rn9lx2']")
	@FindBy(xpath = "(//input[@type=\"file\"])[1]")
	private WebElement pdf;
	public void PdfEnter() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		pdf.sendKeys("C:\\Users\\Mayur More\\OneDrive\\Documents\\dummy-pdf_2.pdf");
	}

	@FindBy(xpath = "(//input[@id=\"country-select-demo\"])[2]")
	private WebElement inCroreSal;
	public void ClickoninCroreSal() throws InterruptedException
	{
	
		action.clickElement(inCroreSal);
	}
	
	@FindBy(xpath = "//li[@id='country-select-demo-option-1']")
	private WebElement selectinCroreSal;
	public void SelectInCroreSal() throws InterruptedException
	{
		Thread.sleep(1000);
		action.clickElement(selectinCroreSal);
	}
	

	@FindBy(xpath = "(//input[@id=\"country-select-demo\"])[3]")
	private WebElement inLacsSal;
	public void ClickonLacsSal()
	{
		action.clickElement(inLacsSal);
		
	}
	

	@FindBy(xpath = "//li[@id='country-select-demo-option-2']")
	private WebElement selectinLacsSal;
	public void SelectInLacsSal() throws InterruptedException
	{
		Thread.sleep(1000);
		action.clickElement(selectinLacsSal);
	}
	


	
	@FindBy(xpath = "(//button[.='Apply'])[1]")
	private WebElement applyBtn;
	public void ClickOnFinalApplyButton()
	{
		action.clickElement(applyBtn);;
	}
	@FindBy(xpath = "(//h5s[@class=\"MuiTypography-root MuiTypography-h5s css-14tma7u\"])[1]")
	private WebElement verifyJobApply;
	public boolean VerifyJobApplyorNot()
	{
		return action.isDisplay(verifyJobApply);
	}
	
	
	
}
