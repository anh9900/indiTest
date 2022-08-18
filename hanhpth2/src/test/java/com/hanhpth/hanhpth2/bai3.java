package com.hanhpth.hanhpth2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.clrome.driver","chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        String baseUrl = "https://demo.guru99.com/test/ajax.html";
        driver.get(baseUrl);
    }
}
