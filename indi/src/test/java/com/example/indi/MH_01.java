package com.example.indi;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MH_01 {
    WebDriver driver;
    @BeforeTest
    public void initTest(){
        System.out.println("init test");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/thanh-toan");
    }

    @AfterTest
    public void FinishTest() {
    System.out.println("Đóng");
    driver.close();
}
    @Test
    public void TextMH2_01(){
        String expectedText = "Đơn hàng";
        String  actualText= driver.findElement(By.xpath("header p")).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    public void MH2_02(){
        System.out.println("Test color Đơn hàng");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div"));
        String actualColorĐơnhàng = Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorĐơnhàng = "#ffffff";
        Assert.assertEquals(actualColorĐơnhàng, expectedColorĐơnhàng);

    }
    @Test
    public void MH2_03(){
        System.out.println("Test Text Trợ giúp");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a"));
        String actualTextTG=bodyElement.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p")).getText();
        String expectedTextTG="Trợ Giúp";
        Assert.assertEquals(actualTextTG,expectedTextTG);
    }
    @Test
    public void MH2_04(){
        System.out.println("Test color Trợ giúp");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p"));
        String actualColorTG=Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorTG= "#ffffff";
        Assert.assertEquals(actualColorTG, expectedColorTG);
    }
    @Test
    public void MH2_06(){
        System.out.println("Test color Video hướng dẫn");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[3]/a/div/p"));
        String actualColorVideoHD= Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorVideoHD = "#ffffff";
        Assert.assertEquals(actualColorVideoHD, expectedColorVideoHD);
    }
    @Test
    public void MH2_08(){
        System.out.println("Test color Liên hệ hỗ trợ");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[4]/a/div/p"));
        String actualColorLHHT = Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorLHHT = "#ffffff";
        Assert.assertEquals(actualColorLHHT, expectedColorLHHT);
    }
    @Test
    public void MH2_10(){
        System.out.println("Test color Ảnh treo tường");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/div[1]/div/p"));
        String actualColorATT = Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorATT = "#073968";
        Assert.assertEquals(actualColorATT, expectedColorATT);
    }
    @Test
    public void MH2_12(){
        System.out.println("Test color Khung vân gỗ");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/div[2]/div[1]/div[1]/p"));
        String actualColorKVG = Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorKVG = "#073968";
        Assert.assertEquals(actualColorKVG, expectedColorKVG);
    }
    @Test
    public void MH2_14(){
        System.out.println("Test color Khung trắng");
        WebElement bodyElement = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/div[2]/div[1]/div[3]/p"));
        String actualColorKT = Color.fromString(bodyElement.getCssValue("Color")).asHex();
        String expectedColorKT = "#073968";
        Assert.assertEquals(actualColorKT, expectedColorKT);
    }
}
