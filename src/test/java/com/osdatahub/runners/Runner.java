package com.osdatahub.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.example.BaseClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        glue = "com/osdatahub/stepdefs",
        dryRun = false
)
public class Runner extends BaseClass{

    @BeforeClass
    public static void setUp(){
        getAndSetVariables();
    }
}