package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static util.Driver.driver;

public class PledgePage extends BasePage {
    // Web Elements
    @FindBy(css = "body > section > div > div > div.col-md-10.col-sm-9 > div > div.container > div > div:nth-child(1) > h3")
    WebElement lnkSupporterPledges;
    @FindBy(css = "body > section > div > div > div.col-md-10.col-sm-9 > div > nobr > div:nth-child(4) > div > div > div:nth-child(1) > h3")
    WebElement lblWatchersPledgeHeader;

    // Constructor
    public PledgePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Methods
    public boolean isPledgePageDisplayed() {
        if(driver.getCurrentUrl().contains("/join/")) {
            return true;
        }
        return false;
    }

    public void clickSupporterPledgesLink() {
        lnkSupporterPledges.click();
    }

}
