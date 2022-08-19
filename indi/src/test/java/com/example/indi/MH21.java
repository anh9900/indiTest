package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class MH21 {

    WebDriver driver;


    @BeforeTest
    public void initTest(){
        String baseUrl = "https://album.indi.mobi/";
        System.out.println("init test");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);



    }
    @AfterTest
    public void FinishTest(){
        System.out.println("bye");
        driver.close();
    }

    @Test
    public void indi_MH21_001(){

        String expectedBg = "#000000";

        // WebElement bgElement = driver.findElement(By.tagName("body"));
        // xác định vị trí body tageName
        String bgElement = driver.findElement(By.tagName("body")).getCssValue("background-color");


        String actualBg = Color.fromString(bgElement).asHex();
        System.out.println(actualBg);
        Assert.assertEquals(expectedBg,actualBg);



    }
    @Test
    public void TextMH2_01(){
        String TextExpected = "Đơn hàng";
        String TextUrl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/header[1]/ul[1]/li[1]/a[1]/div[1]/p[1]")).getText();
        Assert.assertEquals(TextUrl, TextExpected);


    }
    @Test
    public void indi_MH21_002(){


    }
    @Test
    public void indi_MH21_003(){

    }@Test
    public void indi_MH21_004(){

    }

}
