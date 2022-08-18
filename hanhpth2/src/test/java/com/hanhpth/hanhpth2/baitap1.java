//package com.hanhpth.hanhpth2;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class baitap1 {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.clrome.driver","chromedriver.exe");
//        WebDriver driver =new ChromeDriver();
//        String baseUrl = "https://www.demo.guru99.com/test/newtours/";
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitlfe = "";
//        driver.get(baseUrl);
//        actualTitle = driver.getTitle();
//        if (actualTitle.contentEquals(expectedTitle)) {
//            System.out.println("test passed!");
//        }
//        else {
//            System.out.println("test failed");
//        }
//    }
//}
