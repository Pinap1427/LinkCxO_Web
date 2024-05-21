package LinkCxOWeb.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LinkCxOWeb.utils.TestUtilsWeb;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClassWeb {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void TestBaseClassWeb() throws IOException{	
		FileInputStream fs=new FileInputStream("C:\\Users\\Mayur More\\eclipse-workspace\\LinkCxO_Web\\src\\main\\java\\LinkCxOWeb\\config\\configure.propertief");
		prop=new Properties();
		prop.load(fs);
	}
	
	public static void InitializeBrowser() throws IOException {
		System.out.println("before cons");
		TestBaseClassWeb web=new TestBaseClassWeb();
		web.TestBaseClassWeb();
		System.out.println("after cons");
		TestUtilsWeb testutilsweb=new TestUtilsWeb(driver);
//		String browserName=prop.getProperty("BROWSER");
		String browserName=prop.getProperty("BROWSER");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
//			option.setExperimentalOption("excludeSwithces", new String[] {"enable-automation"});
			driver=new ChromeDriver(option);	
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option =new FirefoxOptions();
//			option.addArguments("--remote-allow-origins=*");
			driver=new FirefoxDriver(option);	
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			EdgeOptions option =new EdgeOptions();
//			option.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(option);	
		}
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutilsweb.pageloadtime,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutilsweb.implicitywait,TimeUnit.SECONDS);	
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		String windowSize = prop.getProperty("WindowSize");
//		String[] dimensions = windowSize.split("x");
//		int width = Integer.parseInt(dimensions[0]);
//		int height = Integer.parseInt(dimensions[1]);
//		Dimension dimension = new Dimension(width,height);
//		driver.manage().window().setSize(dimension);
	}
	
}
