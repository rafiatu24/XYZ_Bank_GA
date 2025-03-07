package com.rafiatu.pages.customer;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.rafiatu.base.BasePageTest.wait;

/**
 * This test class handles withdrawal transactions for a customer.
 * It extends CustomerHomePageTest, assuming the user is already logged in.
 */
public class WithdrawalPageTest extends CustomerHomePageTest {

    /**
     * Test method to verify the withdrawal functionality.
     * It simulates clicking the withdrawal button, entering an amount, and submitting the withdrawal request.
     */
    @Test
    public void withdrawalPageTest() {
        // Wait until the "Withdraw" button is clickable and click it
        WebElement WithdrawalButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Withdrawl')]")));
        WithdrawalButton.click();

        // Wait until the input field for withdrawal amount is clickable and enter the amount "200"
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder, 'amount')]")));
        inputField.sendKeys("200");

        // Wait until the "Submit Withdrawal" button is clickable and click it
        WebElement WithdrawalSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")));
        WithdrawalSubmitButton.click();
    }
}
