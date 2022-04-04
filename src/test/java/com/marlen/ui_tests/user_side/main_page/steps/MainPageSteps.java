package com.marlen.ui_tests.user_side.main_page.steps;

import com.marlen.ui_tests.user_side.main_page.component.MainPage;
import io.cucumber.java.en.When;

public class MainPageSteps {

    private final MainPage mainPage = new MainPage();

    @When("I open main page")
    public void openMainPage() {
        mainPage.openPage();
    }

    @When("I click on {string} button")
    public void clickOnBookThisRoomButton(String buttonName) {
        mainPage.buttonContainsText(buttonName).click();
    }

    @When("I click on 'Submit' button")
    public void clickOnSubmitButton() {
        mainPage.submitButton().click();
    }
}
