package automation;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class mytest {
	@Test
	public void test() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("iphone 15");		
		driver.findElement(By.id("nav-search-submit-button")).click();

	}
}
