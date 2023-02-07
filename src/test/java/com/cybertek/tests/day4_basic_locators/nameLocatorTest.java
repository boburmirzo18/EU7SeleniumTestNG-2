package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullnameinput=driver.findElement(By.name("full_name"));
        fullnameinput.sendKeys("Bobur");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("polandstudent2207@gmail.com");
        WebElement signup= driver.findElement(By.name("wooden_spoon"));
        signup.click();
        Thread.sleep(3000);
        //lazy wayyy
        driver.findElement(By.id("wooden_spoon")).click();

    }
}
