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

public class bt1{
    String baseUrl = "https://vantaihahai.com/";
    public WebDriver driver = new ChromeDriver();
    @BeforeTest //trước

    public void init(){ //trong đó
        driver.get(baseUrl);
        System.out.println("Test Login");
    }
    @AfterTest //sau đó
    //kết thúc
    public void finish(){ //kết thúc
        System.out.println("Bye");
        driver.close();
    }
    @Test(priority = 0)
    public void TestTile(){
        System.out.println("Test Title");
        String expectedTitle = "Home | my Website";
        String actualTitle = driver.getTitle();// khai báo lấy tiêu đề web
        Assert.assertEquals(actualTitle, expectedTitle); //so sánh
    }
    @Test(priority = 5)
    public void Background() {
        System.out.println("Test Color");
        WebElement bodyElement = driver.findElement(By.name("body"));
        String s = bodyElement.getCssValue("background-color");
        String actualBgColor = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color:" + actualBgColor);
        String expectedBgColor = "#ffffff";
        Assert.assertEquals(actualBgColor,expectedBgColor);
    }
    @Test(priority = 1)
    public void TestText(){
        System.out.println("Test Text");
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        String actualFontSize = bodyElement.getCssValue("font-size");
        String expectedFontSize = "16px";
        Assert.assertEquals(actualFontSize,expectedFontSize);
    }
    @Test(priority = 2)
    public void TestColor(){
        System.out.println("Test Background");
    }
    @Test(priority = 6)
    public void TestLinkText(){
    }
}
