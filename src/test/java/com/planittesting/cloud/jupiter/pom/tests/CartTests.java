package com.planittesting.cloud.jupiter.pom.tests;

import com.planittesting.cloud.jupiter.pom.base.BaseTest;
import com.planittesting.cloud.jupiter.pom.objects.Product;
import com.planittesting.cloud.jupiter.pom.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTests extends BaseTest {
    Product product = new Product("Teddy Bear", "12.99");

    @Test
    public void addToCart() {
        String cartCount = new HomePage(driver)
                .navigateToShopPageUsingLink()
                .addToCart()
                .getCartCount();
        assertEquals("1", cartCount);
    }

    @Test
    public void verifyRemoveFromCart() {
        new HomePage(driver)
                .navigateToShopPageUsingLink()
                .addToCart()
                .clickCartMenu()
                .clickEmptyCardBtn();
    }

    @Test
    public void verifyCartItemName() {
        WebElement element = new HomePage(driver)
                .navigateToShopPageUsingLink()
                .clickCartMenu()
                .getItemName();
        System.out.println(element);
    }

    @Test
    public void verifyCartItemPrice() {}
}
