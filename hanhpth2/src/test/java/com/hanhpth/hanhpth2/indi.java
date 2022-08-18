package com.hanhpth.hanhpth2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class indi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String color = scanner.nextLine();
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://album.indi.mobi/");
            String kq = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header")).getCssValue("background-color");
            if (kq == color) {
                System.out.println("màu đúng");
            }
            else {
                System.out.println("màu không đúng");
                System.out.println(kq);
            }
        driver.close();

    }
}


