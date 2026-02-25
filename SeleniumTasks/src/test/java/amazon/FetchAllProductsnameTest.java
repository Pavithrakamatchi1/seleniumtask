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

public class FetchAllProductsnameTest {

	@Test

	public void Fetch_All_ProductsName_With_SamsungTest() throws Throwable {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

		searchBox.sendKeys("Samsung mobiles", Keys.ENTER);

			List<WebElement> names = driver
					.findElements(By.xpath("//div[@data-component-type='s-search-result']//a/h2/span"));


			for (WebElement e : names) {
				System.out.println(e.getText());
			}
			
		driver.quit();
		
	}
}
