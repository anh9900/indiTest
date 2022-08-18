package com.taproject.taproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class TestIndiMobi2 {
        WebDriver driver;
        @BeforeTest
        public void beforetest(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://album.indi.mobi/");

        }
        @Test
        public void testTextAnhTreoTuong(){
            String tittle = "Ảnh treo tường";
            String url = driver.findElement(By.xpath("//p[contains(text(),'Ảnh treo tường')]")).getText();
            if (url.contentEquals(tittle)){
                System.out.println("Pass");
            }
            else {
                System.out.println("Failed");
            }
        }
        @Test
        public void testColorTittleAnhTreoTuong(){
            String colorTittle = "";
            String colorExpected = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/div[1]/div[1]/p[1]")).getCssValue("color");
            System.out.println(colorExpected);
        }
        @Test
        public void testClickDonHang(){
            driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/html[1]/body[1]/div[1]/section[1]/header[1]/ul[1]/li[1]/a[1]/div[1]/p[1]")).click();
            String tittleDH = "Tính năng đang trong giai đoạn phát triển";
            String urlDH = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/p[1]")).getText();
            if (urlDH.contentEquals(tittleDH)){

                System.out.println("Pass");
            }
            else {
                System.out.println("Failed");
            }
        }
        @AfterTest
        public void aftertest(){

            driver.close();
        }

}
