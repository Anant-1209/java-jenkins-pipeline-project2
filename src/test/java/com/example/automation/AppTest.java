package com.example.automation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGetGreeting() {
        App app = new App();
        String expected = App.GREETING_MESSAGE;
        String actual = app.getGreeting();
        assertEquals(expected, actual, "Greeting should match the default message.");
    }

    @ParameterizedTest
    @ValueSource(strings = { "Anant", "" })
    void testWelcomeMessage(String name) {
        App app = new App();
        String expected = name.isEmpty() ? "Hello, Guest!" : "Hello, " + name + "!";
        String actual = app.welcomeMessage(name);
        assertEquals(expected, actual, "Welcome message should handle different names correctly.");
    }

    @Test
    void testWelcomeMessageWithNullName() {
        App app = new App();
        String expected = "Hello, Guest!";
        String actual = app.welcomeMessage(null);
        assertEquals(expected, actual, "Welcome message should handle null names correctly.");
    }
}
