package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericutilities.ExcelFileUtility;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		FileInputStream fis=new FileInputStream("C:\\Users\\QSP\\Documents\\NINZA_CRM_E32.xlsx");
//		
//		Workbook wb = WorkbookFactory.create(fis);
//		
//		Sheet sh = wb.getSheet("practice");
//		
//		int rowCount = sh.getLastRowNum();
		
		ExcelFileUtility eLib=new ExcelFileUtility();
		int rowCount = eLib.getRowCount("practice");
		System.out.println(rowCount);
		
		for(int row=1;row<=rowCount;row++) {
//			String data=sh.getRow(row).getCell(0).getStringCellValue();
			String data = eLib.readDataFromExcelFile("practice", row, 0);
			System.out.println(data);
		}
		
		
	}

}


