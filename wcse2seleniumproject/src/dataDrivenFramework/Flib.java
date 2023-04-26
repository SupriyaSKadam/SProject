package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	   //To store generic reusable method
		
		public String readExcelData(String filePath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
		
		{
		  FileInputStream fis=new FileInputStream(filePath);	//To provide path of excel file
		  Workbook wb = WorkbookFactory.create(fis);            //To get into excel file 
		  Sheet sheet = wb.getSheet(sheetName);                 //To get into sheet
		  Row row = sheet.getRow(rowCount);                     //To get row count
		  Cell cell = row.getCell(cellCount);                   //To get cell count
		  String data = cell.getStringCellValue();              //To get data from the cell
		  return data;                                          //To read single data from the excel file
		}
		
		//To get row count
		
		public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
		    
			int rc = sheet.getLastRowNum();
			return rc;
		}
		
		//To write data in excel
		
		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}
	}

