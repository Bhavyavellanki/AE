package com.automationexercise.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.pages.*;
import Base.BaseClass;
import utils.ReportGenerator;

public class TC8_VerifyProductsPage extends BaseClass {
	@Test()
	public void verifyProductsPage() {
    	homepage home = new homepage(driver, wait);
    	ProductsPage products = new ProductsPage(driver, wait);
    	ProductDetailsPage productdetail = new ProductDetailsPage(driver);
    	ReportGenerator.startTest("TC8_ProductsPageVerification");
    	//Navigate to url
    	home.open("https://automationexercise.com/");
        // Verify that home page is visible successfully
        Assert.assertTrue(home.isHomeVisible(), "Home page should be visible.");
        home.clickproducts();
        //user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(driver.getCurrentUrl().contains("/products"), "user is not navigated to ALL PRODUCTS page");
        products.clickViewProduct();
        Assert.assertTrue(driver.getCurrentUrl().contains("/product_details/1"), "user is not navigated to product detail page"); 
		//Verification of product details
		Assert.assertTrue(productdetail.verifyFirstProductDetails()[0]);
		Assert.assertTrue(productdetail.verifyFirstProductDetails()[1]);
		Assert.assertTrue(productdetail.verifyFirstProductDetails()[2]);
		Assert.assertTrue(productdetail.verifyFirstProductDetails()[3]);
		Assert.assertTrue(productdetail.verifyFirstProductDetails()[4]);
		Assert.assertTrue(productdetail.verifyFirstProductDetails()[5]);
		ReportGenerator.logger.get().log(com.relevantcodes.extentreports.LogStatus.INFO, "Products page verified");
		ReportGenerator.endTest();

}
}
