package kr.greatfarmer.home;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		// ChromeDriver 위치
		System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(); // Driver 생성
	}
	
	@Test
	public void test() {
		String baseUrl = "http://corin2.site/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl); // URL로 접속
		// CSS선택자로 Element 가져오기
		driver.findElement(By.cssSelector("div#myNavbar > ul.nav.navbar-nav.navbar-right > li:nth-child(1)")).click();
		
		// id명으로 Element 가져오기
		// driver.findElement(By.id("id"));
		
		// class명으로 Element 가져오기
		// driver.findElement(By.className("className"));
		
		// tag명으로 Element 가져오기
		// driver.findElement(By.tagName("tagName"));
		
	}
	
	@After
	public void quitTest() {
		driver.quit(); // Driver 종료
	}
}