package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testBackgroundColor {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");
    }
    @Test
    public void anhTreoTuong_VanTrang_21(){
        String clr = "rgba(72, 211, 208, 1)";
        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header")).getCssValue("background-color");
        Assert.assertEquals(colorUrl, clr);
    }
    @Test
    public void anhTreoTuong_VanTrang_22(){
        String clr = "rgba(72, 211, 208, 1)";
        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header")).getCssValue("background-color");
        Assert.assertEquals(colorUrl, clr);
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
