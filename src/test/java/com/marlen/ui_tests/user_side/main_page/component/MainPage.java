package com.marlen.ui_tests.user_side.main_page.component;

import drivers.DriverManager;
import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.String.format;

public class MainPage extends BasePage {

    Actions action = new Actions(DriverManager.getDriver());

    private static final String URL = "https://automationintesting.online/#/";
    private static final String HOTEL_LOGO = "//img[contains(@class, 'hotel-logoUrl')]";
    private static final String ROOMS_HEADER_TEXT = "//h2[contains(text(), 'Rooms')]";
    private static final String CONTACT_FORM_BLOCK = "//div[contains(@class, 'row contact')]";
    private static final String SUBMIT_BUTTON = "//button[@id='submitContact']";
    private static final String BUTTON_CONTAINS_TEXT = "//button[contains(text(), '%s')]";
    private static final String ROOM_BOOKING_FORM_INPUT = "//input[@placeholder='%s']";
    private static final String CALENDAR_TABLE = "//div[contains(@class,'rbc-month-view')]";
    private static final String LOCATION_MAP = "//div[contains(@class,'map')]";
    private static final String THANKS_MESSAGE = "//h2[contains(text(),'Thanks for getting in touch ')]";
    private static final String BOOKING_SUCCESS_MESSAGE = "//h3[contains(text(),'%s')]";

    public void openPage() {
        DriverManager.getDriver().get(URL);
    }

    public WebElement hotelLogo() {
        return findElement(By.xpath(HOTEL_LOGO));
    }

    public WebElement roomsHeaderText() {
        return findElement(By.xpath(ROOMS_HEADER_TEXT));
    }

    public WebElement contactFormTab() {
        return findElement(By.xpath(CONTACT_FORM_BLOCK));
    }

    public WebElement submitButton() {
        return findElement(By.xpath(SUBMIT_BUTTON));
    }

    public WebElement buttonContainsText(String buttonName) {
        return findElement(By.xpath(format(BUTTON_CONTAINS_TEXT, buttonName)));
    }

    public WebElement roomBookingFormInput(String inputName) {
        return findElement(By.xpath(format(ROOM_BOOKING_FORM_INPUT, inputName)));
    }

    public WebElement contactFormInput(String inputName) {
        return findElement(By.id(inputName));
    }

    public WebElement calendarTable() {
        return findElement(By.xpath(CALENDAR_TABLE));
    }

    public WebElement locationMap() {
        return findElement(By.xpath(LOCATION_MAP));
    }

    public WebElement thankYouMessage() {
        waitForElementToAppear(THANKS_MESSAGE);
        return findElement(By.xpath(THANKS_MESSAGE));
    }

    public void pickDates(String from, String till) {
        WebElement fromElement = findElement(By.xpath(format(BUTTON_CONTAINS_TEXT, from)));
        WebElement toElement = findElement(By.xpath(format(BUTTON_CONTAINS_TEXT,till)));
        action.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();
    }

    public WebElement bookingSuccessMessage(String message) {
        waitForElementToAppear(format(BOOKING_SUCCESS_MESSAGE, message));
        return findElement(By.xpath(format(BOOKING_SUCCESS_MESSAGE, message)));
    }
}
