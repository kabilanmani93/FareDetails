package testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import factory.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import dataProvider.ReportDataProvider;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ListPage;
import pages.MakeMyTrip;
import utility.Helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SearchFareAndPrint extends TestBase
{
	 ExtentHtmlReporter htmlreports;
	 ExtentReporter report;
	 ExtentTest Extent_logger;	
	
	WebDriver driver;
	WebDriverWait wait;
	//ExtentReporter Extent_Report;
	//ExtentTest Extent_logger;
	
	static Logger logger = Logger.getLogger(SearchFareAndPrint.class);
	static String log4jpath = config.getLog4jPath();


	
	@BeforeClass
	public void setUP() throws IOException
	{
		//report = new ExtentReports("./Reports/LoginPageReport.html",true);
		//logger = report.startTest("Verify Login Page","This Page will verify the Profile img after login");
		PropertyConfigurator.configure(log4jpath);
	    logger.info("Log4j Faredetails");


		
		Extent_logger = DataProviderFactory.getReport().startReport("MakeMyTrip", "Shall capture the fare details");
						
		driver = BrowserFactory.getBrowser("chrome");		
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
		
			
		Extent_logger.log(Status.INFO,"Application is up an running");
		String Path = Helper.captureScreenshot(driver, "Setup");
		Extent_logger.log(Status.PASS,"sc", MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
		
		
		//log4j
		logger.debug("Tetst Log 4j");
	}
	
	@Test
	public void EnterDetails()
	{
		MakeMyTrip mtp = PageFactory.initElements(driver, MakeMyTrip.class);
		String Fromcity = DataProviderFactory.getExcel().getData("InputParameter", 1, 0);
		String Tocity = DataProviderFactory.getExcel().getData("InputParameter", 1, 1);
		String DepartureDate = DataProviderFactory.getExcel().getData("InputParameter", 1, 2);
		String ReturnDate = DataProviderFactory.getExcel().getData("InputParameter", 1, 3);
		
		logger.info(Fromcity);
		mtp.selectFromCity(Fromcity);
		mtp.selectToCity(Tocity);
		mtp.selectDepartureDate();
		mtp.selectReturnDate();
		mtp.search();
		
		
		ListPage FaresList = PageFactory.initElements(driver, ListPage.class);
		HashMap<String, List<ListPage.FareDetails>> map = new HashMap<String, List<ListPage.FareDetails>>();
		
		//Departure List
		map = FaresList.Fetch_Depature_FlightFares();
		for (Entry<String, List<ListPage.FareDetails>> entry : map.entrySet())
        {
            String key = entry.getKey();
            List<ListPage.FareDetails> values = entry.getValue();
            System.out.println("Key = " + key + " , " + "Values = " + values + "n");
            
        }
		
		//sort by lowest Fare and get that value
		
		//Return List	
		//Extent_logger.log(LogStatus.INFO,"Support Role Page to be displayed");
		Extent_logger.log(Status.INFO,"Support Role Page to be displayed");
				
	}
	
	@AfterMethod
	public void logScreenShot(ITestResult result) throws IOException
	{
		String Path = Helper.captureScreenshot(driver, result.getName());
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Extent_logger.log(Status.FAIL, (Markup) Extent_logger.addScreenCaptureFromPath(Path));
			Extent_logger.log(Status.FAIL,"sc", MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
		}
		else
		{
			Extent_logger.log(Status.PASS,"sc", MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
			//Extent_logger.log(Status.PASS, (Markup) Extent_logger.addScreenCaptureFromPath(Path));
		}
	}
		
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
		ReportDataProvider.endReport();
		
		//report.endTest(logger);
		//report.flush();	
	}
	
	
}
