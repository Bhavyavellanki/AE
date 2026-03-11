package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class ReportGenerator  {
	public static ExtentReports extent;
	WebDriver driver;
    public static ThreadLocal<ExtentTest> logger = new ThreadLocal<>();

    static
    {
        extent = new ExtentReports("C:\\Users\\VE20587041\\eclipse-workspace\\AutomationExercise\\ExtentReports\\ExtentReports.html", true);
    }

    public static void startTest(String testName) 
    {
        logger.set(extent.startTest(testName));
    }
    public static void endTest() 
    {
        extent.endTest(logger.get());
        extent.flush();
    }
    @AfterSuite
    public void closeReport() 
    {
    	extent.close(); 
    }
}
