package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationAutomationTest {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shine.com/registration/");

		WebElement name = driver.findElement(By.id("id_name"));
		name.sendKeys("Mansi");

		WebElement email = driver.findElement(By.id("id_email"));
		email.sendKeys("bmansi555777@gmail.com");

		WebElement mobile = driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9888888888");

		WebElement password = driver.findElement(By.id("id_password"));
		password.sendKeys("Mansi@123");

		WebElement register = driver.findElement(By.cssSelector("#registerButton"));

		register.click();

	}
}
