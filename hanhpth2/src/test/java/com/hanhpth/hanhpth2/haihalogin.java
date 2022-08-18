package com.hanhpth.hanhpth2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class haihalogin {


    @Test
    public void TestLogin(){
        String loginUrl = "https://vantaihahai.com/web/login";
        WebDriver driver = new ChromeDriver();
        driver.get(loginUrl);
        WebElement loginElement = driver.findElement(By.name("login"));
        WebElement passwordElement = driver.findElement(By.name("password"));
        WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button"));

        loginElement.sendKeys("test1@abc.com");
        passwordElement.sendKeys("anc123@!");
        submitBtn.click();
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test2");
    }

    @Test
    public void test4(){
        System.out.println("test2");
    }
}
