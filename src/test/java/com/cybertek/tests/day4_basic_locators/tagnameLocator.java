package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tagnameLocator {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http:/practice.cybertekschool.com/sign_up");
        driver.findElement(By.tagName("input")).sendKeys("hello");


    }
}
