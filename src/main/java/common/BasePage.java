package common;

import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    private final WebDriverWait webDriverWait;
    private static final int WAIT = 20;

    public BasePage() {
        webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(WAIT));
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement findElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }

    public void waitForElementToAppear(String xpath) {
        webDriverWait.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(By.xpath(xpath))));
    }
}
