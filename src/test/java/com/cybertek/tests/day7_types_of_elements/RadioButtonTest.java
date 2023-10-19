package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test

    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().fullscreen();
        driver.get("http://practice.cydeo.com/radio_buttons");


        //locating radio button

        WebElement blue = driver.findElement(By.cssSelector("#blue"));
        WebElement red = driver.findElement(By.id("red"));


        System.out.println("blueRadioBtn.isSelected() = " + blue.isSelected());
        System.out.println("redRadioBtn.isSelected() = " + red.isSelected());




        Assert.assertTrue(blue.isSelected(),"verify that blue is selected ");

        Assert.assertFalse(red.isSelected(),"verify that red is not selected ");

        red.click();

        Assert.assertFalse(blue.isSelected(),"verify that blue is not selected ");

        Assert.assertTrue(red.isSelected(),"verify that red is not selected ");



        Thread.sleep(3000);
        driver.quit();



    }

}
