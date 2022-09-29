package day30_excel_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Grade {

	public static void main(String[] args) throws IOException {

		File file = new File("./src/day30_excel_automation/Book4.xlsx");

		FileInputStream input = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(input);

		XSSFSheet sheet = book.getSheet("Sheet1");

		int numOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numOfRows);

		for (int row = 1; row < numOfRows; row++) {
			String inClass = sheet.getRow(row).getCell(0).toString();
//			String grade = sheet.getRow(row).getCell(1).toString();
//			int grade = (int)Double.parseDouble(grade);

			int grade = (int) sheet.getRow(row).getCell(1).getNumericCellValue();

			XSSFCell cell = sheet.getRow(row).getCell(2);

			if (cell == null) {
				cell = sheet.getRow(row).createCell(2);
			}

			if (inClass.equals("TRUE") && grade >= 85) {
				cell.setCellValue("Pass");
			} else if (inClass.equals("TRUE") && grade <= 85) {
				cell.setCellValue("Fail");
			} else if (inClass.equals("FALSE") && grade > 80) {
				cell.setCellValue("Pass");
			} else if (inClass.equals("FALSE") && grade < 80) {
				cell.setCellValue("Fail");
			}
		}

		FileOutputStream output = new FileOutputStream(file);
		book.write(output);

		input.close();
		output.close();
		book.close();
	}

}