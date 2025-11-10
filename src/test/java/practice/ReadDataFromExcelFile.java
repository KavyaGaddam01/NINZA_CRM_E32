package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//Create a java representation object of physical file
		FileInputStream fis=new FileInputStream("C:\\Users\\QSP\\Documents\\NINZA_CRM_E32.xlsx");
		
		//Open the excel in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//get control of the sheet
		Sheet sh = wb.getSheet("Campaign");
		
		//get the control of the row
		Row r = sh.getRow(1);
		
		//get Control of cell
		Cell c = r.getCell(2);
		
		//read the data
		String campaignName = c.getStringCellValue();	
		System.out.println(campaignName);
		
		String targetSize = wb.getSheet("Campaign").getRow(1).getCell(3).getStringCellValue();
		System.out.println(targetSize);
		
		//Close the excel
		wb.close();
		
	}

}
