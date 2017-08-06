package com.application.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectRepository.CategoryPage;
import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC05 extends CommonPage{

	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	CategoryPage categoryPage= new CategoryPage();
	SearchResPage searchResPage= new SearchResPage();
	@Test
	public void testTC02() throws Throwable{
		searchForProduct("clothes");

		/*searchForProduct(reader.getCellData("Sheet2", "SearchTerm", 2));
		categoryPage.clickCategory(reader.getCellData("Sheet2", "Category", 2));
		searchResPage.clickFirstProduct();
		searchResPage.clickAddToCart();
		searchResPage.clickCheckout();
		Assert.assertTrue(searchResPage.verifyProduct());*/

	}
}
