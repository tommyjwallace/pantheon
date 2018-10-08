package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.*;
import testdata.PledgeData;
import util.Driver;

public class PantheonAbstractTest {

    protected Driver driverInstance;
    protected WebDriver driver;

    // Data
    PledgeData pledgeData;

    // Page Objects
    HomePage homePage;
    PledgePage pledgePage;
    ForumsPage forumsPage;
    SubscriptionPage subscriptionPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void setup() {

        // Setup
        driverInstance = new Driver();
        driver = driverInstance.getDriver();

        // Data
        pledgeData = new PledgeData();

        // Page Objects
        homePage = new HomePage(driver);
        pledgePage = new PledgePage(driver);
        forumsPage = new ForumsPage(driver);
        subscriptionPage = new SubscriptionPage(driver);
        createAccountPage = new CreateAccountPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("**TEST CASE PASSED**");
        driver.quit();
    }

    // Global Methods
    public void print(String statement) {
        System.out.println(statement);
    }
}
