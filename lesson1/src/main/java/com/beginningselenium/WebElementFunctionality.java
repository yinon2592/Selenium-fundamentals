package com.beginningselenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebElementFunctionality {
    public static void main(String[] args) {activityLesson03AutomatinScript();}
    private static void activityLesson03AutomatinScript()
    {
        String chromeDriverPath = "C:/Users/yahiram/OneDrive - Intel Corporation/Desktop/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("some url");
// find elemnts :

        // Using id (usually unique):
        WebElement lastName = driver.findElement(By.id("lastName"));
        // Using class name  :
        WebElement firstName = driver.findElement(By.className("form-control"));
        // Using tag name  :
        List<WebElement> div = driver.findElements(By.tagName("div"));
        // Using link   :
        WebElement spanishLink = driver.findElement(By.linkText("Spanish"));
        String link = spanishLink.getAttribute("href");
        // Using xpath   (try to avoid that as much as possible, CSS is better option):
        Select dayOfBirth = new Select(driver.findElement(By.xpath("//select")));
        // Using CSS (can be used to find elements from prev elements usimg parent-child-sibling DOM connections,
        // inspect the webpage end type document.querySelector("ul#lisr") for instance):
        WebElement firstNameWithCss = driver.findElement(By.cssSelector("#firstName"));




//// handle radio buttons  && check boxes:
//        WebElement masters = driver.findElement(By.cssSelector("input[value='masters']"));
//        if (masters.isEnabled() && masters.isDisplayed()){
//            if (!masters.isSelected()){
//                masters.click();
//            }
//        }

        // handle lists :
//        Select singleChoiceList = new Select(driver.findElement(By.id("monthOfBirth")));
//        if (!singleChoiceList.isMultiple() && singleChoiceList.getOptions().size() ==13){
//            System.out.println("the list does not accept multiple choices and contains 13 options");
//            singleChoiceList.selectByVisibleText("February");
//            if (singleChoiceList.getFirstSelectedOption().getText().equalsIgnoreCase("February")){
//                System.out.println("All good");
//            }
//        }
//
//        Select multipleChoiceList = new Select(driver.findElement(By.id("hobbies")));
//        if (multipleChoiceList.isMultiple() && multipleChoiceList.getOptions().size() == 4){
//            multipleChoiceList.selectByVisibleText("Reading");
//            multipleChoiceList.selectByVisibleText("Sports");
//            multipleChoiceList.selectByVisibleText("Traveling");
//
//            multipleChoiceList.deselectByVisibleText("Reading");
//
//            if (multipleChoiceList.getAllSelectedOptions().size() == 2){
//                System.out.println("All good");
//            }
//            List<String> expectedSelection = Arrays.asList("Reading", "Traveling");
//            List<String> actualSelection = new ArrayList<String>();
//            for (WebElement element : multipleChoiceList.getAllSelectedOptions()){
//                actualSelection.add(element.getText());
//            }
//            if (actualSelection.containsAll(expectedSelection)){
//                System.out.println("All good");
//            }
//        }


//        WebElement textArea = driver.findElement(By.id("some text title");
//        if (textArea.isEnabled() && textArea.isDisplayed()){
//            System.out.println("All good");
//        }
//        if ("".equals(textArea.getAttribute("value"))){
//            System.out.println("text area is empty");
//        }
//        textArea.sendKeys("some text");
//        textArea.clear();




//        WebElement someElement = driver.findElement(By.id("some id"));
//        int tries =0;
//        while(tries<2){
//            try {
//                someElement.sendKeys("some keys");
//            }
//            // refresh the element
//            catch (StaleElementReferenceException e){
//                someElement = driver.findElement(By.id("some id"));
//            }
//        }
    }
}
