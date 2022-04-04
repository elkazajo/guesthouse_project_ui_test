package com.marlen.ui_tests.admin_side.admin_main_page.steps;

import com.marlen.ui_tests.admin_side.admin_main_page.component.AdminMainPage;
import io.cucumber.java.en.When;

public class AdminMainPageSteps {

    private final AdminMainPage adminMainPage = new AdminMainPage();

    @When("I open main admin page")
    public void openLoginPage() {
        adminMainPage.openPage();
    }


}
