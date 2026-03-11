package com.automationexercise.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;
import Base.BaseClass;
import utils.ReportGenerator;


public class TC7_VerifyTestCasesPage extends BaseClass {
 
	@Test()
    public void verifyTestCases() {
    	homepage home = new homepage(driver, wait);
    	ReportGenerator.startTest("TC7_VerifyTestCasesPage");
    	//Navigate to url
    	home.open("https://automationexercise.com/");
        // Verify that home page is visible successfully
        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
        home.clicktestcases();
        //Verify user is navigated to test cases page successfully
        Assert.assertTrue(driver.getCurrentUrl().contains("/test_cases"), "URL should contain /test_cases");
        ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "Testcases page verified");
        ReportGenerator.endTest();
}
} 