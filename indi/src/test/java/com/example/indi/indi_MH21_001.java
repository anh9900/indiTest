package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.sql.Driver;

public class indi_MH21_001 {
    WebDriver driver;

    @BeforeTest
    public void befforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");
    }
    @Test
    public void testtxtSinglemenu(){
        String txtExp = "Single menu";
        String txtUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div")).getText();
        Assert.assertEquals(txtUrl, txtExp);
    }
//    txtExppublic void testcolorSinglemenu(){
//        testcolorSinglemenuSystem.out.println("Test Color Single menu");
//        //WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p/font/font")).getCssValue("color");
//        String actualColor = bodyElement.getCssValue(By.xpath());
//        System.out.println();
//
//    }
    @AfterTest
    public void afterTest(){
        System.out.println("Bye");
        driver.close();
    }
    }