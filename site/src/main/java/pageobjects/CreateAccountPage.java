package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static util.Driver.driver;

public class CreateAccountPage extends BasePage {

    // Constructor
    public CreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Methods
    public boolean isCreateAccountPageDisplayed() {
        waitForURLContains("/content/signup");
        if(driver.getCurrentUrl().contains("/content/signup")) {
            return true;
        }
        return false;
    }

}
