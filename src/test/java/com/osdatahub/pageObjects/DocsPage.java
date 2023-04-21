package com.osdatahub.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class DocsPage {

    public DocsPage() {
        Driver Driver = null;
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //li[contains(@id, 'Menu')]
    // public List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//li[contains(@id, 'Menu')]"));



    public static List<String> setSideMenu(){
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//li[contains(@id, 'Menu')]"));

        List<String> sideMenuItems = new ArrayList<>();
        for (WebElement eachElement : elements) {
            sideMenuItems.add(eachElement.getText());
        }

        return sideMenuItems;

    }


}