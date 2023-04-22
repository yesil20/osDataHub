package com.osdatahub.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.example.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        tags = "",
        glue = "com/osdatahub/stepdefs",
        dryRun = false
)
public class Runner extends BaseClass{

    @BeforeClass
    public static void setUp(){
        getAndSetVariables();
    }

    @AfterClass
    public static void after(){
        closeDriver();
    }
}