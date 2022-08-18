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
import org.openqa.selenium.support.Color;

public class ManHinhThongTinND {
    WebDriver driver;

    WebElement webElement;
    @BeforeTest
    public void beforetest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/thanh-toan");
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }
    @Test
    public void TTND_UI_020(){
        String expectedBGColor = "#48d3d0";
        String color = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/header[1]")).getCssValue("background-color");
        String  actualBGColor = Color.fromString(color).asHex();
        Assert.assertEquals(actualBGColor, expectedBGColor);
    }
    @Test
    public void TTND_UI_021(){
        String expectedText = "Đơn hàng";
        String  actualText= driver.findElement(By.xpath("//p[contains(text(),'Đơn hàng')]")).getText();
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    public void TTND_UI_022(){
        String actualTextColor = "#ffffff";
        String color = driver.findElement(By.xpath("//p[contains(text(),'Đơn hàng')]")).getCssValue("color");
        String expectedTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedTextColor, actualTextColor);
    }
    @Test
    public void TTND_UI_023(){
        String actualText = "Trợ giúp";
        String expectedText = driver.findElement(By.xpath("//p[contains(text(),'Trợ giúp')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void TTND_UI_024(){
        String actualTextColor = "#ffffff";
        String color = driver.findElement(By.xpath("//p[contains(text(),'Trợ giúp')]")).getCssValue("color");
        String expectedTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedTextColor, actualTextColor);
    }
    @Test
    public void TTND_UI_025(){
        String actualText = "Video hướng dẫn";
        String expectedText = driver.findElement(By.xpath("//p[contains(text(),'Video hướng dẫn')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void TTND_UI_026(){
        String actualTextColor = "#ffffff";
        String color = driver.findElement(By.xpath("//p[contains(text(),'Video hướng dẫn')]")).getCssValue("color");
        String expectedTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedTextColor, actualTextColor);
    }
    @Test
    public void TTND_UI_027(){
        String actualText = "Liên hệ hỗ trợ";
        String expectedText = driver.findElement(By.xpath("//p[contains(text(),'Liên hệ hỗ trợ')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void TTND_UI_028(){
        String actualTextColor = "#ffffff";
        String color = driver.findElement(By.xpath("//p[contains(text(),'Liên hệ hỗ trợ')]")).getCssValue("color");
        String expectedTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedTextColor, actualTextColor);
    }
    @Test
    public void TTND_UI_029(){
        String actualBGButtonColor = "#e7291d";
        String color = driver.findElement(By.tagName("button")).getCssValue("background-color");
        String expectedBGButtonColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedBGButtonColor, actualBGButtonColor);
        System.out.println(expectedBGButtonColor);
    }
    @Test
    public void TTND_UI_030(){
        String actualTextColor = "#ffffff";
        String color = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/section/div[1]/div/div[1]/button")).getCssValue("color");
        String expectedTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedTextColor, actualTextColor);
    }
    @Test
    public void TTND_UI_031(){
        String actualText = "Đặt hàng";
        String expectedText = driver.findElement(By.xpath("//button[contains(text(),'Đặt hàng')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void TTND_UI_032(){
        String actualText = "THÔNG TIN NGƯỜI NHẬN";
        String expectedText = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/section/div[1]/div/div[1]/p")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void TTND_UI_033(){
        String actualTextColor = "#073968";
        String color = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/section/div[1]/div/div[1]/p")).getCssValue("color");
        String expectedTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedTextColor, actualTextColor);
    }
    @Test
    public void TTND_UI_034(){
        String actualText = "Thanh toán";
        String expectedText = driver.findElement(By.xpath("//p[contains(text(),'Thanh toán')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void TTND_UI_035(){
        String actualTextColor = "#073968";
        String color = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/div[1]/div[1]/p[1]")).getCssValue("color");
        String expectedTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(expectedTextColor, actualTextColor);
    }
    @Test
    public void TTND_UI_036(){
        String expectedTextColor = "#496E8F";
        String txtActchange = expectedTextColor.toLowerCase();
        String color = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).getCssValue("color");
        String  actualTextColorten = Color.fromString(color).asHex();
        System.out.println("actual" +actualTextColorten);
        Assert.assertEquals(actualTextColorten, txtActchange);
    }
    @Test
    public void TTND_UI_037(){

    }
    @Test
    public void TTND_UI_038(){

    }
    @Test
    public void TTND_UI_039(){

    }
    @Test
    public void TTND_UI_040(){

    }
    @Test
    public void TTND_UI_041(){

    }
    @Test
    public void TTND_UI_042(){

    }

    @Test
    public void TTND_UI_043(){

    }
    @Test
    public void TTND_UI_044(){
        String expectedText = "CHI TIẾT SẢN PHẨM";
        String actualText = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/section[1]/div[2]/div[1]/div[1]/p[1]")).getText();
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    public void TTND_UI_045(){
        String expectedTextColor = "#073968";
        String color = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/section[1]/div[2]/div[1]/div[1]/p[1]")).getCssValue("color");
        String actualTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(actualTextColor, expectedTextColor);
    }
    @Test
    public void TTND_UI_046(){
        String expectedText = "Photobook bìa mềm 15x15 cm 20 trang";
        String actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/section/div[2]/div/div[3]/div[1]/p")).getText();
        System.out.println("" + actualText);
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    public void TTND_UI_047(){
        String expectedTextColor = "#073968";
        String color = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/section/div[2]/div/div[3]/div[1]/p")).getCssValue("color");
        String actualTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(actualTextColor, expectedTextColor);
    }
    @Test
    public void TTND_UI_048(){
        String expectedText = "Đơn giá";
        String actualText = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/section[1]/div[2]/div[1]/div[2]/div[2]/p[1]")).getText();
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    public void TTND_UI_049(){
        String expectedTextColor = "#99A6B1";
        String textColorChange = expectedTextColor.toLowerCase();
        String color = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/section[1]/div[2]/div[1]/div[2]/div[2]/p[1]")).getCssValue("color");
        String actualTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(actualTextColor, textColorChange);
    }
    @Test
    public void TTND_UI_050(){
        String expectedText = "Số lượng";
        String actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/section/section/div[2]/div/div[2]/div[3]/p")).getText();
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    public void TTND_UI_051(){
        String expectedTextColor = "#99A6B1";
        String textColorChange = expectedTextColor.toLowerCase();
        String color = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/section[1]/div[2]/div[1]/div[2]/div[3]/p[1]")).getCssValue("color");
        String actualTextColor = Color.fromString(color).asHex();
        Assert.assertEquals(actualTextColor, textColorChange);
    }
    @Test
    public void TTND_UI_052(){
        String expectedText = "Thành tiền";
        String actualText = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/section[1]/section[1]/div[2]/div[1]/div[2]/div[4]/p[1]")).getText();
        Assert.assertEquals(actualText,expectedText);
    }
}
