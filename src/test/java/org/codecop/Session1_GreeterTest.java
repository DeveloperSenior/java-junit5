package org.codecop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Session 1: GreeterTest - Your first tests.
 */
class Session1_GreeterTest {

    // TODO We will add the proper assertions together.
    
    @Test
    @DisplayName("Check that 'Hello Peter', greeter.greet('Peter')")
    void shouldReturnHelloName() {
        Greeter greeter = new Greeter();
        // TODO Check that "Hello Peter", greeter.greet("Peter").
        assertEquals("Hello Peter",greeter.greet("Peter"));
    }

    @Test
    @DisplayName("should return 'Hello' for 'null'")
    void shouldReturnHelloForNull() {
        Greeter greeter = new Greeter();
        // TODO Check that "Hello", greeter.greet(null).
        assertEquals("Hello",greeter.greet(null));
    }

    @Test
    @DisplayName("Check that 'Hello Peter', greeter.greet(' Peter ')")
    void shouldIgnoreWhitespace() {
        Greeter greeter = new Greeter();
        // TODO Check that "Hello Peter", greeter.greet(" Peter ").
        assertEquals("Hello Peter",greeter.greet(" Peter "));
    }
}
