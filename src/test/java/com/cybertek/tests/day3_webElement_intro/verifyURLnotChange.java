package com.cybertek.tests.day3_webElement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cybertek.utilities.Driver.driver;


public class verifyURLnotChange {
    public static void main(String[] args) {
        WebDriver drive= WebDriverFactory.getDriver("firefox");
        drive.get("http://practice.cybertekschool.com/forgot_password ");
        //click retrieve password
        WebElement retrievePasswordButton= drive.findElement(By.id("form_submit"));
        String expectedUrl = drive.getCurrentUrl();
        retrievePasswordButton.click();

        String actualUrl= drive.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

       driver.quit();



    }

}
