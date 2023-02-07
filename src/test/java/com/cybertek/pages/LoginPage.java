package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);

    }

    //driver.findElement(By.id("prependedInput");
    @FindBy(name="_username")
    public static WebElement usernameInput;

    @FindBy(id="preprededInput2")
    public static WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;
}
