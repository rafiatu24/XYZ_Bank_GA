package com.rafiatu.pages.customer;

import com.rafiatu.base.BasePageTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * This test class handles the customer login functionality.
 * It extends BasePageTest to inherit setup and utilities.
 */
public class CustomerLoginPageTest extends BasePageTest {

    /**
     * Test method for logging in as a customer.
     * It simulates a user selecting a customer from a dropdown and clicking the login button.
     */
    @Test
    void testCustomerLoginPage() {

        // Wait until the "Customer Login" button is clickable and then click it
        WebElement customerLoginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Customer Login')]")));
        customerLoginButton.click();

        // Wait until the customer selection dropdown is visible
        WebElement customerDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userSelect")));

        // Select a customer by visible text ("Harry Potter")
        Select userSelect = new Select(customerDropdown);
        userSelect.selectByVisibleText("Harry Potter");

        // Wait until the "Login" button is clickable and then click it
        WebElement LoginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Login')]")));
        LoginButton.click();
    }
}
