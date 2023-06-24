package com.ps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
    @Test
    public void verifyHomepageTitle() {
        System.setProperty("webdriver.chrome.driver", "D:\\FPT Polytechnic\\SPR23\\TestAdvanced\\TaiNguyen\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://lms.poly.edu.vn";
        String title_website = "Hệ thống quản trị học tập Fpt Polytechnic";
        String Title_excepted = "";
        driver.get(url);
        Title_excepted = driver.getTitle();
        if (Title_excepted.contentEquals(title_website)) {
            System.out.println("test pass");
        } else {
            System.out.println("test fail");
        }
        driver.close();

    }
}
