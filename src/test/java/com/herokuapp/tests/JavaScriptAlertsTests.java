package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptAlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlerts();
    }

    @Test
    public void alertTest(){

        new AlertsPage(driver).clickOnJSAlert();
    }
    @Test
    public void alertConfirmTest(){

        new AlertsPage(driver).confirmAlert("Cancel").verifyConfirm("Cancel");
    }

    @Test
    public void sendMessageToAllertTest(){
        new AlertsPage(driver).sendMessageToAlert("Hello World")
                .verifyMessage("Hello World");
    }
    @AfterMethod
    public void stop(){
        driver.quit();
    }
}
