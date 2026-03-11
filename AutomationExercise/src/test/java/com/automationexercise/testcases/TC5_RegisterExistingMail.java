package com.automationexercise.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;
import Base.BaseClass;
import utils.ReportGenerator;

public class TC5_RegisterExistingMail extends BaseClass{

	    @Test()
	    public void existingRegister() {
	    	homepage home = new homepage(driver, wait);
	        LoginSignupPage loginSignup = new LoginSignupPage(driver, wait);
	        ReportGenerator.startTest("TC5_RegisterWithExistingMail");
	        //Navigate to url
	        home.open("https://automationexercise.com/");
	        // Verify that home page is visible successfully
	        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
	        home.clickSignupLogin();
            //Verification of New User Signup
	        Assert.assertTrue(loginSignup.isNewUserSignupVisible(), "new user signup is visible");
	        loginSignup.enterSignupName("Bhavya");
	        loginSignup.enterSignupEmail("bhavyavellanki@gmail.com");
	        loginSignup.clickSignupButton();  
	        //Verify error 'Email Address already exist!' is visible 
	        Assert.assertTrue(loginSignup.ExistingMail(), "error message not shown");
	        ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "Error message is shown for existing mail registration");
	        ReportGenerator.endTest();
      } 
}
