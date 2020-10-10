package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConst
{
	public static WebDriver driver = null;
	public WebDriverWait wait = null;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchApplication(String browserType)
	{
		switch(browserType)
		{
			case "chrome":
				System.setProperty(CHROME_KEY,CHROME_VALUE );
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver, 20);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(APP_URL);
				break;
			
			case "firefox":
				System.setProperty(GECKO_KEY,GECKO_VALUE );
				driver = new FirefoxDriver();
				wait = new WebDriverWait(driver, 20);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(APP_URL);
				break;
				
			default:
				System.out.println("Invalid browser selection. Please choose 'Chrome' or 'firefox browser' ");
				
		}
		
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
	}

}
