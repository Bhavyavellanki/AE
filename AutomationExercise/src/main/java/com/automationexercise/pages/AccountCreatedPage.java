package com.automationexercise.pages;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class AccountCreatedPage{

	    WebDriver driver;
	    WebElement continueButton;

	    public AccountCreatedPage(WebDriver driver) {
	        this.driver = driver;
	    }
        
	  
        public boolean isAccountCreatedVisible() {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Account Created')]")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
        }

		public void clickContinue() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        //continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-qa='continue-button']")) );
	        //continueButton.click();
	        
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-qa='continue-button']")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center', inline:'center'});", element);
	         wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	   }
}
