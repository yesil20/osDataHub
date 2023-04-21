package com.osdatahub.pageObjects;

import org.example.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseClass {
    public MainPage(){
        PageFactory.initElements(getDriver(), this); }

    @FindBy(id = "ccc-notify-accept")
    public WebElement acceptCookies;

    public WebElement APIDashboard;

    public WebElement Download;

    public WebElement Docs;

    public WebElement Support;

    public WebElement Pricing;

}
