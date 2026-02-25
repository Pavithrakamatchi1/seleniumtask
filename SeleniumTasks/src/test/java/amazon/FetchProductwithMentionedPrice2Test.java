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

public class FetchProductwithMentionedPrice2Test {
	@Test
	public void fetchnamewithpriceTest() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		searchBox.sendKeys("Samsung mobiles", Keys.ENTER);
		List<WebElement> products = driver.findElements(By.xpath(
			    "//div[@data-component-type='s-search-result']" +
			    "[.//span[@class='a-price-whole' and number(translate(text(),'₹,',''))>9999]]"));

			for (WebElement product : products) {

			    String name = product.findElement(By.xpath(".//a//h2//span")).getText();

			    String price = product.findElement(By.xpath(".//span[@class='a-price-whole']")).getText();

			    System.out.println(name + "  ₹" + price);
			}
}
}