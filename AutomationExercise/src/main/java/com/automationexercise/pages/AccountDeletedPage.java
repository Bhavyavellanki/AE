package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountDeletedPage {
	 WebDriver driver;
     WebDriverWait wait;
     WebElement deleteaccnt;
     
	public AccountDeletedPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	public boolean verifyUserDel() {

		try {
			
			deleteaccnt= driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
			return deleteaccnt.isDisplayed();
		} catch (Exception e) {
			System.out.println("Account Deleted TEXT is NOT visbile");
			return false;
		}
	}
	public void clickContinueBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
		driver.findElement(By.xpath("//a[@data-qa ='continue-button']")).click();
	}
}
