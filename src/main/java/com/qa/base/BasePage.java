package com.qa.base;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private static WebDriver driver;
    private static int timeout = 10;

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
        try {
            WebDriverWait wait = new WebDriverWait(driver,timeout);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        }catch (Exception e){
            e.printStackTrace();
        }
        //driver.findElement(locator).click();
    }

    public void typeText(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isVisible(By locator){
        try {
            WebDriverWait wait = new WebDriverWait(driver,timeout);
            return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)))!=null;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        //return driver.findElement(locator).isDisplayed();
    }
}
