package com.craftsvilla.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompage.HomePage;
import com.craftsvilla.pompage.SignInPage;

public class SignInModuleScripts extends BaseTest
{
	SignInPage sp =null;
	HomePage hp = null;
	@Test
	public void tc_01_signInWithUserCredentials()
	{
		try
		{
			sp = new SignInPage(driver);
			hp = new HomePage(driver);
			
			String[][] credentials = ReadExcel.getData(INPUT_FILE, "Sheet1");
			for(int i =1; i<credentials.length; i++)
			{
				String email = credentials[i][0];
				String password = credentials[i][1];
				
				
				hp.clickOnSignInLink();
				sp.setEmail(email);
				sp.clickOnContinue();
				sp.enterPassword(password);
				sp.clickOnloginButton();
				hp.gotoAccount();
				hp.clickOnlogout();
				Reporter.log("");
			}
			
		}
		catch(Exception e)
		{
			Reporter.log("");
		}
		
	}

}
