package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testText {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");
    }
    @Test
    public void anhTreoTuong_VanTrang_01(){
        String txt = "Đơn hàng";
        String textUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getText();
        Assert.assertEquals(textUrl, txt);
    }
    @Test
    public void anhTreoTuong_VanTrang_02(){
        String txt = "Trợ giúp";
        String textUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p")).getText();
        Assert.assertEquals(textUrl, txt);
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
