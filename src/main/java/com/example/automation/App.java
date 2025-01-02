package com.example.automation;

public class App {
    public static final String GREETING_MESSAGE = "Hello World!";

    public static void main(String[] args) {
        System.out.println(GREETING_MESSAGE);
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
            System.out.println("Test passed: Output matches.");
        }
    }

    public static String getGreeting() {
        return GREETING_MESSAGE;
    }

    public String welcomeMessage(String name) {
        return "Hello, " + (name != null && !name.isEmpty() ? name : "Guest") + "!";
    }
}