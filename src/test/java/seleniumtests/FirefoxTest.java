package seleniumtests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class FirefoxTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\drivers\\geckodriver.exe"
		 * );
		 */
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/frames");

		int totalFrames = driver.findElements(By.tagName("iframe")).size();

		captureScreenShot(driver, "screenShot1");
		System.out.println("total frames in a the default content are : " + totalFrames);

		driver.switchTo().frame("frame1");

		captureScreenShot(driver, "screenShot2");
		String theFrameOneHeaderText = driver.findElement(By.id("sampleHeading")).getText();

		System.out.println("theFrameOneHeaderText: " + theFrameOneHeaderText);

		captureScreenShot(driver, "screenShot3");

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");

		captureScreenShot(driver, "screenShot4");

		String theFrameTwoHeaderText = driver.findElement(By.id("sampleHeading")).getText();

		System.out.println("theFrameTwoHeaderText: " + theFrameTwoHeaderText);

	}

	private static void captureScreenShot(WebDriver driver, String destinationFileName) throws IOException {
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Files.copy(sourceFile, new File(
				"D:\\techaxisgroup\\demoapr2024\\training-batch-april24-workspace\\linkedin_test_automation\\resources\\screeenshots\\"
						+ destinationFileName + ".PNG"));

	}

}
