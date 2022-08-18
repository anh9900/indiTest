package com.hanhpth.hanhpth2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class bai4 {
    //khai báo trang web
    //beseUrl: tên biến
   String baseUrl = "http://www.demo.guru99.com/V4/";
   WebDriver driver = new ChromeDriver();
   @Test
   public void testLongin(){
       //khai bảo mở trang web
       System.setProperty("webdriver.clrome.driver","chromedriver.exe");
       driver.get(baseUrl);
       //xác đinh vị trí của Elemunt
       WebElement uid = driver.findElement(By.name("uid"));
       WebElement pwd = driver.findElement(By.name("password"));
       WebElement loginBtn = driver.findElement(By.name("btnLogin"));
       uid.sendKeys("mngr430528");
       pwd.sendKeys("Ydnagin");
       loginBtn.click();

   }
}
