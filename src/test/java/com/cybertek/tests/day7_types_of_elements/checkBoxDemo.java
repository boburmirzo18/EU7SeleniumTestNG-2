package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBoxDemo {

    @Test

   public void test1 () throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("http:practice.cydeo.com/checkboxes");

        WebElement chechbox1=driver.findElement(By.xpath("//input[1]"));
        WebElement chechbox2=driver.findElement(By.xpath("//input[2]"));

        System.out.println("chechbox1.isSelected() = " + chechbox1.isSelected());
        System.out.println("chechbox2.isSelected() = " + chechbox2.isSelected());

        Assert.assertFalse(chechbox1.isSelected(),"verify checkbox 1 is not selected");
        Assert.assertFalse(chechbox1.isSelected(),"verify checkbox 2 is  selected");

        chechbox1.click();

        Assert.assertTrue(chechbox1.isSelected(),"verify checkbox 21 is  selected");
        Assert.assertFalse(chechbox1.isSelected(),"verify checkbox 2 is  selected");

        Thread.sleep(3000);
        driver.quit();





    }
}
