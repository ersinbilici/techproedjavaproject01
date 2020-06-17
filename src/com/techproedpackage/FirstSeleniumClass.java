package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ersn1/Documents/selenium dependencies/drivers/chromedriver.exe");
        //Driver oluşturduk
        WebDriver driver = new ChromeDriver();
        //url'ye gidiyoruz.
        driver.get("https://www.google.com/");
        Thread.sleep(5000);// bu kod ile chrome 5 saniye sonra otomatik kapanacak
        driver.close();
    }
}
