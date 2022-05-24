package com.qa.base;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    private static WebDriver driver;

    public void initWebDriver(){
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    //close driver
    public void quitWebDriver(){
        if(null != driver){
            driver.close();
            driver.quit();
        }
    }

    //open driver
    public void openPage(String url){
        driver.get(url);
    }

     //click an icon
    public void clickElement(By locator){
        driver.findElement(locator).click();
    }

    public void typeText(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isVisible(By locator){
        return driver.findElement(locator).isDisplayed();
    }
}
