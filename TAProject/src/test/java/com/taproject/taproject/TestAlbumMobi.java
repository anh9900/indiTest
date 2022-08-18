package com.taproject.taproject;



import com.codeborne.selenide.conditions.webdriver.Title;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.model.FontSizes;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.Color; // Hex code for color

public class TestAlbumMobi {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vantaihahai.com/");
    }
    @AfterTest
    public void finish(){
        System.out.println("Bye");
        driver.close();
        driver.close();

    }
    @Test(priority = 0)
    public void TestTitle(){
        System.out.println("Test Title");
        String expectedTitle = "Home | My Website"; // hiển thị tên tab
        String actualTitle = driver.getTitle(); // khai báo lấy tiêu đề
        Assert.assertEquals(actualTitle, expectedTitle); // câu lệnh so sánh

    }
    @Test(priority = 5)
    public void Background(){
        System.out.println("Test Color");
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        String s = bodyElement.getCssValue("background-color"); // gán body = s
        String actualBgColor = Color.fromString(s).asHex();
        System.out.println("Color is:" + s);
        System.out.println("Hex code for color." + actualBgColor);
        String expectedBgColor = "#ffffff";
        Assert.assertEquals(actualBgColor, expectedBgColor);

    }
    @Test(priority = 1)
    public void TestText(){
        System.out.println("Test Text");
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        String actualFontSizes = bodyElement.getCssValue("font-size");
        String expectedFontSize = "16px";
        Assert.assertEquals(actualFontSizes, expectedFontSize);
    }
    @Test(priority = 2)
    public void TestColor(){


    }

    @Test(priority = 2)
    public void TestLogin(){

       driver.get("https://vantaihahai.com/web/login");
       driver.findElement(By.xpath("//input[@id='login']")).sendKeys("anh@gmail.com");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
       driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
       String tittle = "Sai tên đăng nhập/mật khẩu";
       String url = driver.findElement(By.xpath("//p[contains(text(),'Sai tên đăng nhập/mật khẩu')]")).getText();
       Assert.assertEquals(url, tittle);
       System.out.println("kết quả đăng nhập" +url);
    }


}
