package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;



public class GeorgetteSareesPage extends BasePage
{
	@FindBy(xpath="//img[contains(@src,'1525428844-Craftsvilla_1.jpg')]")
	private WebElement product_1525428844;
	
	@FindBy(xpath="//img[contains(@src,'1530523260-Craftsvilla_1.jpg')]")
	private WebElement product_1530523260;
	
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement priceOrder;
	
	
	public GeorgetteSareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void goToProduct1525428844()
	{
		verifyElementPresent(product_1525428844);
		product_1525428844.click();
	}
	
	public void goToProduct1538760092()
	{
		verifyElementPresent(product_1530523260);
		product_1530523260.click();
		logger.info("clicked on the product");
	}
	
	public void changePriceOrder()
	{
		verifyElementPresent(priceOrder);
		priceOrder.click();
	}
}

