//Nhập từ bàn phím

package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class testTextColor1 {
    public static void main(String[] args) {
        WebDriver driver;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã màu:");
        String color = scanner.nextLine();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://album.indi.mobi/");

        String colorUrl = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header")).getCssValue("background-color");
        if(color.contains(colorUrl))
            System.out.println("Thành công");
        else
            System.out.println("Thất bại");

        driver.close();
    }
}
