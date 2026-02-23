package dynamicwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchCoursenameUsingPrice {
	@Test

	public void Fetch_Price_using_cousename() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//td[text()='30']/preceding-sibling::td[1]")).getText());
}
}

/*output:
	Selenium Webdriver with Java Basics + Advanced + Interview Guide*/
