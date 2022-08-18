package com.hanhpth.hanhpth2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class MH_TTNN {
    String baeUrl="https://album.indi.mobi/thanh-toan";
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
    public void TestTile() {
        System.out.println("test tile");
        String expectedTitle = "Indi Web";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(priority=1)
    public void TTND_UI_020(){
        System.out.println("Test backgroud header");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header"));
        String actualBgColor = Color.fromString( bodyElement.getCssValue("background-color")).asHex();
        String expectedBgColor ="#48d3d0";
        Assert.assertEquals(actualBgColor,expectedBgColor);
    }
    @Test(priority = 2)
    public void TTND_UI_021(){
        System.out.println("Test text ĐH");
        WebElement bodyElement =driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a"));
        String actualTextDH =bodyElement.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getText();
        String expectedTextDH = "Đơn hàng";
        Assert.assertEquals(actualTextDH,expectedTextDH);
    }
    @Test(priority = 3)
    public void TTND_UI_022(){
        System.out.println("Test color ĐH");
        WebElement bodyElement=driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p"));
        String actualColorDH= Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedClorDH="#ffffff";
        Assert.assertEquals(actualColorDH,expectedClorDH);
    }
    @Test(priority = 4)
    public void TTND_UI_023(){
        System.out.println("TestText TG");
        WebElement bodyElement=driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a"));
        String actualTextTG=bodyElement.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p")).getText();
        String expectedTextTG="Trợ giúp";
        Assert.assertEquals(actualTextTG,expectedTextTG);
    }
    @Test(priority = 5)
    public void TTND_UI_024(){
        System.out.println("TestColor TG");
        WebElement bodyElement=driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p"));
        String actualColorTG=Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorTG="#ffffff";
        Assert.assertEquals(actualColorTG,expectedColorTG);
    }
    @Test(priority = 6)
    public void TTND_UI_029(){
        System.out.println("Test backgroud button Đặt hàng");
        WebElement bodyElement=driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/section/div[1]/div/div[1]/button"));
        String actualBGColorDatHang=Color.fromString(bodyElement.getCssValue("background-color")).asHex();
        String expectedColorDatHang="#E7291D";
        Assert.assertEquals(actualBGColorDatHang,expectedColorDatHang);
    }

}
