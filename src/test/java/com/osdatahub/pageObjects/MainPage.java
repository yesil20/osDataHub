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

    @FindBy(xpath = "//span[contains(text(),'API Dashboard')]")
    public WebElement APIDashboard;

    @FindBy(xpath = "//span[contains(text(),'Download')]")
    public WebElement Download;


    @FindBy(xpath = "//span[contains(text(),'Docs')]")
    public WebElement Docs;

    @FindBy(xpath = "//span[contains(text(),'Support')]")
    public WebElement Support;

    @FindBy(xpath = "//span[contains(text(),'Pricing')]")
    public WebElement Pricing;

    @FindBy(xpath = "//span[contains(text(),'OS NGD API – Tiles')]")
    public WebElement ngdTilesApi;
    @FindBy(xpath = "//span[contains(text(),'OS Downloads API')]")
    public WebElement downloadsApi;

    @FindBy(xpath = "//span[contains(text(),'OS NGD API – Features')]")
    public WebElement featuresApi;
    @FindBy(xpath = "//span[contains(text(),'OS Linked Identifiers API')]")
    public WebElement linkedIdentifiersApi;
    @FindBy(xpath = "//span[contains(text(),'OS Maps API')]")
    public WebElement mapsApi;


    @FindBy(xpath = "//span[contains(text(),'OS Match & Cleanse API')]")
    public WebElement matchApi;
    @FindBy(xpath = "//span[contains(text(),'OS Names API')]")
    public WebElement namesApi;
    @FindBy(xpath = "//span[contains(text(),'OS Places API')]")
    public WebElement placesApi;
    @FindBy(xpath = "//span[contains(text(),'OS Vector Tile API')]")
    public WebElement vectorApi;
    @FindBy(xpath = "//span[contains(text(),'OAuth 2 API')]")
    public WebElement oauthApi;

    @FindBy(xpath = "//span[contains(text(),'Overview')]")
    public WebElement overview;

    @FindBy(xpath = "//span[contains(text(),'Getting started guide')]")
    public WebElement gettingStarted;

    @FindBy(xpath = "//span[contains(text(),'Technical specification')]")
    public WebElement techSpecification;







}