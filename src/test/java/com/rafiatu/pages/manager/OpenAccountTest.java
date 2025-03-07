package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * This test class verifies the functionality of opening a new account.
 * It extends ManagerLoginTest, ensuring the manager is already logged in before proceeding.
 */
public class OpenAccountTest extends ManagerLoginTest {

    /**
     * Test case to open a new account for an existing customer.
     * It selects a customer, chooses a currency, and processes the request.
     *
     * @throws InterruptedException to handle the sleep delay.
     */
    @Test
    public void testOpenAccount() throws InterruptedException {
        // Wait until the 'Open Account' button is clickable and click it
        WebElement OpenAccountButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[contains(text(), 'Open Account')]")
        ));
        OpenAccountButton.click();

        // Wait for the customer dropdown to be visible and select a customer
        WebElement customerDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userSelect")));
        Select userSelect = new Select(customerDropdown);
        userSelect.selectByVisibleText("Harry Potter");

        // Wait for the currency dropdown to be visible and select a currency
        WebElement currencyDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currency")));
        Select currency = new Select(currencyDropdown);
        currency.selectByVisibleText("Dollar");

        // Wait until the 'Process' button is clickable and click it to open the account
        WebElement OpenAccountSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[contains(text(), 'Process')]")
        ));
        OpenAccountSubmitButton.click();

        // Wait for the alert confirmation to appear
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Pause execution for 1 second (consider using explicit waits instead of sleep)
        Thread.sleep(1000);
    }
}
