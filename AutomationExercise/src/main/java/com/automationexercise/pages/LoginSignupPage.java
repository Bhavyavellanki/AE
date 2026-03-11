package com.automationexercise.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class LoginSignupPage { 

	    WebDriver driver;
	    WebDriverWait wait;
	    WebElement nameField, loginemail, signupemail,pwd, signupButton,loginButton;

	    public LoginSignupPage(WebDriver driver, WebDriverWait wait) {
	        this.driver = driver;
	        this.wait = wait;
	    }
	    
        public boolean isNewUserSignupVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'New User')]")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
        }      

        public boolean isLoginVisible() {
        try {
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //h2[contains(text(),'Login to your account')]")));
             return true;
            } catch (TimeoutException e) {
              return false;
            }
            } 

	    public void enterSignupName(String name) {
	        nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")) );
	        nameField.clear();
	        nameField.sendKeys(name);
	    }

	    public void enterSignupEmail(String email) {
	        signupemail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='signup-email']")));
	        signupemail.clear();
	        signupemail.sendKeys(email);
	    }

	    public void clickSignupButton() {
	        signupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa='signup-button']")));
	        signupButton.click();
	    }
	    
	    public void enterLoginMail(String mail) {
	        loginemail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-email']")));
	        loginemail.clear();
	        loginemail.sendKeys(mail);
	    } 
	    
	    public void enterPassword(String password) {
	        pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	        pwd.clear();
	        pwd.sendKeys(password);
	    }
	    
	    public void clickLogin() {
	        loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa='login-button']")));
	        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
	        loginButton.click();
	    }
	    public boolean InvalidLogin() {
	        try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'incorrect')]")));
	            return true;
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }  
	    
	    public boolean ExistingMail() {
	        try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Email Address already exist')]")));
	            return true;
	        } catch (TimeoutException e) {
	            return false;
	        }
	    } 
	    
	    
}