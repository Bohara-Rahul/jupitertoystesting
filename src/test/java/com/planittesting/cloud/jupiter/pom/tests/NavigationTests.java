package com.planittesting.cloud.jupiter.pom.tests;

import com.planittesting.cloud.jupiter.pom.base.BaseTest;
import com.planittesting.cloud.jupiter.pom.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NavigationTests extends BaseTest {

    @Test
    public void verifyHomePage() {
        String pageTitle = new HomePage(driver).getPageTitle();
        assertEquals("Jupiter Toys", pageTitle);
    }

    @Test
    public void verifyNavigateToShopPageUsingMenu() {
        String currentUrl = new HomePage(driver)
                .navigateToShopPageUsingMenu()
                .getCurrentUrl();
        assertEquals("https://jupiter.cloud.planittesting.com/#/shop", currentUrl);
    }

    @Test
    public void verifyNavigateToShopPageUsingLink() {
        String currentUrl = new HomePage(driver)
                .navigateToShopPageUsingLink()
                .getCurrentUrl();
        assertEquals("https://jupiter.cloud.planittesting.com/#/shop", currentUrl);
    }

    @Test
    public void verifyNavigateToContactPage() {
        String currentUrl = new HomePage(driver)
                .navigateToContactPageUsingMenu()
                .getCurrentUrl();
        assertEquals("https://jupiter.cloud.planittesting.com/#/contact", currentUrl);
    }
}
