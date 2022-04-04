package com.marlen.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "@runDebug",
        glue = "com.marlen",
        features = "classpath:features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
