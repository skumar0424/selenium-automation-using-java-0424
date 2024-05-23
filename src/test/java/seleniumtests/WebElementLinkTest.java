package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLinkTest extends BaseTest {

	public static void main(String[] args) {

		launchBrowser("firefox");

		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		driver.navigate().back();

		driver.navigate().forward();

		List<WebElement> inputElements = driver.findElements(By.tagName("a"));

		int totalInputElements = inputElements.size();

		System.out.println("totalInputElements: " + totalInputElements);

		for (WebElement element : inputElements) {
			System.out.println("element text: " + element.getText());
		}

	}

}
