package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDropTest extends BaseTest {

	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://demoqa.com/tool-tips");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement moveToElement = driver.findElement(By.id("toolTipButton"));

		action.moveToElement(moveToElement).build().perform();

		driver.findElement(By.xpath("//div[text()='You hovered over the Button']")).isDisplayed();

		System.out.println("move to element as been completed");

	}

}
