package com.planittesting.cloud.jupiter.pom.tests;

import com.planittesting.cloud.jupiter.pom.base.BaseTest;
import com.planittesting.cloud.jupiter.pom.objects.DeliveryDetails;
import com.planittesting.cloud.jupiter.pom.objects.PaymentDetails;
import com.planittesting.cloud.jupiter.pom.pages.CheckoutPage;
import com.planittesting.cloud.jupiter.pom.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTests extends BaseTest {
    private CheckoutPage checkoutPage;
    DeliveryDetails deliveryDetails = new DeliveryDetails("John", "Smith", "john@email.com", "12345", "1/24 Selenium Street, Australia");
    PaymentDetails paymentDetails = new PaymentDetails("Visa", "1234 5678 4589");

    @Test
    public void verifyCheckoutError() {
        CheckoutPage checkoutPage = new HomePage(driver)
                .navigateToShopPageUsingLink()
                .addToCart()
                .clickCartMenu()
                .clickCheckoutBtn()
                .clickCheckoutSubmitBtn();
        String forenameErrorMsg = checkoutPage.getErrorMessage("forename");
        String emailErrorMsg = checkoutPage.getErrorMessage("email");
        String addressErrorMsg = checkoutPage.getErrorMessage("address");
        String cardNumberErrorMsg = checkoutPage.getErrorMessage("card");

        assertEquals("Forename is required", forenameErrorMsg);
        assertEquals("Email is required", emailErrorMsg);
        assertEquals("Address is required", addressErrorMsg);
        assertEquals("Credit Card is required", cardNumberErrorMsg);
    }

    @Test
    public void verifySuccessfulCheckout() {
        CheckoutPage checkoutPage = new HomePage(driver)
                .navigateToShopPageUsingLink()
                .addToCart()
                .clickCartMenu()
                .clickCheckoutBtn()
                .enterDeliveryDetails(deliveryDetails)
                .enterPaymentDetails(paymentDetails)
                .clickCheckoutSubmitBtn();
        String successMsg = checkoutPage.getSuccessMessage();
        assertThat(successMsg, containsString("your order has been accepted"));
    }
}
