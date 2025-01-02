package com.example.automation;

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
