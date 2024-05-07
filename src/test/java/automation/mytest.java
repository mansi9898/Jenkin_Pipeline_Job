package automation;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class mytest {
	@Test
	public void test() {
		WebDriver driver;
		driver = new InternetExplorerDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("iphone 15");		
		driver.findElement(By.id("nav-search-submit-button")).click();

	}
}
