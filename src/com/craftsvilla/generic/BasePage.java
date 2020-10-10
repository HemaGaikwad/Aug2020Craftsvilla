package com.craftsvilla.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	WebDriver driver=null;
	public Logger logger = Logger.getLogger(getClass());
	
	public BasePage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	//boolean verifyElementPresent(WebElement ele)
	public void  verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			logger.info("Webelement "+ ele + " found");
			//return true;
		}
		catch(Exception e)
		{
			//System.out.println(e);
			logger.error("WebElement not found : "+e);
			//return false;
		}
	}
	
	public void verifyPartialTitle(String expTitle, String partialTitle)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(partialTitle));
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			logger.info(actTitle + "and the "+ expTitle +" matched ");
		}
		catch(Exception e)
		{
			logger.error("Titles didnot match");
		}
		
	}
	
	public void verifyActualTitle(String expTitle)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(expTitle));
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			logger.info(actTitle + "and the "+ expTitle +" matched ");
		}
		catch(Exception e)
		{
			logger.error("Titles didnot match");
		}
		
	}
	
	public void mouseHover(WebElement ele)
	{
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			logger.info("mousehovered on "+ele);
		}
		catch(Exception e)
		{
			logger.error("unable to mousehover on " + ele);
		}
	}

	
}
