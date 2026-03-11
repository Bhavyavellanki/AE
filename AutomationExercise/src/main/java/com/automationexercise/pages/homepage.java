package com.automationexercise.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class homepage {

	    WebDriver driver;
        WebDriverWait wait;
	    WebElement signupLoginLink, contactus, testcases, products, subscription, subscribemail, subscribebtn;

	    public homepage(WebDriver driver, WebDriverWait wait) {
	        this.driver = driver;
	        this.wait= wait;
	    }


		public void open(String url) {
	        driver.get(url);
	        driver.manage().window().maximize();
	    }

        public boolean isHomeVisible() {
        try {
        	return true;
        } catch (TimeoutException e) {
            return false;
        }
        }

	    public void clickSignupLogin() {
	    signupLoginLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']")));
	    signupLoginLink.click();
	    // Optional: confirm navigation
	    wait.until(ExpectedConditions.urlContains("/login"));
	    } 
	    public void clickContactform() { 
	    contactus =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/contact_us']")));
	    contactus.click();
	    } 
	  
	    public void clicktestcases() {
	    	testcases = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/test_cases']")));
	    	testcases.click();
	    	wait.until(ExpectedConditions.urlContains("/test_cases"));
	    } 
	    
	    public void clickproducts() {
	    	products =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/products']")));
	    	products.click();
	    	wait.until(ExpectedConditions.urlContains("/products"));
	    } 
	    public String subscription() {
			subscription =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='single-widget']/h2")));
			return subscription.getText();
		   } 
	    public void subscribemail(String mail) {
	    	subscribemail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("susbscribe_email")));
	    	subscribemail.sendKeys(mail);
	    }
	    public void clicksubscribe() {
	    	subscribebtn =wait.until(ExpectedConditions.elementToBeClickable(By.id("subscribe")));
	    	subscribebtn.click();
	    }  
	    public String successsubscribe() {
			subscription =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-subscribe")));
			return subscription.getText();
		   } 
	} 

