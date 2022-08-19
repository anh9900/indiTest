package com.example.indi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class indi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập mã màu:");
            String color = scanner.nextLine();
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://album.indi.mobi/");
            String kq = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/header[1]")).getCssValue("background-color");
            if (kq == color){
                System.out.println("Màu trùng khớp");
            }
            else {
                System.out.println("Màu không trùng khớp");
                System.out.println(kq);
            }
            driver.close();

        }

}
