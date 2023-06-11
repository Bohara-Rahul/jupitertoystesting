package com.planittesting.cloud.jupiter.pom.pages;

import com.planittesting.cloud.jupiter.pom.base.BasePage;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
