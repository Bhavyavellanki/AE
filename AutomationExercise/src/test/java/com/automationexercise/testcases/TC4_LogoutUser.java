package com.automationexercise.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;
import Base.BaseClass;
import utils.ReportGenerator;

public class TC4_LogoutUser extends BaseClass {
	    @Test()
	    public void userLogout() {
	    	homepage home = new homepage(driver, wait);
	        LoginSignupPage loginSignup = new LoginSignupPage(driver, wait);
	        UserHomePage userhome = new UserHomePage(driver, wait); 
	        ReportGenerator.startTest("TC4_LogoutUser");
	        //Navigate to url
	        home.open("https://automationexercise.com/");
	        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
	        home.clickSignupLogin();
            //Verify 'Login to your account' is visible 
	        Assert.assertTrue(loginSignup.isLoginVisible(), "login to your account is visible");
	        loginSignup.enterLoginMail("bhavyavellanki@gmail.com");
	        loginSignup.enterPassword("Bhavya123.");
	        loginSignup.clickLogin(); 
	        //Verify that 'Logged in as username' is visible
	        Assert.assertTrue(userhome.verifyLoggedIn(),"user is not logged in");
	        userhome.clickLogout(); 
	        //Verify that user is navigated to login page 
	        Assert.assertTrue(loginSignup.isLoginVisible(), "login page is not visible");
	        ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "user is successfully logged out");
	        ReportGenerator.endTest();
} 
}
