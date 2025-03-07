package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class verifies that a manager can access the 'Customers' page.
 * It extends ManagerLoginTest, ensuring the manager is logged in before navigation.
 */
public class CustomersTest extends ManagerLoginTest {

    /**
     * Test case to navigate to the 'Customers' page.
     * It waits for the 'Customers' button to be clickable and clicks it.
     *
     * @throws InterruptedException to handle the sleep delay.
     */
    @Test
    public void customerTest() throws InterruptedException {
        // Wait until the 'Customers' button is clickable and then click it
        WebElement customerButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Customers')]"))
        );
        customerButton.click();

        // Pause execution for 10 seconds (consider using an explicit wait for better efficiency)

    }
}
