package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = launchBrowser();

		driver.findElement(By.id("userName")).sendKeys("Santosh Kumar");

		driver.findElement(By.id("userEmail")).sendKeys("santoshkumar@techaxisgroup.com");

		driver.findElement(By.id("currentAddress")).sendKeys("USA");

		driver.findElement(By.id("permanentAddress")).sendKeys("India");

		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);

		driver.findElement(By.id("name")).isDisplayed();// validation, test case, expected result

	}

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.get("https://demoqa.com/text-box");
		String chromeTitle = driver.getTitle();
		System.out.println("Chrome title is: " + chromeTitle);
		return driver;
	}

}
