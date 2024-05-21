package LinkCxOWeb.utils;

import java.io.File;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.opencsv.CSVWriter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import io.appium.java_client.android.AndroidDriver;

public class TestUtilsWeb extends TestBaseClassWeb{
	
	public ExtentHtmlReporter htmlReport;
	public static ExtentReports extent;
	public static ExtentTest test;
	static String year;
	static String time;
	protected String parentHandle;
	public static WebDriver driver;
	
	static Logger log = Logger.getLogger(TestUtilsWeb.class);
	
	public TestUtilsWeb(WebDriver driver) throws IOException{
		super();
		this.driver=TestBaseClassWeb.driver;
		System.out.println("AV");
	}



	public static long pageloadtime = 20;
	public static long implicitywait = 20;
	
	public String takeScreenShot() throws IOException {
		Date date = new Date();
		SimpleDateFormat tm = new SimpleDateFormat("yyyy-MM-dd");
		year = tm.format(date);
		SimpleDateFormat tm1 = new SimpleDateFormat("hh_mm_ss");
		time = tm1.format(date);

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir") + File.separator +"Screenshot" + File.separator + year + File.separator + time + ".jpeg";
		FileUtils.copyFile(srcFile, new File(destFile));
		System.out.println(destFile);

		return destFile;
	}

	public void ScreenshotPathFormat() {
		Date date = new Date();
		SimpleDateFormat tm = new SimpleDateFormat("yyyy-MM-dd");
		year = tm.format(date);
		SimpleDateFormat tm1 = new SimpleDateFormat("HH_mm_ss");
		time = tm1.format(date);
	}

	public void extentReport() throws IOException {
		ScreenshotPathFormat();
		String path = System.getProperty("user.dir") + "/REPORT_WEB";
		String finalPath = path + "/" + year + "/";
		new File(finalPath).mkdirs();
		htmlReport = new ExtentHtmlReporter(finalPath + time + ".html");
		htmlReport.config().setDocumentTitle("Automation Report");// Title of the report
		htmlReport.config().setReportName("Functional Report");// Name of the report
		htmlReport.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		htmlReport.config().setTheme(Theme.STANDARD);
		extent.setSystemInfo("Project Name", "LinkCxO Web");
		extent.setSystemInfo("Test Lead", "Prabhat Kumar");
		extent.attachReporter(htmlReport);
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Browser", "Chrome");

	}

	public void testCaseCreate(String tc) {
		test = extent.createTest("<font color=\"BlueViolet\"><b>" + tc + "</b></font> ").assignCategory("MAYUR");
	}

	public void passTestCase(String passDesc) throws IOException {
		test.log(Status.INFO, MarkupHelper.createLabel(passDesc, ExtentColor.GREEN));
		test.log(Status.PASS, "", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot()).build());
	}

	public void failTestCase(String failDesc) throws IOException {
		test.log(Status.INFO, MarkupHelper.createLabel(failDesc, ExtentColor.RED));
		test.log(Status.FAIL, "", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot()).build());
	}

	public void ExtentFlush() {
		extent.flush();
	}
	
	public void switchToChildWindow() {
	    Set<String> newWindowHandles = driver.getWindowHandles();
	    for (String handle : newWindowHandles) {
	        System.out.println("inside switch");
	        log.info("Window " + handle);
	        if (!handle.equals(parentHandle)) {
	            log.info("Switching to Window: " + handle);
	            driver.switchTo().window(handle);
	            log.info("Switch Done");
	            break;
	        }
	    }
	}
	
	public void setParentHandle() {
	    parentHandle = driver.getWindowHandle();
	}

	
	public void closeChildWindow() {
		 System.out.println("Closing child window...");
		    driver.close();
		    System.out.println("Child window closed.");
		    System.out.println("Switching back to parent window...");
		    driver.switchTo().window(parentHandle);
		    System.out.println("Switched back to parent window.");
	}


}
