package com.beginningselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class WebDriverFunctionality {
    public static void main(String[] args) {activityLesson02AutomatinScript();}

    private static void activityLesson02AutomatinScript()
    {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

            String parentWindowHandle = driver.getWindowHandle();
            driver.switchTo().window("SomeWindow");
            driver.close();
            driver.switchTo().window(parentWindowHandle);

//            // return handle to current window
//            driver.getWindowHandle()
//            // switch to a frame inside our main webpage
//            if (driver.getPageSource().contains("Frame Info")){
//                driver.switchTo().frame("Info");
//            }
//            // switch to a iframe inside our frame
//            WebElement someFrame = driver.findElement(By.tagName("iframe"));
//            driver.switchTo().frame(someFrame);
//            // click on button
//            WebElement someButton = driver.findElement(By.id("some-button"));
//            someButton.click();
//            // switch to our main webpage
//            driver.switchTo().defaultContent();


//            Alert someAlert = driver.switchTo().alert();
//            System.out.println("Alert text content: " + someAlert.getText());
//            // if that confirmation alert :"
//            someAlert.accept();
//            // if that confirmation or cancellation alert we can also dismiss:"
//            someAlert.dismiss();
//            // if that confirmation or cancellation alert :"
//            // if that input alert we can write:"
//            someAlert.sendKeys("something");



//            driver.manage().window().fullscreen();
//            System.out.println(String.format("Current window size is %s height x %s width",
//                    driver.manage().window().getSize().getHeight() , driver.manage().window().getSize().getWidth()));


//            if(driver.getTitle().equalsIgnoreCase("Google")){
//                System.out.println("Script worked, the title contains 'Google'");
//            }else{
//                System.out.println("Something went wrong with tje script, 'Google' was not found");
//            }

//            driver.navigate().to("https://www.yahoo.com");
//            if(driver.getTitle().equalsIgnoreCase("Google")){
//                System.out.println("Script worked, the title contains 'Yahoo'");
//            }else{
//                System.out.println("Something went wrong with tje script, 'Yahoo' was not found");
//            }
//
//            driver.navigate().back();

        }finally {
            driver.quit();
        }
    }
}