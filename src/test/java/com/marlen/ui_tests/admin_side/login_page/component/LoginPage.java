package com.marlen.ui_tests.admin_side.login_page.component;

import common.BasePage;
import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class LoginPage extends BasePage {

    private static final String URL = "https://automationintesting.online/#/admin";
    private static final String HEADER_LINK_TO_USER_PAGE = "//a[contains(text(), 'B&B Booking Management')]";
    private static final String INPUT_FIELD = "//input[@id='%s']";
    private static final String LOGIN_BUTTON = "//button[@id='doLogin']";

    public void openPage() {
        DriverManager.getDriver().get(URL);
    }

    public WebElement linkToUserPage(String id) {
        return findElement(By.xpath(HEADER_LINK_TO_USER_PAGE));
    }

    public WebElement inputField(String id) {
        return findElement(By.xpath(format(INPUT_FIELD, id)));
    }

    public WebElement loginButton() {
        return findElement(By.xpath(LOGIN_BUTTON));
    }
}
