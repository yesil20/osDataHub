package com.osdatahub.implementation;

import com.osdatahub.pageObjects.MainPage;
import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralImpl extends BaseClass {
    MainPage mainPage = new MainPage();
    public void clickById(String ID){
        returnElement("acceptCookies").click();
    }

    public WebElement returnElement(String element){
        WebElement finalElement = null;
        switch (element){
            case "acceptCookies":
                finalElement = mainPage.acceptCookies;
                break;
        }
        return finalElement;
    }
}
