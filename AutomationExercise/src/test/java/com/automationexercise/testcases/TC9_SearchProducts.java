package com.automationexercise.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;
import Base.BaseClass;
import utils.ReportGenerator;

public class TC9_SearchProducts extends BaseClass {
@Test()
	public void searchProducts() {
    	homepage home = new homepage(driver, wait);
    	ProductsPage products = new ProductsPage(driver, wait);
    	SearchProductsPage searchproduct = new SearchProductsPage(driver, wait);
    	ReportGenerator.startTest("TC9_SearchProducts");
    	//Navigate to url
    	home.open("https://automationexercise.com/");
        // Verify that home page is visible successfully
        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
        home.clickproducts();
        //user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(driver.getCurrentUrl().contains("/products"), "user is not navigated to ALL PRODUCTS page");
        products.searchProduct("top");
        products.clickSearchButton();
        Assert.assertTrue(searchproduct.isSearchedProductsVisible(), "Searched products is not visible"); 
        Assert.assertTrue(driver.getCurrentUrl().contains("/products?search=top"), "products related to search are not visible");
        ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "Search functionality verified");
        ReportGenerator.endTest();
}
}