package com.automationexercise.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;
import Base.BaseClass;
import utils.ReportGenerator;
public class TC3_InvalidLogin extends BaseClass{
	  
	    @Test()
	    public void loginInvalid() {
	    	homepage home = new homepage(driver, wait);
	        LoginSignupPage loginSignup = new LoginSignupPage(driver, wait);
	        ReportGenerator.startTest("TC3_Invalid Login");
	        //Navigate to url
	        home.open("https://automationexercise.com/");
	        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
	        home.clickSignupLogin();
            Assert.assertTrue(loginSignup.isLoginVisible(), "Login to your account is not visible");
	        loginSignup.enterLoginMail("bhavyavellanki@gmail.com");
	        loginSignup.enterPassword("Bhavya13.");
	        loginSignup.clickLogin();
	        //Verification of error message
	        Assert.assertTrue(loginSignup.InvalidLogin());
	        ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "login with invalid details");
	        ReportGenerator.endTest();
}     
}
