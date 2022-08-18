package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class font {
    public static void main(String[] args) {
        WebDriver driver;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập font chữ :");
        String font = scanner.nextLine();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");

        String fontUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getCssValue("font-family");
        if(fontUrl.contains(font)) {
            System.out.println("Thành công");
        }
        else {
            System.out.println("Thất bại");
        }
        driver.close();
    }
}
