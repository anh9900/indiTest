package com.example.indinguyenlien;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class INDITEST {
    public static final String indiUrl = "https://album.indi.mobi/";
    WebDriver webDriver = new ChromeDriver();

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        webDriver.get(indiUrl);
    }

    @Test
    public void AnhTreoTuong_VanTrang_01() {
        String chuoi = "Đơn hàng";
        String donhang = webDriver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getText();
        System.out.println(donhang);
        Assert.assertEquals(chuoi, donhang);
    }
    @Test
    public void AnhTreoTuong_VanTrang_02(){
        String chuoi1="Trợ giúp";
        String trogiup = webDriver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[2]/a/div/p")).getText();
        System.out.println(trogiup);
        Assert.assertEquals(chuoi1,trogiup);

    }
    @Test
    public void AnhTreoTuong_VanTrang_25(){
        //Test màu text đơn hàng
        String mau = "#ffffff";
        String mautextdonhang=webDriver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getCssValue("color");
        System.out.println(mautextdonhang);
        String actualBgColor = Color.fromString(mautextdonhang).asHex();
        Assert.assertEquals(mau,actualBgColor);

    }
    @Test
    public void AnhTreoTuong_VanTrang_22(){
        //Test màu text body
        String mau = "#E5E5E5";
        String maubody=webDriver.findElement(By.xpath("/html/body")).getCssValue("background-color");
        System.out.println(maubody);
        String actualBgColor2 = Color.fromString(maubody).asHex();
        Assert.assertEquals(actualBgColor2,mau);

    }
    @Test
    public void AnhTreoTuong_VanTrang_21(){
        //Test màu header
        String mauheader = "#48d3d0";
        String mauheaderlayweb=webDriver.findElement(By.xpath("//*[@id=\"root\"]/section/header")).getCssValue("background-color");

        String actualBgColor1 = Color.fromString(mauheaderlayweb).asHex();

        System.out.println(actualBgColor1);
        Assert.assertEquals(mauheader,actualBgColor1);
    }

    @AfterTest
    public void afterTest(){
        webDriver.close();
    }
}

