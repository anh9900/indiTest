package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class size {
    public static void main(String[] args) {
        WebDriver driver;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size:");
        String size = scanner.nextLine();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");

        String sizeUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/ul/li[1]/a/div/p")).getCssValue("font-size");
        if(size.equals(sizeUrl))
            System.out.println("Thành công");
        else
            System.out.println("Thất bại");


        driver.close();
    }
}
