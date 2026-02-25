package dynamicwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchAllValuesTest {
	@Test

	public void Fetch_all() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> values = driver
				.findElements(By.xpath("//legend[text()='Web Table Example'] /ancestor::fieldset//td"));
		for (WebElement value : values) {
			System.out.println(value.getText());

		}
	}
}

/*
 * output: Rahul Shetty Selenium Webdriver with Java Basics + Advanced +
 * Interview Guide 30 Rahul Shetty Learn SQL in Practical + Database Testing
 * from Scratch 25 Rahul Shetty Appium (Selenium) - Mobile Automation Testing
 * from Scratch 30 Rahul Shetty WebSecurity Testing for Beginners-QA knowledge
 * to next level 20 Rahul Shetty Learn JMETER from Scratch - (Performance +
 * Load) Testing Tool 25 Rahul Shetty WebServices / REST API Testing with SoapUI
 * 35 Rahul Shetty QA Expert Course :Software Testing + Bugzilla + SQL + Agile
 * 25 Rahul Shetty Master Selenium Automation in simple Python Language 25 Rahul
 * Shetty Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C 20
 * Rahul Shetty Write effective QA Resume that will turn to interview call 0
 */