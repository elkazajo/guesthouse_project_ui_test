package com.marlen.ui_tests.admin_side.admin_main_page.steps;

import com.marlen.ui_tests.admin_side.admin_main_page.component.AdminMainPage;
import io.cucumber.java.en.Then;

public class VerifyAdminMainPageSteps {

    private final AdminMainPage adminMainPage = new AdminMainPage();

    @Then("Notification button should be displayed and enabled")
    public void notificationButtonShouldBeDisplayedAndEnabled() {
        adminMainPage.notificationButton().isDisplayed();
        adminMainPage.notificationButton().isEnabled();
    }
}
