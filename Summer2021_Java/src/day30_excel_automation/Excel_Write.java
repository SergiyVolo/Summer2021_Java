package day30_excel_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void main(String[] args) throws IOException {

		File file = new File("./src/day30_excel_automation/Book3.xlsx");

		FileInputStream input = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(input);

		XSSFSheet sheet = book.getSheet("Write");

		int numOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numOfRows);

		XSSFCell cell1 = sheet.getRow(0).getCell(0);
		System.out.println(cell1);

		XSSFCell cell2 = sheet.getRow(1).getCell(2);
		System.out.println(cell2);

	// We are creating a cell because in the view of Apache POI that particular cell
		// doesn't exist yet
//		XSSFCell cell3 = sheet.getRow(3).createCell(10);
//		String valueOfCell3 = cell3.toString();

//		XSSFCell cell3 = sheet.getRow(4).getCell(20);
//		
//		if(cell3 == null) {
//			cell3 = sheet.getRow(4).createCell(20);
//		}
//		
//		System.out.println(cell3);

		for (int row = 1; row < numOfRows; row++) {

			String action = sheet.getRow(row).getCell(0).toString();
			String bookToPrint = sheet.getRow(row).getCell(1).toString();

			XSSFCell cellToWrite = sheet.getRow(row).getCell(2);

			if (cellToWrite == null) {
				cellToWrite = sheet.getRow(row).createCell(2);
			}

			if (action.equals("Y")) {
				System.out.println(bookToPrint);
				cellToWrite.setCellValue("Pass");
			} else {
				cellToWrite.setCellValue("Fail");
			}
		}

		FileOutputStream output = new FileOutputStream(file);
		book.write(output);

		input.close();
		output.close();
		book.close();
	}
}