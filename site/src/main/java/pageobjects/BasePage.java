package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static util.Driver.driver;

public class BasePage {

    // Global Variables
    public String baseUrl() {
        return "https://pantheonmmo.com";
    }

    // Global Methods
    public void sleepTime(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

    public void waitForURLContains(String url) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains(url));
    }

}
