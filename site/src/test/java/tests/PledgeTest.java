package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PledgeTest extends PantheonAbstractTest {

    @Test(enabled = true, groups = {"Smoke", "Regression"})
    public void verifySupporterPledges() {

        // Navigate to Home page
        homePage.openHomePage();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        print("Navigated to Home page");

        // Click header Pledge link
        homePage.clickHeaderPledgeLink();
        Assert.assertTrue(pledgePage.isPledgePageDisplayed());
        print("Navigated to Pledge page");

        // Click Supporter Pledges link
        pledgePage.clickSupporterPledgesLink();

        // TODO
        // Verify Support Pledge page displayed
        // Verify Watcher's Pledge data

        // Click Buy Watcher's Pledge link
        // Verify Subscription Plan page displayed

        // Click Watcher's Pledge (One-time fee of $50.00) radio button

        // Click Continue button
        // Verify Create Account page displayed
        // Verify Email Address textbox displayed
        // Verify Join button displayed

    }
}
