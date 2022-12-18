package com.beginningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitingForElements
{
    public static void main(String[] args)
    {
        implicitWait();
        explicitWait();
    }
    private static void implicitWait()
    {
        String chromeDriverPath = "C:/Users/yahiram/OneDrive - Intel Corporation/Desktop/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("some url");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    private static void explicitWait()
    {
        String chromeDriverPath = "C:/Users/yahiram/OneDrive - Intel Corporation/Desktop/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("some url");

        // click some button
        driver.findElement(By.id("run test button")).click();

        //set explicit wait :
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.titleContains("Explicit"));

        // verify expected changes :
        if (driver.getTitle().startsWith("Explicit")){
            System.out.println("All good");
        }




    }
}
