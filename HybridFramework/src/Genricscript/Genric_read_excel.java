package Genricscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Genric_read_excel {
	@Test
	public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
	 String val="";
	 try {
		  FileInputStream fis=new FileInputStream("./excel/seleniumtestdata.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		  val=c.getStringCellValue();
		 }
	 catch(Exception e)
	 {
		 System.out.println("unable to fetch data");
	 }
	 return val;

}
}

