package com.osdatahub.implementation;

import com.osdatahub.pageObjects.DocsPage;
import com.osdatahub.pageObjects.MainPage;
import org.example.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GeneralImpl extends BaseClass {
    MainPage mainPage = new MainPage();

    DocsPage docsPage = new DocsPage();
    public void clickByName(String name){
        returnElement(name).click();
    }

    public WebElement returnElement(String element){
        WebElement finalElement = null;
        switch (element.toLowerCase()){
            case "acceptcookies":
                finalElement = mainPage.acceptCookies;
                break;
            case "apidashboard":
                finalElement = mainPage.APIDashboard;
                break;
            case "docs":
                break;
        }
        return finalElement;
    }

    public void verifyPage(String page){
        List<WebElement> pageList = new ArrayList<>();
        switch (page.toLowerCase()) {
            case "main_page":
                pageList.add(mainPage.APIDashboard);
                pageList.add(mainPage.Docs);
                pageList.add(mainPage.Download);
                pageList.add(mainPage.Pricing);
                pageList.add(mainPage.Support);
                break;
        }
        for (WebElement element:pageList) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    public void verifyMenu(String page){
        List<WebElement> pageList = new ArrayList<>();
        switch (page.toLowerCase()) {
            case "docs_page_side_menu":
//                pageList.add();
                // 11 tane soldaki elementleri ekle
                break;
        }
        for (WebElement element:pageList) {
            //side menudeki bir tanesine tikla alt manu acilsin sonra bunun altina 3 tane butonu isdispalyeed
            //element.click();
            // her bir elementin icindeki 3 adet elementi ekle
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isDisplayed());
        }
    }
}
