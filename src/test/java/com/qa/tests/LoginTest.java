package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

//    @Test
//    public void loginTest(){
//        openPage("https://demo.applitools.com/");
//        typeText(By.id("username"),"test");
//        typeText(By.id("password"),"test");
//        clickElement(By.xpath("//input[@type='checkbox']"));
//        clickElement(By.id("log-in"));
//        Assert.assertTrue(isVisible(By.id("time")),"Login page not loaded");
//    }

    @Test
    public void loginTest(){
        openPage("https://demo.applitools.com/");
        loginPage.enterCredentials("test","test");
        loginPage.clickLogin();
        Assert.assertTrue(homePage.isTimeIconVisible(),"Login page not loaded");
    }
}
