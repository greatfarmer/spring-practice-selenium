package kr.greatfarmer.home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://corin2.site/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.cssSelector("div#myNavbar > ul.nav.navbar-nav.navbar-right > li:nth-child(1)")).click();
	}
}