package seleniumtests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderMSExcelTest_Copy extends BaseTest {

	@Test(dataProvider = "dataMaps")
	public static void parameterTest(HashMap<String, String> userDetails) throws InterruptedException {

		driver.get("https://demoqa.com/text-box");

		driver.findElement(By.id("userName")).sendKeys(userDetails.get("userName"));

		driver.findElement(By.id("userEmail")).sendKeys(userDetails.get("email"));

		driver.findElement(By.id("currentAddress")).sendKeys(userDetails.get("currentAddress"));

		driver.findElement(By.id("permanentAddress")).sendKeys(userDetails.get("permanentAddress"));

		Thread.sleep(5000);
	}

	@DataProvider(name = "dataMaps")
	public Object[] getDataArray() {

		Object object[] = new Object[3];

		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		hashMap1.put("userName", "santosh");
		hashMap1.put("email", "santosh@techaxisgroup.com");
		hashMap1.put("currentAddress", "USA");
		hashMap1.put("permanentAddress", "India");

		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("userName", "Manvir");
		hashMap2.put("email", "Manvir@techaxisgroup.com");
		hashMap2.put("currentAddress", "Canada");
		hashMap2.put("permanentAddress", "India");

		HashMap<String, String> hashMap3 = new HashMap<String, String>();
		hashMap3.put("userName", "Yewaruddin");
		hashMap3.put("email", "Yewaruddin@techaxisgroup.com");
		hashMap3.put("currentAddress", "Hyderabad");
		hashMap3.put("permanentAddress", "India");

		object[0] = hashMap1;
		object[1] = hashMap2;
		object[2] = hashMap3;

		return object;
	}

	@Test(dataProvider = "MSExcelData")
	public static void dataProviderTest(HashMap<String, String> userDetails) throws InterruptedException {

		driver.get("https://demoqa.com/text-box");

		driver.findElement(By.id("userName")).sendKeys(userDetails.get("userName"));

		driver.findElement(By.id("userEmail")).sendKeys(userDetails.get("email"));

		driver.findElement(By.id("currentAddress")).sendKeys(userDetails.get("currentAddress"));

		driver.findElement(By.id("permanentAddress")).sendKeys(userDetails.get("permanentAddress"));

		Thread.sleep(5000);
	}

	@DataProvider(name = "MSExcelData")
	public Object[] getExcelData() throws FileNotFoundException, IOException {
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(
				"D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\testdata\\TestData.xls"));

		HSSFSheet sheet = workbook.getSheet("testdata");

		int totalRows = sheet.getPhysicalNumberOfRows();// total rows in a sheet

		Object object[] = new Object[totalRows - 1];

		int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();// total columns in a sheet

		for (int row = 1; row < totalRows; row++) {
			HashMap<String, String> testData = new HashMap<String, String>();

			for (int column = 0; column < totalColumns; column++) {
				String cellHeader = sheet.getRow(0).getCell(column).getRichStringCellValue().toString();
				String cellData = sheet.getRow(row).getCell(column).getRichStringCellValue().toString();
				System.out.println(cellHeader + " : " + cellData);
				testData.put(cellHeader, cellData);
			}
			object[row - 1] = testData;
		}
		return object;
	}
}
