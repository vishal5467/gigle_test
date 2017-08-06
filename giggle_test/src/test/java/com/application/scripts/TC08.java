package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC08 extends SearchResPage
{

	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	CommonPage cp = new CommonPage();
	
	@Test
	public void testTC08() throws Throwable
	{
		type(cp.txt_SearchBox, reader.getCellData("sheet2", "SearchTerm", 2), "Search Textbox");
		click(cp.btn_SearchBox, "Search Button");
		verifyText(searchpageheading, "TOYS + BOOKS", "Search Results Heading");
	}
	
	
	
	
	
	
}
