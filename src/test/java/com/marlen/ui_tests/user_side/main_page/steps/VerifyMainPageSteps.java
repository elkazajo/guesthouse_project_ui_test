package com.marlen.ui_tests.user_side.main_page.steps;

import com.marlen.ui_tests.user_side.main_page.component.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyMainPageSteps {

    private final MainPage mainPage = new MainPage();

    @Then("the guest house logo is displayed")
    public void theGuestHouseLogoIsDisplayed() {
        mainPage.hotelLogo().isDisplayed();
    }

    @Then("Rooms title is displayed")
    public void roomsTitleIsDisplayed() {
        mainPage.roomsHeaderText().isDisplayed();
    }

    @Then("Contact form is displayed")
    public void contactFormIsDisplayed() {
        mainPage.contactFormTab().isDisplayed();
    }

    @Then("Map is displayed")
    public void mapIsDisplayed() {
        mainPage.locationMap().isDisplayed();
    }

    @Then("Calendar should be displayed")
    public void calendarShouldBeDisplayed() {
        mainPage.calendarTable().isDisplayed();
    }

    @Then("{string} input field should be displayed at booking block")
    public void inputFieldShouldBeDisplayed(String inputName) {
        mainPage.roomBookingFormInput(inputName).isDisplayed();
    }

    @Then("{string} button should be displayed and active at booking block")
    public void buttonShouldBeDisplayedAndActive(String buttonName) {
        mainPage.buttonContainsText(buttonName).isDisplayed();
        mainPage.buttonContainsText(buttonName).isEnabled();
    }

    @Then("{string} input field should be displayed at contact block")
    public void inputFieldShouldBeDisplayedAtContactBlock(String inputName) {
        mainPage.contactFormInput(inputName).isDisplayed();
    }

    @And("'Submit' button is displayed and active at contact block")
    public void theSubmitButtonIsDisplayedAndActiveAtContactBlock() {
        mainPage.submitButton().isDisplayed();
        mainPage.submitButton().isEnabled();
    }

    @When("fill in {string} input field with my {string}")
    public void fillInNameInputFieldWithMy(String id, String data) {
        mainPage.roomBookingFormInput(id).sendKeys(data);
    }



    @Then("Thank you message should be displayed")
    public void thankYouMessageShouldBeDisplayedWithMy() {
        mainPage.thankYouMessage().isDisplayed();
    }

    @And("I pick dates of my stay from {string} to {string}")
    public void iPickDatesOfMyStayFromTo(String from, String till) {
        mainPage.pickDates(from, till);
    }

    @Then("{string} message should be displayed")
    public void bookingSuccessfulMessageShouldBeDisplayed(String message) {
        mainPage.bookingSuccessMessage(message).isDisplayed();
    }

    @And("{string} button should be displayed and active")
    public void closeButtonShouldBeDisplayedAndActive(String text) {
        mainPage.buttonContainsText(text).isDisplayed();
    }
}
