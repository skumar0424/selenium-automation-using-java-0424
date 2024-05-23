package seleniumtests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverManagerTest extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		launchBrowser("chrome");

		driver.get("https://demoqa.com/browser-windows");

		Thread.sleep(5000);

		driver.findElement(By.id("tabButton")).isDisplayed();

		driver.findElement(By.id("tabButton")).click();

		String defaultWindow = driver.getWindowHandle();// return me the window id assigned by Operating System

		Set<String> windowIds = driver.getWindowHandles();

		// switching to new window
		for (String windowId : windowIds) {

			System.out.println("windowId: " + windowId);

			if (!windowId.equals(defaultWindow)) {
				driver.switchTo().window(windowId);
			}
		}

		System.out.println("get new window title : " + driver.getTitle());

		String newWindowHeader = driver.findElement(By.tagName("h1")).getText();

		System.out.println("newWindowHeader: " + newWindowHeader);

		driver.close();// will close the current active window

		driver.switchTo().window(defaultWindow);

		Thread.sleep(2000);

		driver.quit();

	}

}
