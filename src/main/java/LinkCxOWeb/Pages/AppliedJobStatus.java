package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class AppliedJobStatus extends TestBaseClassWeb{
	
	public AppliedJobStatus() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	

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
	@FindBy(xpath = "(//h6[contains(normalize-space(), '1 Applicants')])[2]")
	private WebElement firstJobApplied;
	public void ClickonFirstAppliedJob()
	{
		action.clickElement(firstJobApplied);
	}
	@FindBy(xpath = "(//h5s[contains(normalize-space(), 'Applied')])[1]")
	private WebElement scrollapplied;
	public void scrollTillapplied() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(scrollapplied).perform();
		Thread.sleep(1000);
	}
	@FindBy(xpath = "(//button[.='Hold'])[1]")
	private WebElement holdBtn;
	public void ClickOnHoldButton()
	{
		action.clickElement(holdBtn);
	}
	@FindBy(xpath = "(//h5s[contains(normalize-space(), 'Hold')])[1]")
	private WebElement scrollHold;
	public void ScrolltillHold() throws InterruptedException
	{

		Actions action = new Actions(driver);
		action.moveToElement(scrollHold).perform();
		Thread.sleep(1000);
	}
	@FindBy(xpath = "(//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-12x7y34\"])[1]")
	private WebElement VerifyHold;
	public boolean VerifyCandidateshowinginHoldTab()
	{
		return action.isDisplay(VerifyHold);
	}
	@FindBy(xpath = "(//button[.='Shortlist'])[1]")
	private WebElement shortListClick;
	public void ClickonShortList()
	{
		action.clickElement(shortListClick);
	}
	@FindBy(xpath = "(//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-12x7y34\"])[1]")
	private WebElement VerifyShortList;
	public boolean VerifyCandidateshowinginShortListTab()
	{
		return action.isDisplay(VerifyShortList);
	}
	
	@FindBy(xpath = "(//button[.='Reject'])[1]")
	private WebElement rejectBtn;
	public void ClickOnRejectButton()
	{
		action.clickElement(rejectBtn);
	}
	
	@FindBy(xpath = "(//h5s[contains(text(), 'Rejected')])[1]")
	private WebElement rejectscroll;
	public void scrollTillReject() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(rejectscroll).perform();
		Thread.sleep(1000);	
	}

	@FindBy(xpath = "(//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-12x7y34\"])[1]")
	private WebElement VerifyRejectList;
	public boolean VerifyCandidateshowinginRejectedTab()
	{
		return action.isDisplay(VerifyRejectList);
	}
	
	@FindBy(xpath = "(//button[.='Undo'])[1]")
	private WebElement undoBtn;
	public void ClickonUndoButton()
	{
		action.clickElement(undoBtn);
	}
	
	@FindBy(xpath = "(//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-12x7y34\"])[1]")
	private WebElement VerifyUndo;
	public boolean VerifyCandidateshowingafterUndo()
	{
		return action.isDisplay(VerifyUndo);
	}
	
	
	
}
