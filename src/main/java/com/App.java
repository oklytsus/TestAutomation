package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.time.Duration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\tStart");
        //
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new HtmlUnitDriver(false);
        //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();
        //
        driver.get("https://demo.opencart.com/");
        Thread.sleep(2000); // For Presentation
        System.out.println("\tdemo.opencart.com opened, title = " + driver.getTitle());
        //
        driver.findElement(By.cssSelector("li.list-inline-item a.dropdown-toggle[href='']")).click();
        Thread.sleep(2000); // For Presentation
        System.out.println("\ta.dropdown-toggle.show clicked ");
        //
        //driver.findElement(By.cssSelector("a[href*='account/login']")).click();
        driver.findElement(By.cssSelector("a[href*='account/register']")).click();
        Thread.sleep(2000); // For Presentation
        //System.out.println("\ta[href*='account/login'] clicked");
        System.out.println("\ta[href*='account/register'] clicked");
        //
        /*WebElement email = driver.findElement(By.id("input-email"));
        email.click();
        email.clear();
        email.sendKeys("hahaha@gmail.com");
        Thread.sleep(2000); // For Presentation
        System.out.println("\temail typed");*/
        //
        WebElement fname = driver.findElement(By.id("input-firstname"));
        fname.click();
        fname.clear();
        fname.sendKeys("oksy");
        Thread.sleep(2000); // For Presentation
        System.out.println("\tFirst Name typed");
        //
        WebElement lname = driver.findElement(By.id("input-lastname"));
        lname.click();
        lname.clear();
        lname.sendKeys("lytsus");
        Thread.sleep(2000); // For Presentation
        System.out.println("\tLast Name typed");
        //
        WebElement email = driver.findElement(By.id("input-email"));
        email.click();
        email.clear();
        email.sendKeys("hahaha@gmail.com");
        Thread.sleep(2000); // For Presentation
        System.out.println("\temail typed");
        //
        WebElement password = driver.findElement(By.id("input-password"));
        password.click();
        password.clear();
        password.sendKeys("qwerty\t");
        Thread.sleep(2000); // For Presentation
        System.out.println("\tpassword typed");
        //
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(2000); // For Presentation
        //System.out.println("\tbutton login clicked");
        System.out.println("\tbutton continue clicked");
        //
        Thread.sleep(4000); // For Presentation
        driver.quit();
        //
        System.out.println("\tDone");
    }
}

