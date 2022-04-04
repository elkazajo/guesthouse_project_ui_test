package com.marlen.hooks;

import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHooks {

    @Before
    public void setupDriver() {
        DriverManager.setupDriver();
    }

    @After
    public void shutDownDriver() {
        DriverManager.driverTearDown();
    }
}
