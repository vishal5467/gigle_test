package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.CategoryPage;
import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC03 extends CommonPage{

	
	CategoryPage categoryPage= new CategoryPage();
	SearchResPage searchResPage= new SearchResPage();
	@Test
	public void testTC03() throws Throwable{
		searchForProduct("clothes");
	}
}
