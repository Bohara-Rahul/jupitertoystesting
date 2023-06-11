package com.planittesting.cloud.jupiter.pom.pages;

import com.planittesting.cloud.jupiter.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By shopMenu = By.id("nav-shop");
    private final By contactMenu = By.id("nav-contact");
    private final By startShoppingLink = By.linkText("Start Shopping »");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.findElement(By.tagName("h1")).getText();
    }

    public ShopPage navigateToShopPageUsingMenu() {
        driver.findElement(shopMenu).click();
        return new ShopPage(driver);
    }

    public ContactPage navigateToContactPageUsingMenu() {
        driver.findElement(contactMenu).click();
        return new ContactPage(driver);
    }

    public ShopPage navigateToShopPageUsingLink() {
        driver.findElement(startShoppingLink).click();
        return new ShopPage(driver);
    }
}
