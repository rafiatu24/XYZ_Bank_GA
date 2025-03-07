package com.rafiatu.pages.manager;

import com.rafiatu.base.BasePageTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class verifies the manager login functionality.
 * It extends BasePageTest, ensuring access to the WebDriver setup and utilities.
 */
public class ManagerLoginTest extends BasePageTest {

    /**
     * Test case to verify that a manager can successfully log in.
     * It waits for the 'Bank Manager Login' button to be clickable and clicks it.
     *
     * @throws InterruptedException to handle the sleep delay.
     */
    @Test
    public void managerLoginTest() throws InterruptedException {
        // Wait until the 'Bank Manager Login' button is clickable and then click it
        WebElement ManagerLoginButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Bank Manager Login')]"))
        );
        ManagerLoginButton.click();

        // Pause execution for 1 second (consider using explicit waits for better performance)
        Thread.sleep(1000);
    }
}
