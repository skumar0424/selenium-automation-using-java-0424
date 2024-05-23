package seleniumtests;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersTest extends BaseTest {
	@Parameters({ "userName", "email", "currentAddress", "permanentAddress" })
	@Test
	public static void parameterTest(String userName, String email, String currentAddress, String permanentAddress)
			throws InterruptedException {

		driver.get("https://demoqa.com/text-box");

		driver.findElement(By.id("userName")).sendKeys(userName);

		driver.findElement(By.id("userEmail")).sendKeys(email);

		driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);

		driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);

		// driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);

		// driver.findElement(By.id("name")).isDisplayed();// validation, test case,
		// expected result

	}

}
