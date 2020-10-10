package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SignInPage extends BasePage
{
	
	@FindBy(id="facebookSignInBtn")
	private WebElement facebookButton;
	
	@FindBy(id="googleSignInBtn")
	private WebElement googleButton;
	
	@FindBy(id="emailId")
	private WebElement emailId;
	
	@FindBy(id="continueBtn")
	private WebElement continueButton;
	
	@FindBy(id="js-password")
	private WebElement enterPassword;
	
	@FindBy(id="loginCheck")
	private WebElement loginButton;
	
	@FindBy(id="set-password")
	private WebElement setpassword;
	
	@FindBy(id="userRegister")
	private WebElement registerButton;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnFaceBookButton()
	{
		try
		{
			verifyElementPresent(facebookButton);
			facebookButton.click();
			logger.info("Clicked on "+facebookButton);
		}
		catch(Exception e)
		{
			logger.error("Unable to click on "+facebookButton+e);
		}
		
	}
	
	public void clickOnGoogleButton()
	{
		try
		{
			verifyElementPresent(googleButton);
			googleButton.click();
			logger.info("Clicked on "+googleButton);
		}
		catch(Exception e)
		{
			logger.error("Unable to click on "+googleButton+e);
		}
	}
	
	public void setEmail(String email)
	{
		try
		{
			verifyElementPresent(emailId);
			emailId.sendKeys(email);
			logger.info(email+" has been set to "+emailId);
		}
		catch (Exception e)
		{
			logger.error("unable to set"+email +" to "+emailId+e);
		}
	}
	
	public void clickOnContinue()
	{
		try
		{
			verifyElementPresent(continueButton);
			continueButton.click();
			logger.info("Clicked successfully on "+continueButton);
		}
		catch(Exception e)
		{
			logger.error("unable to click on "+continueButton+e);
		}
	}

	public void enterPassword(String password)
	{
		try
			{
				verifyElementPresent(enterPassword);
				enterPassword.sendKeys(password);
				logger.info(password+" has been set to "+enterPassword);
			}
			catch (Exception e)
			{
				logger.error("unable to set"+password +" to "+enterPassword+e);
			}
	}
	
	
	public void clickOnloginButton()
	{
		try
		{
			verifyElementPresent(loginButton);
			loginButton.click();
			logger.info("clicked succesdfully on "+loginButton);
		}
		catch(Exception e)
		{
			logger.error("Unable to click on "+loginButton+e);
		}
	}
	
	public boolean checkInvalidMessage()
	{
		return true;
	}
	
	
}
