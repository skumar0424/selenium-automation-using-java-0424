package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocatorXPathTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/webtables");

		List<WebElement> tableEmails = driver.findElements(By.cssSelector("div.rt-tr-group>div>div:nth-of-type(4)"));

		for (WebElement email : tableEmails) {
			System.out.println(email.getText());
		}
		
		
	}

}
