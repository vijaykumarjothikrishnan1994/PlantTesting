package Configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataReaderExcel {
	
	@Test
	public static void name() throws IOException {
		
		/*
		 * System.setProperty(
		 * "log4j.configurationFile",".C:\\Users\\Vijay\\Desktop\\Selenium\\Driver\\Log4 j corelog4j2.xml"
		 * );
		 * 
		 * Logger log = LogManager.getLogger(java.util.logging.Logger.class.getName());
		 */
		
		
		File file=new File("E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\TestAutomation_All_Scenarios\\StoreData\\Master.xlsx");
		FileInputStream fi=new FileInputStream(file);
		XSSFWorkbook xb=new XSSFWorkbook();
		XSSFSheet sheet=xb.getSheet("Sheet1");
		
	int lastrownumber=	sheet.getLastRowNum();
	for(int i=0;i<=lastrownumber;i++)
	{
		XSSFRow rowno=sheet.getRow(i);
		
	int cellno=rowno.getLastCellNum();
	
	for(int j=0;j<cellno;j++)
	{
		XSSFCell cells=rowno.getCell(j);
		
		System.out.println(cells.getStringCellValue());
		cells.getStringCellValue();
	}
	System.out.println( );
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
