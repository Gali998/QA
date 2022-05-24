package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By REMEMBER_ME = By.xpath("//input[@type='checkbox']");
    private static final By LOGIN_BTN = By.id("log-in");

    public void enterCredentials(String username,String password){
        typeText(USERNAME,username);
        typeText(PASSWORD,password);
    }

    public void clickLogin(){
        clickElement(LOGIN_BTN);
    }

    public void clickCheckMark(){
        clickElement(REMEMBER_ME);
    }

}
