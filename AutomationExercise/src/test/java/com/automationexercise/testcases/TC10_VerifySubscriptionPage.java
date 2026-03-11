package com.automationexercise.testcases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.homepage;
import Base.BaseClass;
import utils.ReportGenerator;


public class TC10_VerifySubscriptionPage extends BaseClass{
	
  @Test
  public void VerifySubscription() throws InterruptedException { 
	  homepage home = new homepage(driver, wait);
	  ReportGenerator.startTest("TC10_Verify Subscription");
	  
	  //Navigate to url 
      home.open("https://automationexercise.com/");
      // Verify that home page is visible successfully
      Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
      //Verify text 'SUBSCRIPTION'
      Assert.assertEquals(home.subscription(), "SUBSCRIPTION"); 
      home.subscribemail("bhavyav@gmail.com");
      home.clicksubscribe();
      //Verify success message 
      Assert.assertEquals(home.successsubscribe(), "You have been successfully subscribed!");
      ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "subscription page verified");
      ReportGenerator.endTest(); 
  }
}