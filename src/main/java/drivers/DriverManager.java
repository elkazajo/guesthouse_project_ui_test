package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {

    private static final int WEBDRIVER_TIMEOUT = 5;
    private static final int PAGE_LOAD_TIMEOUT = 20;
    private static WebDriver driver;

    private DriverManager() {
    }

    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WEBDRIVER_TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void driverTearDown() {
        driver.quit();
        driver = null;
    }
}
