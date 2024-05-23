package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

	@Test(groups = "SMOKE")
	public static void dropDownTest() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get("https://demoqa.com/books");

		WebElement dropdown = driver.findElement(By.xpath("//select[@aria-label='rows per page']"));

		JavascriptExecutor javaScriptExecutor = ((JavascriptExecutor) driver);

		Thread.sleep(2000);

		javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", dropdown);

		Select selectPage = new Select(dropdown);

		Thread.sleep(2000);

		selectPage.selectByIndex(-1);// select the first value of the options

		Thread.sleep(2000);

		selectPage.selectByValue("10");// approach 2 - select by value attribute

		Thread.sleep(2000);

		selectPage.selectByVisibleText("20 rows");// approach 3 - select by text visible on the dropdown

		List<WebElement> pageListOptions = selectPage.getOptions();
		int counter = 1;
		for (WebElement option : pageListOptions) {
			System.out.println("Page List Option '" + counter + "' value " + option.getText());
			counter++;
		}

	}

}
