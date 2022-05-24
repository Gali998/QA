package com.qa.tests;

import com.qa.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        openPage("https://demo.applitools.com/");
        typeText(By.id("username"),"test");
        typeText(By.id("password"),"test");
        clickElement(By.xpath("//input[@type='checkbox']"));
        clickElement(By.id("log-in"));
        Assert.assertTrue(isVisible(By.id("time")),"Login page not loaded");
    }
}
