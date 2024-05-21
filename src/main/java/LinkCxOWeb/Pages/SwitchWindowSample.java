package LinkCxOWeb.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class SwitchWindowSample  extends TestBaseClassWeb{

	public SwitchWindowSample() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "//h2[.='Jobs']")
	private WebElement jobsbtn;

	public void ClickOnJobButon() {
		action.clickElement(jobsbtn);
	}
	@FindBy(xpath = "(//h5s[.='Marketing Head'])[1]")
	private WebElement firstJob;
	public void ClickOnFirstJob()
	{
		action.clickElement(firstJob);
	}
	
//	@FindBy(xpath = "(//h5[@class=\"MuiTypography-root MuiTypography-h5 css-dw2srq\"])[1]")
//	private WebElement gettextofcompany;
	public boolean gettextOFCompanyName() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement gettextofcompany= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 css-dw2srq\"])[1]")));
//		action.switchToChildWindow();
		Thread.sleep(3000);
		String a=gettextofcompany.getText();
		System.out.println(a);
		Thread.sleep(3000);
		
		return true;
	}
	
			public boolean gettextOFFirstJob() throws InterruptedException
			{
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement gettextofcompany= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h5s[@class=\"MuiTypography-root MuiTypography-h5s css-14tma7u\"])[1]")));
//				action.switchToChildWindow();
				Thread.sleep(3000);
				String ab=gettextofcompany.getText();
				System.out.println(ab);
				Thread.sleep(3000);
				
				return true;
			}
	
}
