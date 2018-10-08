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
    @FindBy(css = "body > section > div > div > div.col-md-10.col-sm-9 > div > nobr > div:nth-child(4) > div > div > div:nth-child(1) > p:nth-child(4)")
    WebElement lblWatchersPledgeAmount;
    @FindBy(css = "body > section > div > div > div.col-md-10.col-sm-9 > div > nobr > div:nth-child(4) > div > div > div:nth-child(2) > p:nth-child(4)")
    WebElement lblKeepersPledgeAmount;
    @FindBy(css = "body > section > div > div > div.col-md-10.col-sm-9 > div > nobr > div:nth-child(4) > div > div > div:nth-child(3) > p:nth-child(4)")
    WebElement lblProtectorsPledgeAmount;
    @FindBy(css = "body > section > div > div > div.col-md-10.col-sm-9 > div > nobr > div:nth-child(4) > div > div > div:nth-child(1) > h4 > strong > a")
    WebElement lnkBuyWatchersPledge;

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

    public boolean isSupporterSectionDisplayed() {
        waitForURLContains("/join/#supporter");
        if(driver.getCurrentUrl().contains("/join/#supporter")) {
            return true;
        }
        return false;
    }

    public String getWatchersPledgeAmount() {
        String amount = lblWatchersPledgeAmount.getText();
        return amount;
    }

    public String getKeepersPledgeAmount() {
        String amount = lblKeepersPledgeAmount.getText();
        return amount;
    }

    public String getProtectorsPledgeAmount() {
        String amount = lblProtectorsPledgeAmount.getText();
        return amount;
    }

    public void clickSupporterPledgesLink() {
        lnkSupporterPledges.click();
    }

    public void clickBuyWatchersPledgeLink() {
        lnkBuyWatchersPledge.click();
    }

}
