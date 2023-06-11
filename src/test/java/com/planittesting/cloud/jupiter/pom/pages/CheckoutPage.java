package com.planittesting.cloud.jupiter.pom.pages;

import com.planittesting.cloud.jupiter.pom.base.BasePage;
import com.planittesting.cloud.jupiter.pom.objects.DeliveryDetails;
import com.planittesting.cloud.jupiter.pom.objects.PaymentDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private CheckoutPage enterForename(String forename) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("forename")));
        e.clear();
        e.sendKeys(forename);
        return this;
    }

    private CheckoutPage enterSurname(String surname) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
        e.clear();
        e.sendKeys(surname);
        return this;
    }

    private CheckoutPage enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    private CheckoutPage enterTelephone(String telephone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("telephone")));
        e.clear();
        e.sendKeys(telephone);
        return this;
    }

    private CheckoutPage enterAddress(String address) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
        e.clear();
        e.sendKeys(address);
        return this;
    }

    public CheckoutPage enterDeliveryDetails(DeliveryDetails deliveryDetails) {
        enterForename(deliveryDetails.getForename())
                .enterSurname(deliveryDetails.getSurname())
                .enterEmail(deliveryDetails.getEmail())
                .enterTelephone(deliveryDetails.getTelephone())
                .enterAddress(deliveryDetails.getAddress());
        return this;
    }

    private CheckoutPage enterCardType(String cardType) {
        Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cardType"))));
        select.selectByVisibleText(cardType);
        return this;
    }

    private CheckoutPage enterCardNumber(String cardNumber) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("card")));
        e.clear();
        e.sendKeys(cardNumber);
        return this;
    }

    public CheckoutPage enterPaymentDetails(PaymentDetails paymentDetails) {
        enterCardType(paymentDetails.getCardType())
                .enterCardNumber(paymentDetails.getCardNumber());
        return this;
    }

    public CheckoutPage clickCheckoutSubmitBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout-submit-btn"))).click();
        return this;
    }

    public String getErrorMessage(String fieldName) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id(fieldName + "-err"))
        ).getText();
    }

    public String getSuccessMessage() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("alert-success"))
        ).getText();
    }
}
