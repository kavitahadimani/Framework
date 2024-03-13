package Testngscript;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	@DataProvider(name="loginCredential")
	public Object[][]getData()
	{
	Object[][]data= {{"kavita@gmail.com","123"},{"ambika@gmail.com","456"},{"anu@gmail.com","789"}};
	return data;
	}

}
