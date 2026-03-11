package com.automationexercise.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;
import Base.BaseClass;
import utils.ReportGenerator;

public class TC6_Contactus extends BaseClass{
	
	@Test()
    public void contactus() {
    	homepage home = new homepage(driver, wait);
        ContactFormPage contact = new ContactFormPage(driver, wait);
        ReportGenerator.startTest("TC6_ContactUsForm");
        //Navigate to url
        home.open("https://automationexercise.com/");
        // Verify that home page is visible successfully
        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
        home.clickContactform(); 
        //Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(contact.isGetInTouchVisible(), "Get in Touch is not visible"); 
        contact.enterDetails("Bhavya", "bhavya@gmail.com", "Test subject", "test message");
        contact.submitDetails(); 
        //Verify success message 
        Assert.assertEquals(contact.successMessage(),"Success! Your details have been submitted successfully.");
        contact.clickHome();
        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
        ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "Contact us form verified");
        ReportGenerator.endTest();
}
}