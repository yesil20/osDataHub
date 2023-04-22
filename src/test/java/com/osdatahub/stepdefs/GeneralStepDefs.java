package com.osdatahub.stepdefs;

import com.osdatahub.implementation.GeneralImpl;
import com.osdatahub.pageObjects.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.BaseClass;

public class GeneralStepDefs extends BaseClass {
    GeneralImpl general = new GeneralImpl();

    @When("user open main page on browser")
    public void openMainPage() {
        getDriver().get(url);
        getDriver().manage().window().maximize();
        general.clickByName("acceptCookies");
    }

    @And("the user verifies {string} elements")
    public void verifyPage(String page) {
        general.verifyPage(page);
    }

    @When("the user verifies {string} on {string} page")
    public void navigateAndVerify(String menu, String page) {
        general.clickByName(page);
        general.verifyMenu(menu);
    }

    @Given("the user calls API {string} and verifies {string} as {string}")
    public void verifyResponse(String endpoint, String verify, String expectedResult) {
        general.verifyResponse(general.callAPI(endpoint), verify,expectedResult);
    }
}
