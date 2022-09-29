package day30_excel_automation;

import static utilities.ExcelUtils.getCellData;
import static utilities.ExcelUtils.getUsedRowsCount;
import static utilities.ExcelUtils.openExcelFile;
import static utilities.ExcelUtils.setCellData;

import java.io.IOException;

public class Excel_Grade_Utils {

	public static void main(String[] args) throws IOException {

		openExcelFile("./src/day30_excel_automation/Book4.xlsx", "Sheet1");

		int numOfRows = getUsedRowsCount();
		System.out.println(numOfRows);

		for (int row = 1; row < numOfRows; row++) {
			String inClass = getCellData(row, 0);
			String grade = getCellData(row, 1);
			double gradeDouble = Double.parseDouble(grade);
			int gradeInt = (int) gradeDouble;

			if (inClass.equals("TRUE") && gradeInt >= 85) {
				setCellData("Pass", row, 2);
			} else if (inClass.equals("TRUE") && gradeInt < 85) {
				setCellData("Fail", row, 2);
			} else if (inClass.equals("FALSE") && gradeInt >= 80) {
				setCellData("Pass", row, 2);
			} else if (inClass.equals("FALSE") && gradeInt < 80) {
				setCellData("Fail", row, 2);
			}
		}
	}
}