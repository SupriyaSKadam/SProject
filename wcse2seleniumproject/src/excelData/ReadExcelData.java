package excelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		//Create object of file input stream
		FileInputStream fis = new FileInputStream("./data/test data.xlsx");//to provide path of the file
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(1);//get the desired row
		Cell cell = row.getCell(0);//get the desired col/cell
		String data = cell.getStringCellValue();//Read the data from the cell
		System.out.println(data);//Print the data
	}
}

