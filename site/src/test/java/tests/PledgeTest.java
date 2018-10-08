package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PledgeTest extends PantheonAbstractTest {

    @Test(enabled = true, groups = {"Smoke", "Regression"})
    public void verifySupporterPledges() {

        /*  Test Case: Verify Supporter Pledges
            Author: Tom Wallace
            Date:   10/8/2018
         */
        print("Test Case: Verify Supporter Pledges");

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
        Assert.assertTrue(pledgePage.isSupporterSectionDisplayed());
        print("Navigated to Supporter section");

        // Verify Watcher's Pledge data
        Assert.assertEquals(pledgePage.getWatchersPledgeAmount(), pledgeData.watchersPledgeAmount());
        print("Verified Watcher's Pledge amount = " + pledgeData.watchersPledgeAmount());

        // Verify Keeper's Pledge data
        Assert.assertEquals(pledgePage.getKeepersPledgeAmount(), pledgeData.keepersPledgeAmount());
        print("Verified Keeper's Pledge amount = " + pledgeData.keepersPledgeAmount());

        // Verify Protector's Pledge data
        Assert.assertEquals(pledgePage.getProtectorsPledgeAmount(), pledgeData.protectorsPledgeAmount());
        print("Verified Protector's Pledge amount = " + pledgeData.protectorsPledgeAmount());

        // Click Buy Watcher's Pledge link
        pledgePage.clickBuyWatchersPledgeLink();
        Assert.assertTrue(subscriptionPage.isSubscriptionPageDisplayed());
        print("Navigated to Subscription page");

        // Select Watcher's Pledge option
        subscriptionPage.clickWatchersPledgeOption();
        subscriptionPage.clickSubmitButton();
        print("Selected Watcher's Pledge option, then clicked Submit");

        // Verify Create Account page displayed
        Assert.assertTrue(createAccountPage.isCreateAccountPageDisplayed());
        print("Create Account page displayed");
    }

}
