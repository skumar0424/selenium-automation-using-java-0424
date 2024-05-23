package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WebElementTagNameTest {
//	public static void main(String[] args) {
//	@Test(priority = 1) // test annotation -> classify the method as a Test Case
	public void verifyLocatorUsingTagName() {
		WebDriver originalDriver = new ChromeDriver();

		Listener listener = new Listener();

		EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listener);

		WebDriver driver = decorator.decorate(originalDriver);

		driver.get("https://demoqa.com/links");

		driver.findElement(By.linkText("Created")).isDisplayed();

		driver.findElement(By.linkText("Created")).click();

		List<WebElement> inputElements = driver.findElements(By.tagName("a"));

		int totalInputElements = inputElements.size();

		Reporter.log("totalInputElements: " + totalInputElements);

		for (WebElement element : inputElements) {
			Reporter.log("element text: " + element.getText());
		}
	}

//	@Test
	public void verifyLocatorUsingId() {
		WebDriver originalDriver = new ChromeDriver();

		Listener listener = new Listener();

		EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listener);

		WebDriver driver = decorator.decorate(originalDriver);

		driver.get("https://demoqa.com/links");

		String createdLinkText = driver.findElement(By.linkText("Created")).getText();

		Assert.assertEquals(createdLinkText, "Created button", "verify link text");

		// Assert.assertTrue(hasCreatedLinkDisplayed, "created link should be
		// displayed");

		driver.findElement(By.linkText("Created")).click();

		// String responseMessage = driver.findElement(By.id("linkResponse")).getText();

		// Reporter.log("responseMessage: " + responseMessage);

		List<WebElement> inputElements = driver.findElements(By.tagName("a"));

		int totalInputElements = inputElements.size();

		Reporter.log("totalInputElements: " + totalInputElements);

		for (WebElement element : inputElements) {
			Reporter.log("element text: " + element.getText());
		}
	}

	@Test(priority = -1)
	public void test3() {
		Reporter.log("test 3 execution", true);
	}

	@Test(priority = 3)
	public void test4() {
		Reporter.log("test 4 execution", true);
	}

	@Test(priority = 2)
	public void test5() {
		Reporter.log("test 5 execution", true);
	}

	@Test()
	public void test6() {
		Reporter.log("test 6 execution", true);
	}
}
