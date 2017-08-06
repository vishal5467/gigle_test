package com.application.scripts;



import org.testng.annotations.Test;
import com.objectRepository.LoginPage;
import com.utilities.Xls_Reader;

public class TC07 extends LoginPage
{
	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");

	
	@Test
	public void testTC07() throws Throwable
	{
		click(lnkSignIn, "Sign In");
		type(txtEmailAddress, reader.getCellData("Login", "EMAIL", 2), "Email Address");
		type(txtPassword, reader.getCellData("Login", "PASSWORD", 2), "Password");
		click(btnSignIn, "Sign In button");
		boolean blnFlag = verifyTextPresent("Invalid login or password.");
		if (blnFlag)
		{
			SuccessReport("Verify Login", "Login validation message is displayed");
		}
		else
		{
			failureReport("Verify Login", "Login validation message is not displayed");
		}
		
	}


}
