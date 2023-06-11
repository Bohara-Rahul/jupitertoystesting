package com.planittesting.cloud.jupiter.pom.pages;

import com.planittesting.cloud.jupiter.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BasePage {
    private final By cartMenu = By.id("nav-cart");

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public ShopPage addToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Buy"))).click();
        return this;
    }

    public String getCartCount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cart-count"))).getText();
    }

    public CartPage clickCartMenu() {
        driver.findElement(cartMenu).click();
        return new CartPage(driver);
    }
}
