package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.CommonPage;

public class TC06 extends CommonPage
{
	
	@Test
	public void verifyLogo() throws Throwable
	{
		//isElementPresent(imgRightStartLogo, "xpath");
		System.out.println(driver.findElement(txtWelcome).isDisplayed());
		SuccessReport("verifyText", "Successfully verified the text-" + driver.findElement(txtWelcome).getText());
	}
}
