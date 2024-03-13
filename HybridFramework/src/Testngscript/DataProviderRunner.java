package Testngscript;

import org.testng.annotations.Test;

public class DataProviderRunner{
	@Test(dataProvider = "loginCredential",dataProviderClass = CustomDataProvider.class)
	public void loginTest(String un,String pwd)
	{
		System.out.println(un+""+pwd); 
	}

}
