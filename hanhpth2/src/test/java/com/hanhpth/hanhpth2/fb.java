package com.hanhpth.hanhpth2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb {
    @Test
    public void TestloginFB(){
        String LoginUrl = "https://www.facebook.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(LoginUrl);
        WebElement TDN = driver.findElement(By.name("email"));
        WebElement pass= driver.findElement(By.name("pass"));
        WebElement DN = driver.findElement(By.name("login"));
        TDN.sendKeys("hanh@abc.com");
        pass.sendKeys("abc@12");
        DN.click();
    }
}
