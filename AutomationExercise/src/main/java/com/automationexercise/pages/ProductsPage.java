package com.automationexercise.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	WebDriver driver;
	WebDriverWait wait;
    WebElement viewproduct, searchproduct, searchButton, element; 
    
	public ProductsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void clickViewProduct() {
        /*viewproduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/product_details/1']")));
        viewproduct.click();*/
       element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/product_details/1']")));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
       wait.until(ExpectedConditions.elementToBeClickable(element)).click();

   }
	public void searchProduct(String product) {
		searchproduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
		searchproduct.sendKeys(product);
	} 
	
	public void clickSearchButton() {
       searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit_search")));
       searchButton.click();
   }
}
