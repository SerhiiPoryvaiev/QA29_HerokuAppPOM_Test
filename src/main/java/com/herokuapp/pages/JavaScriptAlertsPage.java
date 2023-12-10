package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends BasePage {
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }
    public JavaScriptAlertsPage selectAlerts() {
        return new JavaScriptAlertsPage(driver);
    }
}
