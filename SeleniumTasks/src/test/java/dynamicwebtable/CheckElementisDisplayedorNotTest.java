package dynamicwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckElementisDisplayedorNotTest {
	@Test

	public void HideAndShowTest() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@value='Hide']")).click();
		boolean s= driver.findElement(By.xpath("//input[@name='show-hide']")).isDisplayed();
		
		//driver.findElement(By.xpath("//input[@value='Show']")).click();
		//boolean s= driver.findElement(By.xpath("//input[@name='show-hide']")).isDisplayed();

		if(s==false) {
			System.out.println("textfield is hidden");
			
		}else {
			System.out.println("textfield is present");

		}
}
}