package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocatorCSSSelectorTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/webtables");

		List<WebElement> tableItems = driver.findElements(By.className("rt-td"));

		int totalElements = tableItems.size();
		System.out.println("totalElements: " + totalElements);
	}

}
