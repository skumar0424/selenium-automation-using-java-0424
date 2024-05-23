package seleniumtests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderTest extends BaseTest {

	@Test(dataProvider = "dataArray")
	public static void parameterTest(String[] userDetails) throws InterruptedException {

		driver.get("https://demoqa.com/text-box");

		driver.findElement(By.id("userName")).sendKeys(userDetails[0]);

		driver.findElement(By.id("userEmail")).sendKeys(userDetails[1]);

		driver.findElement(By.id("currentAddress")).sendKeys(userDetails[2]);

		driver.findElement(By.id("permanentAddress")).sendKeys(userDetails[3]);

		Thread.sleep(5000);
	}

	@DataProvider(name = "dataArray")
	public String[][] getDataArray() {
		String dataArray[][] = { { "santosh", "santosh@techaxisgroup.com", "USA", "India" },
				{ "Manvir", "Manvir@techaxisgroup.com", "Canada", "India" },
				{ "Yewaruddin", "Yewaruddin@techaxisgroup.com", "Hyderabad", "India" } };

		return dataArray;
	}

}
