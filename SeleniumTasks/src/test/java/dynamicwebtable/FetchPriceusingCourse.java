package dynamicwebtable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchPriceusingCourse {
	@Test

	public void Fetch_Price_using_cousename() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Selenium Webdriver')]/following-sibling::td")).getText());
}
}
//output:30