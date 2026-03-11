package com.automationexercise.testcases;
import org.testng.annotations.Test;
import Base.BaseClass;
import utils.ReportGenerator;
import com.automationexercise.pages.*; 

import org.testng.Assert;
public class TC1_RegisterUser extends BaseClass{

	    @Test()
	    public void RegisterUser() throws InterruptedException { 
	    	 homepage home = new homepage(driver, wait);
		     LoginSignupPage loginSignup = new LoginSignupPage(driver, wait);
		     RegistrationPage registration = new RegistrationPage(driver, wait);
		     AccountCreatedPage created = new AccountCreatedPage(driver);
		     UserHomePage userHome = new UserHomePage(driver, wait);
		     AccountDeletedPage accountdelpage =new AccountDeletedPage(driver,wait);
		     ReportGenerator.startTest("TC1_User Registration");
		     
		     //Navigate to url
	         home.open("https://automationexercise.com");
	         // Verify that home page is visible successfully
	         Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
	         //Click on 'Signup / Login' button
	         home.clickSignupLogin();
	         //Verify 'New User Signup!' 
	         Assert.assertTrue(loginSignup.isNewUserSignupVisible(), "new user signup is visible");
	         //Enter details for signup
	         loginSignup.enterSignupName("BhavyaSree");
	         loginSignup.enterSignupEmail("bhavyav@gmail.com");
	         loginSignup.clickSignupButton();
             //Verification of AccountInformation
	         Assert.assertTrue(registration.isEnterAccountInfoVisible(), "Account Information is not visible");
	         //Enter details for registration
	         registration.enterPassword("Bhavya123");
	         registration.selectDOB("15", "September", "2002");
	         registration.toggleNewsletter();
	         registration.toggleOptin();
	         registration.enterAddressDetails("Bhavya", "Sree", "Visakhapatnam", "AndhraPradesh", "Vizag", "530046", "7989710535");
	         registration.clickCreateAccount();
             //Verification of Account Creation
	         Assert.assertTrue(created.isAccountCreatedVisible(), "Account Created is not visible");
	         created.clickContinue();
	         
	         Assert.assertTrue(userHome.verifyLoggedIn(),"Logged in as username is not visible");
	         // Delete account
	         userHome.clickDeleteAccount();
	         Assert.assertTrue(accountdelpage.verifyUserDel(), "user account is not deleted");
	         accountdelpage.clickContinueBtn();
	         ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "user is successfully registered");
	         ReportGenerator.endTest();   
	    }
	    }




