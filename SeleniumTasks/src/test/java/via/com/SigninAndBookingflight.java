package via.com;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SigninAndBookingflight {
	@Test

	public void signup() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.via.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();// pop up closing

		driver.findElement(By.id("SignIn")).click();
		driver.findElement(By.id("loginIdText")).sendKeys("pavikumarukt1998@gmail.com");
		driver.findElement(By.id("passwordText")).sendKeys("Pavithra1@");
		driver.findElement(By.id("loginValidate")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.id("source")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("source")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.id("destination")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destination")).sendKeys(Keys.ENTER);
		WebElement departuredate = driver.findElement(By.xpath("//span[text()='Feb']/../../..//div[@data-date='24']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", departuredate);
		driver.findElement(By.xpath("//div[contains(@class,'element return')]")).click();
		WebElement returndate = driver
				.findElement(By.xpath("//div[@id='return-cal']//span[text()='Feb']/../../.././/div[@data-date='25']"));
		js.executeScript("arguments[0].click();", returndate);
		WebElement ele = driver
				.findElement(By.xpath("//label[text()='Adults ']/following-sibling::div//div[@class='plus']"));
		ele.click();
		ele.click();
		driver.findElement(By.xpath("//label[text()='Children ']/following-sibling::div//div[@class='plus']")).click();
		driver.findElement(By.xpath("//label[text()='Infants ']/following-sibling::div//div[@class='plus']")).click();
		driver.findElement(By.xpath("//div[text()='Search Flights']")).click();
		Thread.sleep(5000);

		
		List<WebElement> results = driver.findElements(By.xpath(
				"//div[contains(@class,'result')][.//span[contains(@class,'price') and number(translate(normalize-space(.), ',', '')) > 15000]]"));

		for (int i = 0; i < results.size(); i++) {

			WebElement result = results.get(i);

			String name = result.findElement(By.xpath(".//div[@class='name js-toolTip']")).getText();
			String price = result.findElement(By.xpath(".//span[contains(@class,'price')]")).getText();

			System.out.println(name + " : " + price);
		}

	}
}