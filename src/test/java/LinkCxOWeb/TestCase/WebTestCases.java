package LinkCxOWeb.TestCase;

import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import LinkCxOWeb.BaseClass.TestBaseClassWeb;
import LinkCxOWeb.Pages.WebLoginWithMobileNumber;
import LinkCxOWeb.utils.ActionKeywords;
import LinkCxOWeb.utils.TestUtilsWeb;
import LinkCxOWeb.Pages.AddSkills;
import LinkCxOWeb.Pages.AppliedJobStatus;
import LinkCxOWeb.Pages.ApplyJob;
import LinkCxOWeb.Pages.ComposeArticle;
import LinkCxOWeb.Pages.CreateJob;
import LinkCxOWeb.Pages.CreatePost;
import LinkCxOWeb.Pages.SwitchWindowSample;
import LinkCxOWeb.Pages.CreatePoll;
import LinkCxOWeb.Pages.CreateQuery;
import LinkCxOWeb.Pages.CreateSurvey;
import LinkCxOWeb.Pages.EditStatusFromInactiveToOpen;
import LinkCxOWeb.Pages.EditStatusFromOpenToClosed;
import LinkCxOWeb.Pages.EditStatusInactive;
import LinkCxOWeb.Pages.SaveJob;
import LinkCxOWeb.Pages.AddIndustry;
import LinkCxOWeb.Pages.AddInterests;
import LinkCxOWeb.Pages.CreateClub;
import LinkCxOWeb.Pages.CreateEvent;
import LinkCxOWeb.Pages.AddLanguage;

public class WebTestCases extends TestBaseClassWeb {
	public static WebDriver driver;

	@Override
	public void TestBaseClassWeb() throws IOException {
//		 super();
//		 this.driver = driver;
		driver = TestBaseClassWeb.driver;
	}

	TestUtilsWeb testutilsWeb;
	ActionKeywords action1;
	WebLoginWithMobileNumber loginmethodweb;
	TestBaseClassWeb testclassweb;
	CreatePost postmethod;
	ComposeArticle articlemethod;
	CreatePoll pollMethod;
	CreateJob jobCreate;
	ApplyJob jobapply;
	SwitchWindowSample switchwindow;
	CreateQuery queryMethod;
	CreateSurvey surveyMethod;
	SaveJob jobSave;
	EditStatusInactive inactiveMethod;
	EditStatusFromInactiveToOpen intoOpenMethod;
	EditStatusFromOpenToClosed optoClosedMethod;
	AppliedJobStatus statusjobMethod;
	AddSkills skillsaddMethod;
	AddIndustry industryaddMethod;
	CreateClub clubaddMethod;
	CreateEvent eventaddMethod;
	AddLanguage langAddMethod;
	AddInterests interestAddMethod;

	@BeforeTest
	public void setUp() throws IOException {
		System.out.println("Inside before");
		InitializeBrowser();
		testutilsWeb = new TestUtilsWeb(driver);
		action1 = new ActionKeywords();
		loginmethodweb = new WebLoginWithMobileNumber();
		postmethod = new CreatePost();
		articlemethod = new ComposeArticle();
		pollMethod = new CreatePoll();
		jobCreate = new CreateJob();
		jobapply = new ApplyJob();
		switchwindow = new SwitchWindowSample();
		queryMethod = new CreateQuery();
		surveyMethod = new CreateSurvey();
		jobSave = new SaveJob();
		inactiveMethod = new EditStatusInactive();
		intoOpenMethod = new EditStatusFromInactiveToOpen();
		optoClosedMethod = new EditStatusFromOpenToClosed();
		statusjobMethod = new AppliedJobStatus();
		skillsaddMethod = new AddSkills();
		industryaddMethod = new AddIndustry();
		clubaddMethod = new CreateClub();
		eventaddMethod = new CreateEvent();
		langAddMethod = new AddLanguage();
		interestAddMethod = new AddInterests();
		
		
	}

	@Test(priority = 1)
	public void loginviaMobileNumber() throws IOException {
		testutilsWeb.extentReport();
		testutilsWeb.testCaseCreate("Tc 01 : Login With Mobile Number");
		try {
			loginmethodweb.enterMobileNumbmer();
			testutilsWeb.test.log(Status.INFO, "Enter Mobile Number");
			loginmethodweb.ClickOnArrowButton();
			testutilsWeb.test.log(Status.INFO, "Click on arrow");
			loginmethodweb.EnterOTP();
			testutilsWeb.test.log(Status.INFO, "Enter enter otp");
			loginmethodweb.ClickonVerifyButton();
			testutilsWeb.test.log(Status.INFO, "Click on verify ");
			Thread.sleep(3000);
			try {
				if (loginmethodweb.verifyUserIsAbletoLogin()) {
					testutilsWeb.passTestCase("User is able to login succesfully");
				}
			} catch (Exception e) {
				testutilsWeb.failTestCase("User is not able to login");
			}
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to login");
		}
	}

