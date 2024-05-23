package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyboardAndMouseEventTest extends BaseTest {

	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://demoqa.com/text-box");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		driver.findElement(By.id("currentAddress")).sendKeys("Pune, India");

		WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));

		WebElement permanentAddressElement = driver.findElement(By.id("permanentAddress"));

		// copy current address text
		action.click(currentAddressElement).keyDown(Keys.CONTROL).keyDown("A").keyDown(Keys.CONTROL).keyDown("C")
				.build().perform();

		action.click(permanentAddressElement).keyDown(Keys.CONTROL).keyDown("V").build().perform();

		System.out.println("copy paste of address completed successfully");
	}
}
