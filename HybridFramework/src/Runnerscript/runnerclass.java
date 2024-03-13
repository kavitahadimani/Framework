package Runnerscript;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Genricscript.baseclass;
import pomscript.pommainclass;

public class runnerclass extends baseclass{
	@Test(dataProvider = "test1")
	public void login(String un,String pwd) throws InterruptedException, EncryptedDocumentException, IOException
	{
		pommainclass p=new pommainclass(driver);
		Thread.sleep(2000);
		p.passData(un);
		Thread.sleep(2000);
		p.passData1(pwd);
		Thread.sleep(2000);
		p.click();
		Thread.sleep(2000);
	}
   @DataProvider(name = "test1")
   public Object[][] createData1() {
   return new Object[][] {
   { "Kavita", "abc123" },
   { "Anne", "anne123"},
 };
}
}


