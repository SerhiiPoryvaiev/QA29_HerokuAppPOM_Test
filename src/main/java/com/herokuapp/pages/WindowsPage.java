package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[href='/windows/new']")
    WebElement newWindow;
    public WindowsPage switchToNextTab(int index) {
        click(newWindow);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));

        return this;
    }

    @FindBy(css="[class='example']")
    WebElement example;
    public WindowsPage verifyNewTabMessage(String text) {
        Assert.assertTrue(shouldHaveText(example,text,15));
        return this;
    }
}
