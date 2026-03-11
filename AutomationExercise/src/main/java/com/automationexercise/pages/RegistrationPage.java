package com.automationexercise.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class RegistrationPage {
 
	    WebDriver driver;
	    WebDriverWait wait;
	    WebElement password, day, month, year, newsletter, optin;
	    WebElement firstName, lastName, address1, state, city, zipcode, mobile;
	    WebElement createAccountButton;

	    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
	        this.driver = driver;
	        this.wait = wait;
	    }
	    
        public boolean isEnterAccountInfoVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Account Information')]")));
            return true;
        } 
        catch (TimeoutException e) {
            return false;
        }
        }

		public void enterPassword(String pwd) {
	        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	        password.sendKeys(pwd);
	    } 

	    public void selectDOB(String dayValue, String monthText, String yearValue) {
	        day = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("days")));
	        new Select(day).selectByValue(dayValue);

	        month = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("months")));
	        new Select(month).selectByVisibleText(monthText);

	        year = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("years")));
	        new Select(year).selectByValue(yearValue);
	    }

	    public void toggleNewsletter() {
	        newsletter = wait.until(ExpectedConditions.elementToBeClickable(By.id("newsletter")));
	        if (!newsletter.isSelected()) {
	            newsletter.click();
	        }
	    }

	    public void toggleOptin() {
	        optin = wait.until(ExpectedConditions.elementToBeClickable(By.id("optin")));
	        if (!optin.isSelected()) {
	            optin.click();
	        }
	    }

	    public void enterAddressDetails(String fName, String lName, String addr, String st, String cty, String zip, String phone) {

	        firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
	        firstName.clear(); firstName.sendKeys(fName);

	        lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last_name")));
	        lastName.clear(); lastName.sendKeys(lName);

	        address1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address1")));
	        address1.clear(); address1.sendKeys(addr);

	        state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("state")));
	        state.clear(); state.sendKeys(st);

	        city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
	        city.clear(); city.sendKeys(cty);

	        zipcode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zipcode")));
	        zipcode.clear(); zipcode.sendKeys(zip);

	        mobile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mobile_number")));
	        mobile.clear(); mobile.sendKeys(phone);
	    }

	    public void clickCreateAccount() throws InterruptedException {
	       // createAccountButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit' and @data-qa='create-account']")));
	       // wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
	        Thread.sleep(3000);
	    	createAccountButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit' and @data-qa='create-account']")));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center', inline:'center'});", createAccountButton);
	       wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
	       // Wait for the "Continue" button on Account Created page
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-qa='continue-button']")));
	}
	
}
