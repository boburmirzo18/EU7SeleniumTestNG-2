package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElements {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().window().fullscreen();
        driver.get("http://practice.cydeo.com/radio_buttons");
        WebElement green = driver.findElement(By.id("green"));
        green.click();



    }

}
