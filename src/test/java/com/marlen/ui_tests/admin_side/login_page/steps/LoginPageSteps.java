package com.marlen.ui_tests.admin_side.login_page.steps;

import com.marlen.ui_tests.admin_side.login_page.component.LoginPage;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    private final LoginPage loginPage = new LoginPage();

    @When("I open login page")
    public void openLoginPage() {
        loginPage.openPage();
    }

    @When("I fill in {string} input with {string}")
    public void iFillInUsernameInputWithAdmin(String id, String credentials) {
        loginPage.inputField(id).sendKeys(credentials);
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        loginPage.loginButton().click();
    }
}
