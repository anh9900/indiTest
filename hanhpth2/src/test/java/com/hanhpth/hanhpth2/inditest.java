package com.hanhpth.hanhpth2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class inditest {
    String baeUrl="https://album.indi.mobi/";
    public WebDriver driver=new ChromeDriver();
    @BeforeTest
    public void init(){
        driver.get(baeUrl);
        System.out.println("test:");
    }
    @AfterTest
    public void finish(){
        System.out.println("xong");
        driver.close();
    }
    @Test(priority = 0)
    public void TestTile(){
        System.out.println("test tile");
        String expectedTitle = "Indi Web";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test(priority = 1)
    public void TestText() {
        System.out.println("Test Text");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a"));
        String actualText = bodyElement.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getText();
        String expectedText = "Đơn hàng";
        Assert.assertEquals(actualText,expectedText);
    }
}

