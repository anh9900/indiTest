package com.taproject.taproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestIndiMobi3 {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");
    }
    @AfterTest
    public void afterTest(){
        driver.close();

    }
    @Test(priority = 0)
    public void TestTitle(){
        System.out.println("Test Title");
        String expectedTitle = "Indi Web"; // hiển thị tên tab
        String actualTitle = driver.getTitle(); // khai báo lấy tiêu đề
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Pass!");
        }
        else {
            System.out.println("Failed!");
        }

    }
    @Test(priority = 1)
    public void BackgroundHeader(){
        String actualbackgroud = "rgba(72, 211, 208, 1)";
        String expectedbackgroud = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/header[1]")).getCssValue("background-color");
        Assert.assertEquals(expectedbackgroud,actualbackgroud);
    }
    @Test(priority = 2)
    public void TestTextDonHang(){
        String actualText = "Đơn hàng";
        String expectedText = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(priority = 3)
    public void TestColorDonHang(){
        String actualTextColor ="rgba(255, 255, 255, 1)";
        String expectedTextColor = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getCssValue("color");
        Assert.assertEquals(expectedTextColor,actualTextColor);

    }
    @Test(priority = 4)
    public void TestTextAnh_Treo_Tuong(){
        String actualText = "";
        String expectedTextColor = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/div[1]/div[1]/p[1]")).getText();
    }


}
