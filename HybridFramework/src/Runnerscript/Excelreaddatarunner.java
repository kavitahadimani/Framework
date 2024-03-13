package Runnerscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genricscript.Genric_read_excel;
import Genricscript.baseclass;
import pomscript.pommainclass;

public class Excelreaddatarunner extends baseclass{
	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		pommainclass p=new pommainclass(driver);
		Thread.sleep(2000);
		p.passData(Genric_read_excel.getdata("sheet1", 0, 0));
		Thread.sleep(2000);
		p.passData1(Genric_read_excel.getdata("sheet1", 1, 0));
		Thread.sleep(2000);
		p.click();
		Thread.sleep(2000);
	}
   

}


