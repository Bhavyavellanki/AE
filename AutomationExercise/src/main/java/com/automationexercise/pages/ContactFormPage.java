package com.automationexercise.pages;

import java.nio.file.Paths;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactFormPage {
	    WebDriver driver;
	    WebDriverWait wait;
	    WebElement Name,email,subject, message, submit, successMsg, home ;

	    public ContactFormPage(WebDriver driver, WebDriverWait wait) {
	        this.driver = driver;
	        this.wait = wait;
	    } 
	    
	    public boolean isGetInTouchVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='contact-form']//h2")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
        } 
	    
	    public void enterDetails(String name, String mail, String sub, String msg)
        {

        Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
        Name.clear(); 
        Name.sendKeys(name);

        email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        email.clear(); 
        email.sendKeys(mail);

        subject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("subject")));
        subject.clear(); 
        subject.sendKeys(sub);

        message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        message.clear();
        message.sendKeys(msg);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("upload_file"))).sendKeys(Paths.get("C:\\Users\\VE20587041\\eclipse-workspace\\AutomationExercise\\Upload.text").toAbsolutePath().toString());
       } 
	   
	    public void submitDetails() {
	        submit = wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
	        submit.click(); 
	        Alert alert = driver.switchTo().alert();
			alert.accept();
	    }
	   public String successMessage() {
		   successMsg =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='status alert alert-success']")));
		   return successMsg.getText();
	   }
	   public void clickHome() {
	       home = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-success']")));
	       home.click(); 
	   }
}