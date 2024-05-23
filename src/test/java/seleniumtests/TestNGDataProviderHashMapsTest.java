package seleniumtests;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderHashMapsTest extends BaseTest {

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

}
