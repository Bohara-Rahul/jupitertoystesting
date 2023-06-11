package com.planittesting.cloud.jupiter.pom.pages;

import com.planittesting.cloud.jupiter.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    private final By emptyCartBtn = By.linkText("Empty Cart");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getItemName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/form/table/tbody/tr/td[1]")));
    }

    public void getItemPrice() {}

    public CheckoutPage clickCheckoutBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-checkout"))).click();
        return new CheckoutPage(driver);
    }

    public CheckoutPage clickEmptyCardBtn() {
        driver.findElement(emptyCartBtn).click();
        return new CheckoutPage(driver);
    }
}
