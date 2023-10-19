package com.cybertek.tests.day5_xpath;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 public class XpathLocator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.xpath("//button[text()='Button 1']")).click();


        Thread.sleep(3000);


        driver.quit();












    }
}
