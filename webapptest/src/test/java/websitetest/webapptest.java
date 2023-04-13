package websitetest;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webapptest {

	public static void main(String[] args) throws Exception {

		System.out.print("Test run");

	}

	@Test
	public void Browser1() throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		options.addArguments("--headless", "--disable-gpu", "--window-size=1580,12800", "--ignore-certificate-errors",
				"--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage");
		// options.addArguments("disable-infobars");
		// options.addArguments("disable-gpu");
		options.merge(caps);
		// URL url = new URL("http://3.95.161.130:49154/wd/hub");
		driver = new ChromeDriver(options);
		// driver.get("http://3.95.161.130:49154/wd/hub");
		driver.get("http://localhost");
		Thread.sleep(2000);
		System.out.print("Title of the page is: " + driver.getTitle() + "\n");
		Assert.assertTrue(driver.getTitle().equals("Intellipaat"), "Page title is not correct");
		Thread.sleep(2000);
		driver.quit();
	}
}
