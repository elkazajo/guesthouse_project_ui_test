package com.marlen.ui_tests.admin_side.admin_main_page.component;

import common.BasePage;
import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class AdminMainPage extends BasePage {

    private static final String URL = "https://automationintesting.online/#/admin";
    private static final String HEADER_BUTTON = "//a[contains(text(), '%s')]";
    private static final String NOTIFICATION_BUTTON = "//span[contains(@class, 'notification')]";

    public void openPage() {
        DriverManager.getDriver().get(URL);
    }

    public WebElement headerButton(String buttonName) {
        return findElement(By.xpath(format(HEADER_BUTTON, buttonName)));
    }

    public WebElement notificationButton() {
        return findElement(By.xpath(NOTIFICATION_BUTTON));
    }
}
