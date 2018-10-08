package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static util.Driver.driver;

public class ForumsPage extends BasePage {

    // Web Elements
    @FindBy(css = "#header-part > div > a > img")
    WebElement lnkHeaderImage;

    // Constructor
    public ForumsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Methods
    public boolean isForumsPageDisplayed() {
        if(driver.getCurrentUrl().contains("/content/forums")) {
            return true;
        }
        return false;
    }

    public void clickHeaderImage() {
        lnkHeaderImage.click();
    }

}

