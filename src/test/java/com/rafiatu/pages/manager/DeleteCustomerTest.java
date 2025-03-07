package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class verifies the functionality of deleting a customer.
 * It extends CustomersTest, ensuring the manager has already accessed the 'Customers' page.
 */
public class DeleteCustomerTest extends CustomersTest {

    /**
     * Test method to delete a specific customer based on their unique identifier.
     * It locates the delete button for the customer with ID 'E725JB' and clicks it.
     */
    @Test
    public void deleteCustomer() {
        // Wait until the delete button for the specified customer ID ('E725JB') is clickable and then click it
        WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//td[contains(text(), 'E725JB')]/following-sibling::td/button[contains(text(), 'Delete')]")
        ));
        deleteButton.click();
    }
}
