package com.beginningselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedElementLocation {
    public static void main(String[] args) {activityLesson04AutomatinScript();}
        private static void activityLesson04AutomatinScript (){
            String chromeDriverPath = "C:/Users/yahiram/OneDrive - Intel Corporation/Desktop/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            WebDriver driver = new ChromeDriver();
            driver.get("some url");

            // navigating the DOM (Document Object Model) :



        }
    }