	@Test(priority = 2, enabled = true)
	public void CreatePost() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 2: Create Post ");
		Thread.sleep(5000);
		try {
			postmethod.ClickOnPostButton();
			testutilsWeb.test.log(Status.INFO, "Click on Post button");
			Thread.sleep(3000);
			System.out.println("Test");
			Thread.sleep(3000);
			postmethod.EnterTextforPost();
			testutilsWeb.test.log(Status.INFO, "Entering Text for creating post");
			Thread.sleep(3000);
			postmethod.EnterImageforPOst();
//			postmethod.EnterFile();
			testutilsWeb.test.log(Status.INFO, "Click on image");
//			postmethod.UploadFile();
			postmethod.ClickOnPostBtn();
			testutilsWeb.test.log(Status.INFO, "Click on Post Button");
			Thread.sleep(4000);
//			postmethod.scolldown();
//			TestUtilsWeb.test.log(Status.INFO, "Scroll Down");
			try {
				if (postmethod.VerifyPostCreatedorNot()) {
					testutilsWeb.passTestCase("User is able to create post");
				}
			} catch (Exception e) {
				// TODO: handle exception
				testutilsWeb.failTestCase("User is not able to create post");
		
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to create post");
		}
	}

	@Test(priority = 3, enabled = false)
	public void ComposeAnARticle() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 3 : Compose An Article");
		Thread.sleep(3000);
		try {
			articlemethod.ClickOnComposeArticleFirstButton();
			testutilsWeb.test.log(Status.INFO, "Click on Compose ARticle button");
			articlemethod.EnterHEadline();
			testutilsWeb.test.log(Status.INFO, "Enter HeadLine");
			articlemethod.EnterText();
			testutilsWeb.test.log(Status.INFO, "Enter Text description");
			articlemethod.ClickonUpdatepost();
			testutilsWeb.test.log(Status.INFO, "Click on Update Post");
			Thread.sleep(3000);
			articlemethod.verifytext();
			testutilsWeb.test.log(Status.INFO, "gettext of desc");
			try {
				if (articlemethod.verify()) {
					testutilsWeb.passTestCase("User is able to Compose Article");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Compose Article");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Compose Article");
		}
	}

	@Test(priority = 4, enabled = false)
	public void CreatePoll() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 4 : Create Poll");
		Thread.sleep(3000);
		try {
			pollMethod.ClickonCreatePoll();
			testutilsWeb.test.log(Status.INFO, "Click on Create Poll");
			pollMethod.ClickonAddAnotherOption();
			testutilsWeb.test.log(Status.INFO, "Click on add another option");
			pollMethod.ClickonAddAnotherOption1();
			testutilsWeb.test.log(Status.INFO, "Click on add another option");
			pollMethod.EnterQuestion();
			testutilsWeb.test.log(Status.INFO, "Enter Question");
			pollMethod.enterOption1();
			testutilsWeb.test.log(Status.INFO, "Enter Option 1");
			pollMethod.enterOption2();
			testutilsWeb.test.log(Status.INFO, "Enter Option 2");
			pollMethod.enterOption3();
			testutilsWeb.test.log(Status.INFO, "Enter Option 3");
			pollMethod.enterOption4();
			testutilsWeb.test.log(Status.INFO, "Enter Option 4");
			pollMethod.ClickOnPostPollButton();
			testutilsWeb.test.log(Status.INFO, "Click on Create Poll");
			Thread.sleep(3000);
			pollMethod.verifygettext();
			testutilsWeb.test.log(Status.INFO, "gettext of question");
			Thread.sleep(3000);
			try {
				if (pollMethod.verifyPollCreatedorNot()) {
					testutilsWeb.passTestCase("User is able to Create poll");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Create poll");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Create Poll");
		}
	}

