package Testngscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class fetchdata {
@Test
public void getdata() throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./excel/sheet.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	book.getSheet(null);
}
}
