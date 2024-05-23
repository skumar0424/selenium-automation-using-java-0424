package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsContextClickTest extends BaseTest {

	@Test
	public static void actionsContextClickTest() {

		launchBrowser("chrome");

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement contextClickButton = driver.findElement(By.id("rightClickBtn"));

		action.contextClick(contextClickButton).build().perform();

		driver.findElement(By.id("rightClickMessage")).isDisplayed();

		String contextClickPerform = driver.findElement(By.id("rightClickMessage")).getText();

		System.out.println(contextClickPerform);
	}

}