	@Test(priority = 5, enabled = false)
	public void CreateJob() throws IOException, InterruptedException {
		testutilsWeb.testCaseCreate("TC 05: Create Job");
		Thread.sleep(3000);
		try {

			jobCreate.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on Jobs Button");
			jobCreate.ClickOnCreateButon();
			testutilsWeb.test.log(Status.INFO, "Click on Create Button");
			jobCreate.EnterJobTitle();
			testutilsWeb.test.log(Status.INFO, "Enter Job Title");
			jobCreate.EnterCompany();
			testutilsWeb.test.log(Status.INFO, "Enter Company Name");
			jobCreate.ClickOnIndustry();
			testutilsWeb.test.log(Status.INFO, "Click on Industry");
			jobCreate.ClickonIndustrySelect();
			testutilsWeb.test.log(Status.INFO, "Select Industry");
//		jobCreate.sideClickable();
			Thread.sleep(3000);
			jobCreate.ClickonFunctionButton();
			testutilsWeb.test.log(Status.INFO, "Click on Function");
			jobCreate.ClickonSelectFunction();
			testutilsWeb.test.log(Status.INFO, "Select Function");
			jobCreate.ClickOnMinSaldropDown();
			testutilsWeb.test.log(Status.INFO, "Click on Minimum Salary Dropdown");
			jobCreate.SelectMinSalary();
			testutilsWeb.test.log(Status.INFO, "Select Minimum Salary");
			jobCreate.ClickOnMaxSaldropDown();
			testutilsWeb.test.log(Status.INFO, "Click on Maximun Salary Dropdown");
			jobCreate.SelectMaxSalary();
			testutilsWeb.test.log(Status.INFO, "Select Minimum Salary");
			jobCreate.EnterLocation();
			testutilsWeb.test.log(Status.INFO, "Enter Location");
			jobCreate.ClickonJobType();
			testutilsWeb.test.log(Status.INFO, "Click on JobType");
			jobCreate.SelectJobType();
			testutilsWeb.test.log(Status.INFO, "Select JobType");
			jobCreate.ClickonMinExp();
			testutilsWeb.test.log(Status.INFO, "Click on Minimum Experience");
			jobCreate.ClickOnMinExpSelect();
			testutilsWeb.test.log(Status.INFO, "Select Minimum Experience");
			jobCreate.ClickonMaxExp();
			testutilsWeb.test.log(Status.INFO, "Click on Maximum Experience");
			jobCreate.ClickOnMaxExpSelect();
			testutilsWeb.test.log(Status.INFO, "Select Minimum Experience");
			jobCreate.ClickonCompanyRadioButton();
			testutilsWeb.test.log(Status.INFO, "Click on Radio Button");
			jobCreate.EnterQualification();
			testutilsWeb.test.log(Status.INFO, "Enter Qualification");
			jobCreate.EnterSkills();
			testutilsWeb.test.log(Status.INFO, "Enter Skills");
			jobCreate.EnterJD();
			testutilsWeb.test.log(Status.INFO, "Enter Job Description");
			jobCreate.ClickOnFinalCreateJobButton();
			testutilsWeb.test.log(Status.INFO, "Click on Create Job Button");
			jobCreate.VerifyJobgettext();
			testutilsWeb.test.log(Status.INFO, "Verify gettext");

			Thread.sleep(2000);

			try {
				if (jobCreate.VerifyJobCreatedOrNot()) {
					testutilsWeb.passTestCase("User is able to Create Job");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Create Job");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Create Job");
		}
	}

	@Test(priority = 6, enabled = false)
	public void ApplyJob() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 6 : Apply Job");
		Thread.sleep(3000);
		try {

			jobapply.ClickonLogo();
			testutilsWeb.test.log(Status.INFO, "Click on log");
			jobapply.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on jobs");
			Thread.sleep(3000);
			jobapply.ClickonJobApply();
			testutilsWeb.test.log(Status.INFO, "Click on apply");
			jobapply.EnterMessgae();
			testutilsWeb.test.log(Status.INFO, "Enter Message");
			jobapply.PdfEnter();
			testutilsWeb.test.log(Status.INFO, "Enter pdf");
			jobapply.ClickoninCroreSal();
			testutilsWeb.test.log(Status.INFO, "Click on inCrore Salary");
			jobapply.SelectInCroreSal();
			testutilsWeb.test.log(Status.INFO, "Enter inCrore Salary");
			jobapply.ClickonLacsSal();
			testutilsWeb.test.log(Status.INFO, "Click on Lacs Salary");
			jobapply.SelectInLacsSal();
			testutilsWeb.test.log(Status.INFO, "Enter inLacs Salary");
			jobapply.ClickOnFinalApplyButton();
			testutilsWeb.test.log(Status.INFO, "Click on Apply Button");
			Thread.sleep(3000);
			try {
				if (jobapply.VerifyJobApplyorNot()) {
					testutilsWeb.passTestCase("User is able to Apply job");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to apply job");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to apply job");
		}
	}

	@Test(priority = 7, enabled = false)
	public void SwitchWindowCheck() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("Sample Testing of Switch Window");
		Thread.sleep(2000);

		try {
			switchwindow.ClickOnJobButon();
			switchwindow.ClickOnFirstJob();
			Thread.sleep(3000);
			testutilsWeb.setParentHandle();
			Thread.sleep(2000);
			testutilsWeb.switchToChildWindow();
			Thread.sleep(3000);
			switchwindow.gettextOFCompanyName();
			Thread.sleep(3000);
//			testutilsWeb.switchToChildWindow();
			testutilsWeb.closeChildWindow();
			Thread.sleep(3000);
			switchwindow.gettextOFFirstJob();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("TestCase Failed");
			// TODO: handle exception
		}
	}

