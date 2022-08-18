package com.hanhpth.hanhpth2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hanh3 {
    public static void main(String[] args) {
        //đoạn này cần nhớ khai báo để kết nối với chrome Driver
        System.setProperty("webdriver.clrome.driver", "chromedriver.exe");
        WebDriver driver =new ChromeDriver();
            String baseUrl = "https://vnexpress.net/";
            driver.get(baseUrl);
    }
}
