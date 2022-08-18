package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testTextColor {
        WebDriver driver;

        @BeforeTest
        public void beforeTest(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://album.indi.mobi/");
        }
        @Test
        public void anhTreoTuong_VanTrang_25(){
            String clr = "rgb(255, 255, 255)";
            String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getCssValue("Color");
            Assert.assertEquals(clr, colorUrl);
        }
        @Test
        public void anhTreoTuong_VanTrang_26(){
            String clr = "rgb(255, 255, 255)";
            String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p")).getCssValue("Color");
            Assert.assertEquals(clr, colorUrl);
        }
        @AfterTest
        public void afterTest(){
            driver.close();
        }
}
