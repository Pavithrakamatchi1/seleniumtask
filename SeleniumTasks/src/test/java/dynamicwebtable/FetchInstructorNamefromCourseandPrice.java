package dynamicwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchInstructorNamefromCourseandPrice {
	@Test

	public void Fetch_Instructorname_using_cousenameandPrice() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath(" //tr[td[contains(text(),'Selenium Webdriver') ]and td[text()='30']]/td[1]")).getText());
		}
}

//output: Rahul Shetty
