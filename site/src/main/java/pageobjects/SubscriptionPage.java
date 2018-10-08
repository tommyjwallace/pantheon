package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static util.Driver.driver;

public class SubscriptionPage extends BasePage {

    // Web Elements
    @FindBy(id = "package_id_5")
    WebElement optWatchersPledge;
    @FindBy(id = "submit")
    WebElement btnSubmit;

    // Constructor
    public SubscriptionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Methods
    public boolean isSubscriptionPageDisplayed() {
        if(driver.getCurrentUrl().contains("/content/signup")) {
            return true;
        }
        return false;
    }

    public void clickWatchersPledgeOption() {
        optWatchersPledge.click();
    }

    public void clickSubmitButton() {
        btnSubmit.click();
    }

}
