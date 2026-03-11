package com.automationexercise.testcases;

import org.testng.Assert;
import Base.BaseClass;
import utils.ReportGenerator;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;

public class TC2_ValidLogin extends BaseClass {
	  
	    @Test()
	    public void loginValid() { 
	    	homepage home = new homepage(driver, wait);
	        LoginSignupPage loginSignup = new LoginSignupPage(driver, wait);
	        UserHomePage userhome = new UserHomePage(driver, wait);
	        ReportGenerator.startTest("TC2_Verify login");
	        //Navigate to url
	        home.open("https://automationexercise.com/");
	        // Verify that home page is visible successfully
	        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
	        home.clickSignupLogin();
            //Enter details for login
	        loginSignup.enterLoginMail("bhavyavellanki@gmail.com");
	        loginSignup.enterPassword("Bhavya123.");
	        loginSignup.clickLogin(); 
	        Assert.assertTrue(userhome.verifyLoggedIn(),"Logged in as username is not visible");
	        ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "login with valid details");
	        ReportGenerator.endTest();        
} 
}
