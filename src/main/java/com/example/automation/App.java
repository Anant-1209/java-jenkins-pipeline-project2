package com.example.automation;

/**
 * The App class serves as the entry point for the application.
 * It contains the main method for running the application, along with methods for handling greeting messages and running tests.
 * 
 * This class uses a logger to log messages and provides functionality for:
 * 1. Displaying a greeting message ("Hello World!").
 * 2. Running a test to verify the greeting message.
 * 3. Generating a personalized welcome message based on a user's name.
 * 
 * Usage:
 * - To run the main application, execute the main method.
 * - To run tests, provide "test" as a command-line argument.
 * 
 * Dependencies:
 * - Uses java.util.logging.Logger for logging.
 * 
 * @author [Your Name]
 * @version 1.0
 * @since 2025-01-03
 */
import java.util.logging.Logger;

public class App {
    private static final Logger LOG = Logger.getLogger(App.class.getName());
    public static final String GREETING_MESSAGE = "Hello World!";

    public static void main(String[] args) {
        LOG.info(GREETING_MESSAGE);
        if (args.length > 0 && "test".equals(args[0])) {
            runTests();
        }
    }

    public static void runTests() {
        String expectedOutput = GREETING_MESSAGE;
        String actualOutput = getGreeting();
        if (!expectedOutput.equals(actualOutput)) {
            throw new AssertionError("Test failed: Output mismatch!");
        } else {
            LOG.info("Test passed: Output matches.");
        }
    }

    public static String getGreeting() {
        return GREETING_MESSAGE;
    }

    public String welcomeMessage(String name) {
        String message;
        if (name != null && !name.isEmpty()) {
            message = "Hello, " + name + "!";
        } else {
            message = "Hello, Guest!";
        }
        return message;
    }
}
