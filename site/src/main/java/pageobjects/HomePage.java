package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static util.Driver.driver;

public class HomePage extends BasePage {

    // Web Elements
    @FindBy(css = "#header-part > div > div > div > ul > li:nth-child(2) > a")
    WebElement lnkHeaderLore;
    @FindBy(css = "#header-part > div > div > div > ul > li:nth-child(3) > a")
    WebElement lnkHeaderRaces;
    @FindBy(css = "#header-part > div > div > div > ul > li:nth-child(4) > a")
    WebElement lnkHeaderClasses;
    @FindBy(css = "#header-part > div > div > div > ul > li:nth-child(5) > a")
    WebElement lnkHeaderPledge;
    @FindBy(css = "#header-part > div > div > div > ul > li:nth-child(6) > a")
    WebElement lnkHeaderNews;
    @FindBy(css = "#header-part > div > div > div > ul > li:nth-child(7) > a")
    WebElement lnkHeaderAboutUs;
    @FindBy(css = "#header-part > div > div > div > ul > li:nth-child(8) > a")
    WebElement lnkHeaderForums;

    // Constructor
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Methods
    public void openHomePage() {
        driver.get(baseUrl());
    }

    public boolean isHomePageDisplayed() {
        if(driver.getCurrentUrl().contains("https://pantheonmmo.com")) {
            return true;
        }
        return false;
    }

    public boolean isLoreSectionDisplayed() {
        waitForURLContains("#section1");
        if(driver.getCurrentUrl().contains("#section1")) {
            return true;
        }
        return false;
    }

    public boolean isRacesSectionDisplayed() {
        waitForURLContains("#section2");
        if(driver.getCurrentUrl().contains("#section2")) {
            return true;
        }
        return false;
    }

    public boolean isClassesSectionDisplayed() {
        waitForURLContains("#section3");
        if(driver.getCurrentUrl().contains("#section3")) {
            return true;
        }
        return false;
    }

    public boolean isNewsSectionDisplayed() {
        waitForURLContains("#section4");
        if(driver.getCurrentUrl().contains("#section4")) {
            return true;
        }
        return false;
    }

    public boolean isAboutUsSectionDisplayed() {
        waitForURLContains("#section5");
        if(driver.getCurrentUrl().contains("#section5")) {
            return true;
        }
        return false;
    }

    public void clickHeaderLoreLink() {
        lnkHeaderLore.click();
    }

    public void clickHeaderRacesLink() {
        lnkHeaderRaces.click();
    }

    public void clickHeaderClassesLink() {
        lnkHeaderClasses.click();
    }

    public void clickHeaderPledgeLink() {
        lnkHeaderPledge.click();
    }

    public void clickHeaderNewsLink() {
        lnkHeaderNews.click();
    }

    public void clickHeaderAboutUsLink() {
        lnkHeaderAboutUs.click();
    }

    public void clickHeaderForumsLink() {
        lnkHeaderForums.click();
    }

}
