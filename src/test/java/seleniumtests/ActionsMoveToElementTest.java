package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElementTest extends BaseTest {

	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement draggableElement = driver.findElement(By.id("draggable"));

		WebElement droppableElement = driver.findElement(By.id("droppable"));

		action.dragAndDrop(draggableElement, droppableElement).build().perform();

		System.out.println("draggable operation completed");
	}

}
