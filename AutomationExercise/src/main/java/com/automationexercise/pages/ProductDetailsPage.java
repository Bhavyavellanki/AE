package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;

public class ProductDetailsPage extends BaseClass {
	WebDriver driver;
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean[] verifyFirstProductDetails() {
		 
		boolean[] res = new boolean[6];
		res[0]=driver.findElement(By.xpath("//h2[text()='Blue Top']")).isDisplayed();
		res[1]=driver.findElement(By.xpath("//p[text()='Category: Women > Tops']")).isDisplayed();
		res[2]=driver.findElement(By.xpath("//span[text()='Rs. 500']")).isDisplayed();
		res[3]=driver.findElement(By.xpath("//p[text()=' In Stock']")).isDisplayed();
		res[4]=driver.findElement(By.xpath("//p[text()=' New']")).isDisplayed();
		res[5]=driver.findElement(By.xpath("//p[text()=' Polo']")).isDisplayed();
 
		return res;
	}

}
