package via.com;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AccountcreationTest {
	@Test

	public void signup() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.via.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();// pop up closing

		driver.findElement(By.id("SignIn")).click();
		driver.findElement(By.xpath("//span[text()='SIGN UP']")).click();
		driver.findElement(By.id("emailIdSignUp")).sendKeys("pavikumarukt1998@gmail.com");
		driver.findElement(By.id("passwordSignUp")).sendKeys("Pavithra1@");
		driver.findElement(By.id("nameSignUp")).sendKeys("Pavithra");
		driver.findElement(By.id("mobileNoSignUp")).sendKeys("9807262345");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		System.in.read();// pauses the execution..
        //manually enter otp from mail
		// click on console output ,execution will resume

		driver.findElement(By.xpath("//input[@value='VERIFY OTP']")).click();
		//we cannot verify otp with automation manually need to enter from email

	}

}
