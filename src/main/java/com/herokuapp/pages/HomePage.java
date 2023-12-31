package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[href='/javascript_alerts']")
    WebElement linkAlerts;
    public HomePage getJavaScriptAlerts() {
       // clickWithJSExecutor(alertsFrameWindows,0,300);
        click(linkAlerts);
        return new HomePage(driver);
    }

    @FindBy(css="[href='/windows']")
    WebElement linkMultipleWindow;
    public HomePage getMultipleWindows() {
        click(linkMultipleWindow);
        return new HomePage(driver);
    }

    @FindBy(css="[href='/dropdown']")
    WebElement linkdropdown;
    public DropPage getDropdown() {
        click(linkdropdown);
        return new DropPage(driver);
    }
}
