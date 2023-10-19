package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().fullscreen();
        driver.get("http://practice.cydeo.com/radio_buttons");




    }

}
