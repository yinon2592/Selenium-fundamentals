package com.beginningselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCheck {
    public static void main(String[] args) throws InterruptedException {
        String chromeDriverPath = "C:/Users/yahiram/OneDrive - Intel Corporation/Desktop/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver webDriver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addExtensions("example.crx");

        Thread.sleep(10000);
        webDriver.quit();
    }
}
