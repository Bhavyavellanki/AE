package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProductsPage {
	WebDriver driver;
	WebDriverWait wait;
	public SearchProductsPage(WebDriver driver, WebDriverWait wait) {
		this.driver=driver;
		this.wait = wait;
	}
	public boolean isSearchedProductsVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='title text-center']")));
            return true;
        } 
        catch (TimeoutException e) {
            return false;
        }
        }
}
