package com.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationTest {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shine.com/myshine/login/");

		WebElement mail = driver.findElement(By.id("id_email_login"));
		mail.sendKeys("bmansi555777@gmail.com");

		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("Mansi@123");

		WebElement login = driver.findElement(By.cssSelector("#cndidate_login_widget .msitelogin_mid2 .ui-btn_n"));
		login.click();

	}

}
