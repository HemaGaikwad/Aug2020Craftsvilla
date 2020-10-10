package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{
	
	@FindBy(linkText = "Cotton Sarees")
	private WebElement cottonSarees;
	
	@FindBy(linkText="Georgette Sarees")
	private WebElement georgetteSarees;
	
	@FindBy(linkText="Chiffon Sarees")
	private WebElement chiffonSarees;
	
	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}


	public void clickOnEmbroidedSarees()
	{
		verifyElementPresent(cottonSarees);
		cottonSarees.click();
	}
	
	public void  clickOnGeorgetteSarees()
	{
		verifyElementPresent(georgetteSarees);
		georgetteSarees.click();
	}
	
	public void clickOnChiffonSarees()
	{
		verifyElementPresent(chiffonSarees);
		chiffonSarees.click();
	}
}
