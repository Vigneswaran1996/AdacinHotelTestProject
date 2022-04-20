package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdacinHotelSite {

	WebDriver driver;

	@Test
	public void loginPage() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("vigneshbabu19");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("vigneshbabu19@123");

		WebElement loginButton = driver.findElement(By.id("login"));
		loginButton.click();
	}

	public static void main(String[] args) {
		
		AdacinHotelSite loginPage = new AdacinHotelSite();
		loginPage.loginPage();

	}

}
