package LinkCxOWeb.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.utils.ActionKeywords;

public class ComposeArticle extends TestBaseClassWeb {

	public ComposeArticle() {
		super();
		PageFactory.initElements(driver, this);
	}

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/main/div/div[1]/div/div/div/div[3]/button[2]")
	private WebElement ComposearticleBtn;

	public void ClickOnComposeArticleFirstButton() {
		action.clickElement(ComposearticleBtn);
	}

	@FindBy (xpath = "//textarea[@placeholder=\"Add your Headline here\"]")
	private WebElement headlineEnter;
	public void EnterHEadline()
	{
//		action.sendKeysElement(headlineEnter, prop.getProperty("articleHeadLine"));
		action.sendKeysElement(headlineEnter, "Testing");
	}
	@FindBy(xpath = "//textarea[@placeholder=\"Start typing here...\"]")
	private WebElement textEnter;
	String desc="for Testing purpose";
	public void EnterText()
	{
		action.sendKeysElement(textEnter, desc);
	}
	@FindBy(xpath = "//button[.=\"Update Post\"]")
	private WebElement postUpdate;
	public void ClickonUpdatepost()
	{
		action.clickElement(postUpdate);
	}
	@FindBy(xpath = "(//h2[@class=\"MuiTypography-root MuiTypography-h2 css-156ippy\"])[1]")
	private WebElement verifygettext;
	public String actual;
	public boolean verifytext()
	{
	actual=verifygettext.getText();
	System.out.println(actual);
		return true;
	}
	public boolean verify()
	{
		if (desc.equals(actual)) {
			System.out.println("testcase PAsas");
					
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		return true;
	}
	
}
