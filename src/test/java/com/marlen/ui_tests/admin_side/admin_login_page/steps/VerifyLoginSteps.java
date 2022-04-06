package com.marlen.ui_tests.admin_side.admin_login_page.steps;

import com.marlen.ui_tests.admin_side.admin_login_page.component.LoginPage;
import com.marlen.ui_tests.admin_side.admin_main_page.component.AdminMainPage;
import io.cucumber.java.en.Then;

public class VerifyLoginSteps {

    private final LoginPage loginPage = new LoginPage();
    private final AdminMainPage adminMainPage = new AdminMainPage();

    @Then("{string}input field is displayed")
    public void usernameInputFieldIsDisplayed(String id) {
        loginPage.inputField(id).isDisplayed();
    }

    @Then("{string} input field is displayed")
    public void passwordInputFieldIsDisplayed(String id) {
        loginPage.inputField(id).isDisplayed();
    }

    @Then("Login button is displayed and enabled")
    public void loginButtonIsDisplayedAndEnabled() {
        loginPage.loginButton().isDisplayed();
        loginPage.loginButton().isEnabled();
    }

    @Then("{string} button should be displayed and enabled")
    public void logoutButtonShouldBeDisplayedAndEnabled(String buttonName) {
        adminMainPage.headerButton(buttonName).isDisplayed();
        adminMainPage.headerButton(buttonName).isEnabled();
    }
}
