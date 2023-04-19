package com.osdatahub.stepdefs;

import com.osdatahub.implementation.GeneralImpl;
import com.osdatahub.pageObjects.MainPage;
import io.cucumber.java.en.When;
import org.example.BaseClass;

public class GeneralStepDefs extends BaseClass {
    MainPage mainPage =new MainPage();
    GeneralImpl general = new GeneralImpl();

    @When("user open main page on browser")
    public void openMainPage() {
        getDriver().get(url);
        general.clickById("acceptCookies");
    }
}
