package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MH2 {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");
    }
    @Test
    public void MH2_01(){
        String txt = "Đơn hàng";
        String textUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getText();
        Assert.assertEquals(textUrl, txt);
    }
    @Test
    public void MH2_02(){
        String clrExp = "#FFFFFF";
        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getCssValue("Color");
        String colorAct = Color.fromString(colorUrl).asHex();
        Assert.assertEquals(colorAct, clrExp);
    }
    @Test
    public void MH2_03(){
        String txt = "Trợ giúp";
        String textUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p")).getText();
        Assert.assertEquals(textUrl, txt);
    }
    @Test
    public void MH2_04(){
        String clrExp = "#FFFFFF";
        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p")).getCssValue("Color");
        String colorAct = Color.fromString(colorUrl).asHex();
        Assert.assertEquals(colorAct, clrExp);
    }
    @Test
    public void MH2_05(){
        String txtEx = "Video hướng dẫn";
        String txtUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[3]/a/div/p")).getText();
        Assert.assertEquals(txtUrl, txtEx);
    }
    @Test
    public void MH2_06(){
        String clrExp = "#FFFFFF";
        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[3]/a/div/p")).getCssValue("Color");
        String colorAct = Color.fromString(colorUrl).asHex();
        Assert.assertEquals(colorAct, clrExp);
    }
    @Test
    public  void MH2_07(){
        String clrExp = ""
    }
    @Test
    public void MH2_41(){
        String clr = "#48D3D0";
        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header")).getCssValue("background-color");
        String colorAct = Color.fromString(colorUrl).asHex();
        Assert.assertEquals(colorAct, clr);
    }
    @Test
    public void MH2_42(){
        String clr = "#E5E5E5";
        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header")).getCssValue("background-color");
        String colorAct = Color.fromString(colorUrl).asHex();
        Assert.assertEquals(colorAct, clr);
    }
    @AfterTest
    public void afterTest(){

        driver.close();
    }
}
