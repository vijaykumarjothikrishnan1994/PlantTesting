package Configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Test");
		
		
		System.setProperty("log4j.configurationFile","E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Planittetsing\\src\\main\\java\\DriverLocation\\log4j-core-2.17.1.jar");

		Logger log = LogManager.getLogger(TestClass.class.getName());
		
		File file=new File("E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\TestAutomation_All_Scenarios\\StoreData\\Master.xlsx");
		FileInputStream fi=new FileInputStream(file);
		
		
		
		XSSFWorkbook xb=new XSSFWorkbook(fi);

	}

}
