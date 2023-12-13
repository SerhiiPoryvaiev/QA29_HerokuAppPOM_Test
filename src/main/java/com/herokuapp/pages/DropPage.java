package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropPage extends BasePage{
    public DropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="dropdown")
    WebElement dropdownList;

    public DropPage selectOldStyle(String option) {
        Select select = new Select(dropdownList);
        select.selectByVisibleText(option);

        List<WebElement> options = select.getOptions();//printed all
        for (int i=0; i<options.size();i++){
            System.out.println(options.get(i).getText());
        }
        return this;
    }
}