	@Test(priority = 7, enabled = false)
	public void CreateQuery() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 07: Create Query");
		Thread.sleep(2000);
		try {
			queryMethod.ClickonCreateQuery();
			testutilsWeb.test.log(Status.INFO, "Click on Create Query");
			queryMethod.ClickOnCategory();
			testutilsWeb.test.log(Status.INFO, "Click on Catergory");
			queryMethod.SelectCategory();
			testutilsWeb.test.log(Status.INFO, "Select Category");
			queryMethod.EnterQuestion();
			testutilsWeb.test.log(Status.INFO, "Enter Question");
			Thread.sleep(3000);
			queryMethod.CreateQueryBtn();
			testutilsWeb.test.log(Status.INFO, "Click on Create Query");
			Thread.sleep(3000);
			queryMethod.VerifyQuerygettext();
			testutilsWeb.test.log(Status.INFO, "Gettext of Query and it will match with expected query");

			try {
				if (queryMethod.VerifyQueryCreatedOrNot()) {
					testutilsWeb.passTestCase("User is able to Create Query");

				}

			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Create Query");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Create Query");
		}

	}

	@Test(priority = 8, enabled = false)
	public void CreateSurvey() throws IOException, InterruptedException {
		testutilsWeb.testCaseCreate("TC 08 : Create Survey");
		Thread.sleep(2000);

		try {
			surveyMethod.ClickOnCreateSurveyIcon();
			testutilsWeb.test.log(Status.INFO, "Click on Create Survey Icon");
			surveyMethod.EnterSuveryTitle();
			testutilsWeb.test.log(Status.INFO, "Enter Title");
			surveyMethod.EnterSuveryDesc();
			testutilsWeb.test.log(Status.INFO, "Enter Description");
			surveyMethod.ClickonCategory();
			testutilsWeb.test.log(Status.INFO, "Click on Category");
			surveyMethod.SelectCategory();
			testutilsWeb.test.log(Status.INFO, "Select Category from dropdown");
			surveyMethod.EnterQuesion1();
			testutilsWeb.test.log(Status.INFO, "Enter Question 1");
			surveyMethod.ClickOnMultipleChoice();
			testutilsWeb.test.log(Status.INFO, "Click on Multiple Choice icon");
			surveyMethod.AddOption();
			testutilsWeb.test.log(Status.INFO, "Add option 2");
			surveyMethod.AddOption();
			testutilsWeb.test.log(Status.INFO, "Add option 3");
			surveyMethod.AddOption();
			testutilsWeb.test.log(Status.INFO, "Add option 4");
//			surveyMethod.AddOption();
//			testutilsWeb.test.log(Status.INFO, "");
			surveyMethod.EnterQuestion2();
			testutilsWeb.test.log(Status.INFO, "Enter Question 2");
			surveyMethod.EnterOption1forMCQ();
			testutilsWeb.test.log(Status.INFO, "Enter option 1");
			surveyMethod.EnterOption2forMCQ();
			testutilsWeb.test.log(Status.INFO, "Enter option 2");
			surveyMethod.EnterOption3forMCQ();
			testutilsWeb.test.log(Status.INFO, "Enter option 3");
			surveyMethod.EnterOption4forMCQ();
			testutilsWeb.test.log(Status.INFO, "Enter option 4");
			surveyMethod.ClickOnSelectButton();
			testutilsWeb.test.log(Status.INFO, "Click on Select Button");
			surveyMethod.EnterQuestion3();
			testutilsWeb.test.log(Status.INFO, "Enter Question 3");
			surveyMethod.EnterOption1Select();
			testutilsWeb.test.log(Status.INFO, "Enter option 1");
			surveyMethod.EnterOption2Select();
			testutilsWeb.test.log(Status.INFO, "Enter option 2");
			surveyMethod.ClickonSelectDay();
			testutilsWeb.test.log(Status.INFO, "Click on Day");
			surveyMethod.SelectdayfromDropdown();
			testutilsWeb.test.log(Status.INFO, "Select day from dropdown");
			surveyMethod.ClickOnsurveyCreateFinal();
			testutilsWeb.test.log(Status.INFO, "Click on Create Survey Button");
			surveyMethod.GettextofTitleSuvery();
			testutilsWeb.test.log(Status.INFO, "gettext of survey title");
			Thread.sleep(4000);
			try {
				if (surveyMethod.VerifySurveyCreatedOrNot()) {
					testutilsWeb.passTestCase("User is able to Create Survey");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Create Survey");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Create Survey");
		}
	}

	@Test(priority = 9, enabled = false)
	public void SaveJob() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 09 : Save Job");
		Thread.sleep(2000);
		try {
			jobSave.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on Job ");
			testutilsWeb.setParentHandle();
			testutilsWeb.test.log(Status.INFO, "Set Parent Window");
			Thread.sleep(2000);
			jobSave.ClickonFirstJob();
			testutilsWeb.test.log(Status.INFO, "Click on First Job");
			testutilsWeb.switchToChildWindow();
			Thread.sleep(3000);
			jobSave.scrollTillSave();
			testutilsWeb.test.log(Status.INFO, "Scroll till Save Button");
			jobSave.clickonSaveButton();
			testutilsWeb.test.log(Status.INFO, "Click on Save Button");
			testutilsWeb.closeChildWindow();
			Thread.sleep(1000);
//			driver.navigate().refresh();
			TestBaseClassWeb.driver.navigate().refresh();
			jobSave.ClickonSavedButton();
			testutilsWeb.test.log(Status.INFO, "Click on Saved Button");

			try {
				if (jobSave.verifyJobSavedorNot()) {
					testutilsWeb.passTestCase("User is able to Save Job");

				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Save Job");
			}
			jobSave.ClickonUnsave();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Save Job");

		}
	}

	@Test(priority = 10, enabled = false)
	public void EditStatusAsInactive() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 10 : Edit Job Status as Inactive");
		Thread.sleep(2000);
		try {

			inactiveMethod.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on Job button");
			inactiveMethod.ClickonHireButton();
			testutilsWeb.test.log(Status.INFO, "Click on Hire Button");
			Thread.sleep(4000);
			inactiveMethod.ClickonEditButton();
			testutilsWeb.test.log(Status.INFO, "Click on Edit Button");
			inactiveMethod.ClickonJobStatus();
			testutilsWeb.test.log(Status.INFO, "Click on Job Status");
			inactiveMethod.SelectInactive();
			testutilsWeb.test.log(Status.INFO, "Select Inactive");
			inactiveMethod.scrollTillUpdate();
			testutilsWeb.test.log(Status.INFO, "Scroll Till Update");
			inactiveMethod.ClickonUpdate();
			testutilsWeb.test.log(Status.INFO, "Click on Update ");
			inactiveMethod.ClickonNetwork();
			testutilsWeb.test.log(Status.INFO, "Click on Network Button");
			Thread.sleep(4000);
			inactiveMethod.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on Job Button");
			inactiveMethod.ClickonHireButton();
			testutilsWeb.test.log(Status.INFO, "Click on Hire Button");
			inactiveMethod.ClickonInactiveJob();
			testutilsWeb.test.log(Status.INFO, "Click on Inactive Jobs tab");
			Thread.sleep(4000);
			try {
				if (inactiveMethod.VerifyJobisInactiveOrNot()) {
					testutilsWeb.passTestCase("User is able to Change the Job Status as Inactive");

				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able ot Change the Job Status as Inactive");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to change status as inactive");
		}
	}

	@Test(priority = 11, enabled = false)
	public void ChangeStatusfromInactivetoOpen() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 11 : Change status form Inactive To Open");
		Thread.sleep(2000);
		try {
			intoOpenMethod.ClickOnThreeDot();
			testutilsWeb.test.log(Status.INFO, "Click on 3 dot");
			intoOpenMethod.ClickonEditThreDot();
			testutilsWeb.test.log(Status.INFO, "Click on Edit ");
			intoOpenMethod.ClickonJobStatus();
			testutilsWeb.test.log(Status.INFO, "Click on Job Status");
			intoOpenMethod.SelectOpen();
			testutilsWeb.test.log(Status.INFO, "Select Job Status as Open");
			intoOpenMethod.scrollTillUpdate();
			testutilsWeb.test.log(Status.INFO, "Scroll till Update");
			intoOpenMethod.ClickonUpdate();
			testutilsWeb.test.log(Status.INFO, "Click on update ");
			intoOpenMethod.ClickonNetwork();
			testutilsWeb.test.log(Status.INFO, "Click on Network");
			Thread.sleep(4000);
			intoOpenMethod.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on Job Button");
			intoOpenMethod.ClickonHireButton();
			testutilsWeb.test.log(Status.INFO, "Click on hire Button");
			Thread.sleep(4000);

			try {
				if (intoOpenMethod.VerifyJobOpenorNot()) {
					testutilsWeb.passTestCase("User is able to Change Job Status from Inactive to Open");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to change Job Status From Inactive To Open");

			}

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to change the Job Status from Inactive To Open");
		}
	}

	@Test(priority = 12, enabled = false)
	public void ChangeStatusfromOpentoClosed() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 12 : Change status form Open To Closed ");
		Thread.sleep(2000);
		try {

			optoClosedMethod.ClickonEditButton();
			testutilsWeb.test.log(Status.INFO, "Click on Edit Button");
			optoClosedMethod.ClickonJobStatus();
			testutilsWeb.test.log(Status.INFO, "Click on Job Status");
			optoClosedMethod.SelectClosed();
			testutilsWeb.test.log(Status.INFO, "Select job Status as Closed");
			optoClosedMethod.scrollTillUpdate();
			testutilsWeb.test.log(Status.INFO, "SCroll till update");
			optoClosedMethod.ClickonUpdate();
			testutilsWeb.test.log(Status.INFO, "Click on update ");
			optoClosedMethod.ClickonNetwork();
			testutilsWeb.test.log(Status.INFO, "Click on Network");
			Thread.sleep(4000);
			optoClosedMethod.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on Job Button");
			optoClosedMethod.ClickonHireButton();
			testutilsWeb.test.log(Status.INFO, "Click on hire Button");
			Thread.sleep(4000);
			optoClosedMethod.ClickonCloseTab();
			testutilsWeb.test.log(Status.INFO, "Click on Closed tab");
//			optoClosedMethod.

			try {
				if (optoClosedMethod.VerifyJobClosedorNot()) {
					testutilsWeb.passTestCase("User is able to change Job Status From Open to Closed");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Change the Job Status from Open To Closed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to change Job Status From Open To Closed");

		}
	}

	@Test(priority = 13, enabled = false)
	public void ChangeAppliedJobStatus() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 13 : Change Applied Job Status");
		Thread.sleep(3000);
		try {

			statusjobMethod.ClickOnJobButon();
			testutilsWeb.test.log(Status.INFO, "Click on Job Button");
			statusjobMethod.ClickonHireButton();
			testutilsWeb.test.log(Status.INFO, "Click on Hire Button");
			Thread.sleep(3000);
			testutilsWeb.setParentHandle();
			Thread.sleep(2000);
			statusjobMethod.ClickonFirstAppliedJob();
			testutilsWeb.test.log(Status.INFO, "Click on Applied job ");
			testutilsWeb.switchToChildWindow();
			Thread.sleep(3000);
			statusjobMethod.scrollTillapplied();
			testutilsWeb.test.log(Status.INFO, "Scroll till Applied job ");
			statusjobMethod.ClickOnHoldButton();
			testutilsWeb.test.log(Status.INFO, "Click on Hold button");
			Thread.sleep(3000);
			statusjobMethod.ScrolltillHold();
			testutilsWeb.test.log(Status.INFO, "Scroll till hold button");

			try {
				if (statusjobMethod.VerifyCandidateshowinginHoldTab()) {
					testutilsWeb
							.passTestCase("User is able to Change job Status as Hold and it is showing in hold tab");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb
						.failTestCase("User is not able to Change job Status as Hold and it is showing in hold tab");
				// TODO: handle exception
			}
			statusjobMethod.ClickonShortList();
			testutilsWeb.test.log(Status.INFO, "Click on ShortList button");
			Thread.sleep(3000);
			try {
				if (statusjobMethod.VerifyCandidateshowinginShortListTab()) {
					testutilsWeb.passTestCase(
							"User is able to Change job Status as ShortList and it is showing in ShortList tab");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase(
						"User is not able to Change job Status as ShortList and it is showing in ShortList tab");
				// TODO: handle exception
			}
			statusjobMethod.ClickOnRejectButton();
			testutilsWeb.test.log(Status.INFO, "Click on Reject Button");
			Thread.sleep(3000);
			statusjobMethod.scrollTillReject();
			testutilsWeb.test.log(Status.INFO, "Scroll till Reject Button");
			Thread.sleep(3000);
			try {
				if (statusjobMethod.VerifyCandidateshowinginRejectedTab()) {
					testutilsWeb.passTestCase(
							"User is able to Change job Status as Rejected and it is showing in Rejected tab");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase(
						"User is not able to Change job Status as Rejected and it is showing in Rejected tab");
				// TODO: handle exception
			}
			statusjobMethod.VerifyCandidateshowinginRejectedTab();
			statusjobMethod.ClickonUndoButton();
			testutilsWeb.test.log(Status.INFO, "Click on Undo Button");
			Thread.sleep(3000);
			try {
				if (statusjobMethod.VerifyCandidateshowingafterUndo()) {
					testutilsWeb.passTestCase(
							"After Clicking on Undo button the candidate details are going back in previous state");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase(
						"After Clicking on Undo button the candidate details are not going back in previous state");
				// TODO: handle exception
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Change The Status job applied by candidate");
			// TODO: handle exception
		}
	}

	@Test(priority = 14, enabled = false)
	public void SkillsAdd() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 14 : Add Skills ");
		Thread.sleep(2000);

		try {

			skillsaddMethod.ClickonProfile();
			testutilsWeb.test.log(Status.INFO, "Click on Profile");
			skillsaddMethod.ScrollTilAbout();
			testutilsWeb.test.log(Status.INFO, "Scroll down till about");
			Thread.sleep(2000);
			skillsaddMethod.addNewSkillsButton();
			testutilsWeb.test.log(Status.INFO, "Click on Add new Skills btn");
			skillsaddMethod.pencilAdd();
			testutilsWeb.test.log(Status.INFO, "Click on add");
			skillsaddMethod.EnterSkill();
			testutilsWeb.test.log(Status.INFO, "Enter Skill");
			skillsaddMethod.ClickonSaveButton();
			testutilsWeb.test.log(Status.INFO, "Click on Save Button");
			skillsaddMethod.GettextofSkill();
			testutilsWeb.test.log(Status.INFO, "Gettext of the skills which entered");
			Thread.sleep(3000);
			try {
				if (skillsaddMethod.Verifyskillsaddedornot()) {
					testutilsWeb.passTestCase("User is able to add Skills");

				}

			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to add Skills");
				// TODO: handle exception
			}
			// Verifyskillsaddedornot

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to add Skills");
		}
	}

	@Test(priority = 15, enabled = false)
	public void AddIndustry() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 15 : Add Industry");
		Thread.sleep(2000);
		try {
			industryaddMethod.ClickonProfile();
			industryaddMethod.ScrollTilAbout();
			industryaddMethod.addNewSkillsButton();
			industryaddMethod.ClickonAddNewIndButton();
			industryaddMethod.ClickonIndustryDropDown();
			industryaddMethod.SelectFromIndustryDropdown();
			industryaddMethod.ClickonSaveIndustryButton();
			Thread.sleep(3000);
			industryaddMethod.ClickonAddNewIndButton();
			Thread.sleep(3000);
			try {
				if (industryaddMethod.VerifyIndustryAddedorNot()) {
					testutilsWeb.passTestCase("User is able to Add Industry");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Add Inudstry");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Add Inudstry");
		}
	}

	@Test(priority = 16, enabled = false)
	public void CreateClub() throws IOException, InterruptedException {
		testutilsWeb.testCaseCreate("TC : 16 Create Club");
		Thread.sleep(2000);
		try {
			clubaddMethod.Clickon3Bar();
			testutilsWeb.test.log(Status.INFO, "Click on 3 bar");
			clubaddMethod.ClickonClubButton();
			testutilsWeb.test.log(Status.INFO, "Click on Club");
			clubaddMethod.ClickonCreateButton();
			testutilsWeb.test.log(Status.INFO, "Click on Create Button in club tab");
			clubaddMethod.EnterImageforClub();
			testutilsWeb.test.log(Status.INFO, "Enter Image");
			Thread.sleep(2000);
			clubaddMethod.EnterClubTitle();
			testutilsWeb.test.log(Status.INFO, "Enter Club Title");
			clubaddMethod.EnterClubDescription();
			testutilsWeb.test.log(Status.INFO, "Enter Club Description");
			clubaddMethod.ScrolltillPublic();
			testutilsWeb.test.log(Status.INFO, "Scroll till public radio button");
			clubaddMethod.ClickonFreeradioButton();
			testutilsWeb.test.log(Status.INFO, "Click on Free Radio Button");
			clubaddMethod.ClickonIndustryDropDown();
			testutilsWeb.test.log(Status.INFO, "Click on Industry dropdown");
			clubaddMethod.SelectFromIndustryDropdown();
			testutilsWeb.test.log(Status.INFO, "select Industry from dropdown");
			clubaddMethod.ClickonFunctionDropDown();
			testutilsWeb.test.log(Status.INFO, "Click on Function dropdown");
			clubaddMethod.selectFunction();
			testutilsWeb.test.log(Status.INFO, "select Function from dropdown");
			clubaddMethod.ClickonCategoryDropdown();
			testutilsWeb.test.log(Status.INFO, "Click on Category dropdown");
			clubaddMethod.SelectCategory();
			testutilsWeb.test.log(Status.INFO, "select Category from dropdown");
			clubaddMethod.ClickonFinalCreateBtn();
			testutilsWeb.test.log(Status.INFO, "Click on Final Create Club Button");
			Thread.sleep(4000);
			try {
				if (clubaddMethod.VerifyClubCreatedORNot()) {
					testutilsWeb.passTestCase("User is  able to Create Club");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Create Club");
			}
			clubaddMethod.VerifyClubCreatedORNot();
			testutilsWeb.test.log(Status.INFO, "");

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Create Club");
			// TODO: handle exception
		}
	}

	@Test(priority = 17, enabled = false)
	public void CreateEvent() throws IOException, InterruptedException {
		testutilsWeb.testCaseCreate("TC : 17 Create Event");
		Thread.sleep(2000);
		try {
			eventaddMethod.Clickon3Bar();
			testutilsWeb.test.log(Status.INFO, "Click on 3 bar");
			eventaddMethod.ClickonEventbButton();
			testutilsWeb.test.log(Status.INFO, "Click on Event");
			eventaddMethod.ClickonCreateEventBtn();
			testutilsWeb.test.log(Status.INFO, "Click on Create Event in Events Tab");
			eventaddMethod.EnterImageforClub();
			testutilsWeb.test.log(Status.INFO, "Enter Image");
			Thread.sleep(2000);
			eventaddMethod.EnterClubTitle();
			testutilsWeb.test.log(Status.INFO, "Enter Event Title");
			eventaddMethod.EnterClubDescription();
			testutilsWeb.test.log(Status.INFO, "Enter Description for Event");
			eventaddMethod.ClickonIndustryDropDown();
			testutilsWeb.test.log(Status.INFO, "Click on Industry DropDown");
			eventaddMethod.SelectFromIndustryDropdown();
			testutilsWeb.test.log(Status.INFO, "Select Industry from DropDown");
			eventaddMethod.ClickonFunctionDropDown();
			testutilsWeb.test.log(Status.INFO, "Click on Function DropDown");
			eventaddMethod.selectFunction();
			testutilsWeb.test.log(Status.INFO, "Select Function from DropDown");
			eventaddMethod.ClickonCategoryDropdown();
			testutilsWeb.test.log(Status.INFO, "Click on Category DropDown");
			eventaddMethod.SelectCategory();
			testutilsWeb.test.log(Status.INFO, "Select Category from DropDown");
			eventaddMethod.scrollEvent();
			testutilsWeb.test.log(Status.INFO, "Scroll till Event");
			eventaddMethod.ClickonofflineRadio();
			testutilsWeb.test.log(Status.INFO, "Click on offline radio button");
			eventaddMethod.EnterVenue();
			testutilsWeb.test.log(Status.INFO, "Enter Venue");
			eventaddMethod.ClickonFreeradioButton();
			testutilsWeb.test.log(Status.INFO, "Click on Free Radio Button");
			eventaddMethod.ClickonStartDate();
			testutilsWeb.test.log(Status.INFO, "Click on End date");
			eventaddMethod.SelectEndDAte();
			testutilsWeb.test.log(Status.INFO, "Select End Date");
			eventaddMethod.ClickonFinalCreateEventButton();
			testutilsWeb.test.log(Status.INFO, "Click on Create Button Final");
			try {
				if (eventaddMethod.VerifyEventCreatedorNot()) {
					testutilsWeb.passTestCase("User is able to Create Event");

				}

			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Create Event");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Create Event");
			// TODO: handle exception
		}
	}

	@Test(priority = 18, enabled = false)
	public void AddLanguage() throws InterruptedException, IOException {
		testutilsWeb.testCaseCreate("TC 18 : Add Language in Profile ");
		Thread.sleep(2000);
		try {
			
			langAddMethod.ClickonProfile();
			testutilsWeb.test.log(Status.INFO, "Click on Profile");
			langAddMethod.ScrollTilLanguage();
			testutilsWeb.test.log(Status.INFO, "Scroll till Language");
			langAddMethod.addNewSkillsButton();
			testutilsWeb.test.log(Status.INFO, "Add new Language");
			langAddMethod.clickonLanguageDropDown();
			testutilsWeb.test.log(Status.INFO, "Click on Language Dropdown");
			langAddMethod.SelectFirstLanguage();
			testutilsWeb.test.log(Status.INFO, "Select First Language");
			langAddMethod.SelectBegineerradio();
			testutilsWeb.test.log(Status.INFO, "Select Begineer radio Button");
			langAddMethod.ClickonReadingRadioButton();
			testutilsWeb.test.log(Status.INFO, "Select Reading radio Button");
			langAddMethod.ClickonWritingRadioButton();
			testutilsWeb.test.log(Status.INFO, "Select Writing radio Button");
			langAddMethod.ClickonSpeakingRadioButton();
			testutilsWeb.test.log(Status.INFO, "Select Speaking radio Button");
			langAddMethod.ClickonAddLAngButton();
			testutilsWeb.test.log(Status.INFO, "Click on Add Language Button");
			langAddMethod.ClickonLangugaesTab();
			testutilsWeb.test.log(Status.INFO, "Click on Langague tab");
			langAddMethod.scrolltillfirstLang();
			testutilsWeb.test.log(Status.INFO, "Scroll Till first Language");
			Thread.sleep(3000);
			try {
				if (langAddMethod.VerifyLanguageAddedorNot()) {
					testutilsWeb.passTestCase("User is able to Add Language in profile");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Add Language in profile ");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Add Language in profile ");
		}
	}

	@Test(priority = 19, enabled = false)
	public void addInterest() throws InterruptedException, IOException
	{
		testutilsWeb.testCaseCreate("TC 19 : Add Interests in Profile");
		Thread.sleep(2000);
		try {
			interestAddMethod.ClickonProfile();
			testutilsWeb.test.log(Status.INFO, "Click on Profile");
			interestAddMethod.ScrollTilAbout();
			testutilsWeb.test.log(Status.INFO, "Scroll till about");
			interestAddMethod.ClickonAddnewInt();
			testutilsWeb.test.log(Status.INFO, "Click on Add new Interests");
			interestAddMethod.enterInterest();
			testutilsWeb.test.log(Status.INFO, "Enter Interest");
			interestAddMethod.ClickonSubmitButton();
			testutilsWeb.test.log(Status.INFO, "Click on Submit button");
			interestAddMethod.ClickonInterest();
			testutilsWeb.test.log(Status.INFO, "Click on Interest Button");
			interestAddMethod.verifygettext();
			testutilsWeb.test.log(Status.INFO, "Gettext of Entered Interest");
			Thread.sleep(3000);
			
			
			
			
			
			
			try {
				if (interestAddMethod.VerifyBothString()) {
					testutilsWeb.passTestCase("User is able to Add Interests in profile");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				testutilsWeb.failTestCase("User is not able to Add Interests in profile");
				// TODO: handle exception
			}
		} catch (Exception e) {
			e.printStackTrace();
			testutilsWeb.failTestCase("User is not able to Add Interests in profile");
			// TODO: handle exception
		}
	}
	
	@AfterTest
	public void teardown() {
		testutilsWeb.ExtentFlush();
//			driver.quit();
		TestBaseClassWeb.driver.quit();
	}
}
