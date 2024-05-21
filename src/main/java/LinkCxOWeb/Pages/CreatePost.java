package LinkCxOWeb.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class CreatePost extends TestBaseClassWeb {

	public CreatePost() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

//	@FindBy(xpath = "(//button[@type=\"button\"])[7]")
//	@FindBy(xpath = "//button[@aria-label='account of current user']//*[name()='svg']//*[name()='path' and contains(@d,'M3 18h18v-')]")
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[1]")
	// h2[normalize-space()='Jobs']
//	@FindBy(xpath = "//h2[normalize-space()='Jobs']")
	private WebElement ClickonPostBtn1;

	public void ClickOnPostButton() throws InterruptedException {
		Thread.sleep(2000);
		action.clickElement(ClickonPostBtn1);
//		action.isClickable(ClickonPostBtn1);
	}

	@FindBy(xpath = "//textarea[@placeholder=\"Start Typing Here\"]")
	private WebElement enterText;

	public void EnterTextforPost() {
		action.sendKeysElement(enterText, "Test");
	}

	@FindBy(xpath = "(//input[@type=\"file\"])[1]")
//	@FindBy(xpath = "//label[@for='icon-button-image']//div[@class='MuiBox-root css-inrloo']//*[name()='svg']")
	private WebElement EnterImage;

	public void EnterImageforPOst() throws InterruptedException {
//		action.clickElement(EnterImage);
		Thread.sleep(3000);
		EnterImage.sendKeys("C:\\\\Users\\\\Mayur More\\\\OneDrive\\\\Documents\\\\Test.jpg");
//		action.sendKeysElement(EnterImage, "C:\\Users\\Mayur More\\OneDrive\\Documents\\Sample-jpg-image-100kb.jpg");
	}
	public void UploadFile()
	{
		EnterImage.sendKeys("C:\\Users\\Mayur More\\OneDrive\\Documents\\Sample-jpg-image-100kb.jpg\")");
	}

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1u1x2zn']")
	private WebElement PostBtn;

	public void ClickOnPostBtn() {
		action.clickElement(PostBtn);
	}
	
	@FindBy(xpath = "(//h5s[@class=\"MuiTypography-root MuiTypography-h5s css-1ht9ltm\"])[1]")
	private WebElement scrolldowntoelem;
	
	public void scolldown() throws InterruptedException
	{
		Thread.sleep(2000);
		action.scrollIntoView(driver, verifypost);
	}
	

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/img[1]")
	private WebElement verifypost;

	public boolean VerifyPostCreatedorNot() {
		return action.isDisplay(verifypost);
	}
	
	
//	
//	WebElement sendfile=driver.findElement(By.xpath("//label[@for='icon-button-image']//div[@class='MuiBox-root css-inrloo']//*[name()='svg']"));
//	public void EnterFile()
//	{
//	
//		sendfile.sendKeys("\"C:\\Users\\Mayur More\\OneDrive\\Documents\\Test.jpg\"");
//		
//	}
}
	
