package seleniumtests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class AlertTest extends BaseTest {
	@Test
	public static void alertTest() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		waitForPageToLoad();

		driver.findElement(By.id("timerAlertButton")).click();

		waitForAlertIsPresent();

		driver.switchTo().alert().dismiss();

		waitForElementVisibility(driver.findElement(By.id("confirmButton")));

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().accept();

		fluentWaitForElementAttribute(driver.findElement(By.id("confirmResult")), "class", "text-success");

		String confirmText = driver.findElement(By.id("confirmResult")).getText();

		System.out.println("confirmText: " + confirmText);

	}

}
