package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Fetch1stProductprizeAndNameOnlyTest {
	@Test
	public void prizeandname() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		searchBox.sendKeys("Samsung mobiles", Keys.ENTER);
		List<WebElement> names = driver.findElements(By.xpath("//a/h2/span"));
		System.out.println(names.get(0).getText());
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(prices.get(0).getText());

	}

}