package com.herokuapp.tests;

import com.herokuapp.pages.DropPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdown();
    }
    @Test
    public void oldStyleSelectMenuTest(){

        new DropPage(driver).selectOldStyle("Option 1");
    }
}
