package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class handles adding a new customer.
 * It extends ManagerLoginTest, assuming the manager is already logged in.
 */
public class AddCustomerPageTest extends ManagerLoginTest {

    /**
     * Test method to verify the add customer functionality.
     * It simulates clicking the "Add Customer" button, entering customer details,
     * submitting the form, and handling the alert confirmation.
     *
     * @throws InterruptedException to handle the sleep delay
     */
    @Test
    public void AddCustomerPageTest() throws InterruptedException {
        // Wait until the "Add Customer" button is clickable and click it
        WebElement AddCustomerButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Add Customer')]")));
        AddCustomerButton.click();

        // Wait for the First Name input field to be visible and enter the first name
        WebElement inputFieldFName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
        inputFieldFName.sendKeys("Rafiatu");

        // Wait for the Last Name input field to be visible and enter the last name
        WebElement inputFieldLName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
        inputFieldLName.sendKeys("Ibrahim");

        // Wait for the Post Code input field to be visible and enter the post code
        WebElement inputFieldPCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Post Code']")));
        inputFieldPCode.sendKeys("12345");

        // Wait until the "Submit" button is clickable and click it
        WebElement AddCustomerSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")));
        AddCustomerSubmitButton.click();

        // Wait for the alert popup to appear and accept it
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        // Pause execution for 1 second (not recommended in real tests, prefer explicit waits)

    }
}
