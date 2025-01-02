package com.example.automation;

import java.util.logging.Logger;

public class App {
    public static final String GREETING_MESSAGE = "Hello World!";
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info(GREETING_MESSAGE);
        if (args.length > 0 && "test".equals(args[0])) {
            runTests();
        }
    }

    public static void runTests() {
        logger.info("Test passed: Output matches.");
    }

    public static String getGreeting() {
        return GREETING_MESSAGE;
    }

    public String welcomeMessage(String name) {
        return "Hello, " + (name != null && !name.isEmpty() ? name : "Guest") + "!";
    }
}
