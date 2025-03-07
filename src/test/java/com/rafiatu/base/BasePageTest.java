package com.rafiatu.base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Base test class for setting up and tearing down the WebDriver instance.
 * All test classes should extend this class to inherit the WebDriver configuration.
 */
public class BasePageTest {
    // Shared WebDriver instance for all tests
    protected static WebDriver driver;

    // WebDriverWait instance for explicit waits
    public static WebDriverWait wait;

    /**
     * Sets up the WebDriver before all tests in a test class.
     * Initializes the ChromeDriver, maximizes the window, navigates to the test URL,
     * and verifies the page title.
     *
     * @throws Exception if setup fails
     */
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        // Initialize WebDriver with Chrome
        driver = new ChromeDriver();

        // Initialize WebDriverWait with a timeout of 80 seconds
        wait = new WebDriverWait(driver, Duration.ofSeconds(80));

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to the test website
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        // Verify that the page title is correct
        Assertions.assertEquals("XYZ Bank", driver.getTitle());

        // Print a message if the title matches expected value
        if (driver.getTitle().equals("XYZ Bank")) {
            System.out.println("Test has passed");
        }
    }

    /**
     * Tears down the WebDriver after all tests in a test class.
     * Ensures the browser is closed properly.
     */
    @AfterAll
    static void tearDown() {
        // Quit WebDriver if it is not null
        if (driver != null) {
            driver.quit();
        }
    }
}
