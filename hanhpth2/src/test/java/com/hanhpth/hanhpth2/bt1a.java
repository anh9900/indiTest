package com.hanhpth.hanhpth2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class bt1a{
    String baseUrl = "http://live.techpanda.org/";
    public WebDriver driver = new ChromeDriver();
    @Test
    public void TestMH(){
        System.setProperty("webdriver.clrome.driver","chromedriver.exe");
        driver.get(baseUrl);
        //thao tác click trên  mobile
        WebElement Mobile = driver.findElement(By.className("level0"));
        Mobile.click();

        //hiển thj sản phẩm trong sort by theo name
        Select SORTBY = new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
        SORTBY.selectByVisibleText("Name");
//        SORTBY.selectByIndex(1);
        driver.close();
    }
}