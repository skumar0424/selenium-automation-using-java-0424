package seleniumtests;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementLocatorClassNameTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/books");

		// ((JavascriptExecutor) driver).

		// JavascriptExecutor javascriptExecutor= ((JavascriptExecutor)
		// driver).executeAsyncScript(null, args)

		WebElement element = driver.findElement(By.xpath("//select[@aria-label='rows per page']"));
		((RemoteWebDriver) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Select pageList = new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));

		List<WebElement> options = pageList.getOptions();

		for (WebElement option : options) {
			System.out.println("option: " + option.getText());
		}
	}

}
