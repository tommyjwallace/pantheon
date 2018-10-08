package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends PantheonAbstractTest {

    @Test(enabled = true, groups = {"Smoke", "Regression"})
    public void verifyHeaderLinks() {

        /*  Test Case: Verify Header Links
            Author: Tom Wallace
            Date:   10/7/2018
         */
        print("Test Case: Verify Header Links");

        // Navigate to Home page
        homePage.openHomePage();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        print("Navigated to Home page");

        // Click header Lore link
        homePage.clickHeaderLoreLink();
        Assert.assertTrue(homePage.isLoreSectionDisplayed());
        print("Navigated to Lore section");

        // Click header Races link
        homePage.clickHeaderRacesLink();
        Assert.assertTrue(homePage.isRacesSectionDisplayed());
        print("Navigated to Races section");

        // Click header Classes link
        homePage.clickHeaderClassesLink();
        Assert.assertTrue(homePage.isClassesSectionDisplayed());
        print("Navigated to Classes section");

        // Click header Pledge link
        homePage.clickHeaderPledgeLink();
        Assert.assertTrue(pledgePage.isPledgePageDisplayed());
        print("Navigated to Pledge page");

        // Click header News link
        homePage.clickHeaderNewsLink();
        Assert.assertTrue(homePage.isNewsSectionDisplayed());
        print("Navigated to News section");

        // Click header About Us link
        homePage.clickHeaderAboutUsLink();
        Assert.assertTrue(homePage.isAboutUsSectionDisplayed());
        print("Navigated to About Us section");

        // Click header Forums link
        homePage.clickHeaderForumsLink();
        Assert.assertTrue(forumsPage.isForumsPageDisplayed());
        print("Navigated to Forums page");

        // Click header Image link
        forumsPage.clickHeaderImage();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        print("Navigated to Home page");
    }

}