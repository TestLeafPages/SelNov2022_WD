package exceldata;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {

	@Test
	public void read() throws IOException{
		
		/*
		 * Steps to read from excel
		 * 
		 * 1) Open the workbook using file name and path 
		 * 2) Go to the specific sheet (bysheet name or index) 
		 * 3) Go to the specific row (by index) 
		 * 4) Go to the specific column (by index) -- cell
		 * 5) Read the content
           
		 */
		XSSFWorkbook wb= new XSSFWorkbook("./Data/EditLead.xlsx");
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//read row count
		int rowCount = sheet.getLastRowNum();
		
		System.out.println("total no of row : "+rowCount);
		//read cell count
		int cellNum = sheet.getRow(0).getLastCellNum();
		
		System.out.println("total no of col :"+cellNum);
		
		//how read data and print in consle
		
//		XSSFRow firstdata = sheet.getRow(2);
		
//		XSSFCell cell = firstdata.getCell(2);
//		System.out.println(cell.getStringCellValue());
		
		
		for (int i = 1; i <=rowCount; i++) {
			
		XSSFRow firstdata1 = sheet.getRow(i);
		
		for (int j = 0; j < cellNum; j++) {
			XSSFCell cell2 = firstdata1.getCell(j);
			
			System.out.println(cell2.getStringCellValue());
		}
		
		}
	wb.close();
		
		}

}
