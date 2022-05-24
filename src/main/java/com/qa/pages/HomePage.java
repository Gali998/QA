package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By TIME_ICON = By.id("time");

    public boolean isTimeIconVisible(){
        return isVisible(TIME_ICON);
    }
}
