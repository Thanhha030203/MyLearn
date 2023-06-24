package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class firsttestngfle {
	public String baseUrl = "https://lms.poly.edu.vn";
	String drivePath = "D:\\FPT Polytechnic\\SPR23\\TestAdvanced\\TaiNguyen\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", drivePath);
		
		System.out.println("browser openned");
		driver = new ChromeDriver();
		driver.get(baseUrl);


	}

	@Test
	public void verifyHomepageTitle() {
		String execptedTitle = "Hệ thống quản trị học tập FPT Polytechnic";
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(execptedTitle)) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
