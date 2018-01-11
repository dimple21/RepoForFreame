package myntraPom1;

import java.io.File;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromexcelforPom1 {
	public static String uname, pass;

	public static void readExcel() throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\tahir\\workspace\\myntraPom1\\datas\\dataForMyntraPom1.xlsx");

		// FileInputStream inputStream = new FileInputStream(file);

		XSSFWorkbook wbook1 = new XSSFWorkbook(file);
		XSSFSheet sheet = wbook1.getSheet("LoginData");
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		// int CellNumCount = wbook1.getLastCellNum();

		for (int i = 0; i < rowCount + 1; i++) {
			XSSFRow row = sheet.getRow(i);
			uname = row.getCell(0).getStringCellValue();
			pass = row.getCell(1).getStringCellValue();
			System.out.println(uname);
			System.out.println(pass);
		}
		wbook1.close();

	}

}

/*
 * for (int j = 0; j < CellNumCount; j++) { XSSFCell cell = row.getCell(j);
 * System.out.println(cell.getStringCellValue());
 */
// cell.getNumericCellValue();
