package com.rafiatu.pages.customer;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class extends CustomerLoginPageTest and verifies interactions
 * on the Customer Home Page after login.
 */
public class CustomerHomePageTest extends CustomerLoginPageTest {

    /**
     * Test method to check if the transaction button is clickable.
     * Currently, the click action is commented out.
     *
     * @throws InterruptedException to handle the sleep delay
     */
    @Test
    void testClickTransaction() throws InterruptedException {
        // Wait until the 'XYZ Bank' button is clickable
        WebElement transactionButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Transaction')]")));

        // Uncomment the line below if you want to perform the click action
         transactionButton.click();

        // Pause execution for 1 second (not recommended in real tests, prefer explicit waits)

    }
}
