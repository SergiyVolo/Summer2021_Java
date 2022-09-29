package day30_excel_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {

	public static void main(String[] args) throws IOException {

		// specifying where the excel is located at
		File file = new File("./src/day30_excel_automation/Book1.xlsx");

		// we are opening the input stream
		FileInputStream input = new FileInputStream(file);

		// Connecting to the excel workbook
		XSSFWorkbook book = new XSSFWorkbook(input);

		// Connecting to a particular sheet within the workbook
		XSSFSheet sheet = book.getSheet("Sheet1");

		// getting the number of utilized rows
		int numOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of utilized rows: " + numOfRows);

		System.out.println("Ryan's dept: " + sheet.getRow(1).getCell(2)); // IT

		// Please print Employee2
		System.out.println(sheet.getRow(2).getCell(0));

		String name = sheet.getRow(2).getCell(1).toString();
		System.out.println("Employee2 name: " + name);

		// Please print:
		// Ryan -> IT
		// PETE -> IT
		// Britney -> C-suite

		for (int row = 1; row < numOfRows; row++) {
			String firstName = sheet.getRow(row).getCell(1).toString();
			String department = sheet.getRow(row).getCell(2).toString();

			System.out.println(firstName + " --> " + department);
		}

		input.close();
		book.close();
	}
}