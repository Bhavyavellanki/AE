package com.automationexercise.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class UserHomePage {

	    WebDriver driver;
	    WebDriverWait wait;
	    WebElement deleteAccountLink,logout;

	    public UserHomePage(WebDriver driver, WebDriverWait wait) {
	        this.driver = driver;
	        this.wait = wait;
	    }

	    public boolean verifyLoggedIn() {
	        try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-user']/parent::a")));
	            return true;
	        } catch (TimeoutException e) {
	            return false;
	        } 
	    }
		public void clickDeleteAccount() {
	        deleteAccountLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/delete_account']")));
	        deleteAccountLink.click();    
	    }
		 
		public void clickLogout() {
	        logout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/logout']")));
	        logout.click();
	    }
	}

