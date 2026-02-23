package dynamicwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchTable {
	@Test

	public void Fetch_all() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> values = driver
				.findElements(By.xpath("//legend[text()='Web Table Fixed header']/ancestor::fieldset//td"));
		for (WebElement value : values) {
			System.out.println(value.getText());

		}
	}
	
	/*output:
		Alex
		Engineer
		Chennai
		28
		Ben
		Mechanic
		Bengaluru
		23
		Dwayne
		Manager
		Kolkata
		48
		Ivory
		Receptionist
		Chennai
		18
		Jack
		Engineer
		Pune
		32
		Joe
		Postman
		Chennai
		46
		Raymond
		Businessman
		Mumbai
		37
		Ronaldo
		Sportsman
		Chennai
		31
		Smith
		Cricketer
		Delhi
		33
		*/
}
