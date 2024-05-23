package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDoubleClickTest extends BaseTest {
	@Test
	public static void actionsDoubleClickTest() {

		launchBrowser("chrome");

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

		action.doubleClick(doubleClickButton).build().perform();

		driver.findElement(By.id("doubleClickMessage")).isDisplayed();

		String doubleClickPerform = driver.findElement(By.id("doubleClickMessage")).getText();

		System.out.println(doubleClickPerform);
	}

}
