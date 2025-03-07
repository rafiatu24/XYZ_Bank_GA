package com.rafiatu.pages.customer;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.rafiatu.base.BasePageTest.wait;

/**
 * This test class handles deposit transactions for a customer.
 * It extends CustomerHomePageTest, assuming the user is already logged in.
 */
public class DepositPageTest extends CustomerHomePageTest {

    /**
     * Test method to verify the deposit functionality.
     * It simulates clicking the deposit button, entering an amount, and submitting the deposit.
     */
    @Test
    public void depositPageTest() {
        // Wait until the "Deposit" button is clickable and click it
        WebElement depositButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Deposit')]")));
        depositButton.click();

        // Wait until the input field for the deposit amount is clickable and enter the amount "200"
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder, 'amount')]")));
        inputField.sendKeys("200");

        // Wait until the "Submit Deposit" button is clickable and click it
        WebElement depositSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")));
        depositSubmitButton.click();
    }
}
