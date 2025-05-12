package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    PetRock rocky;

    @BeforeEach
    void setUp() {
        // Arrange
        this.rocky =  new PetRock("Rocky");
    }

    @Test
    void getName() {
        // Act
        String name = rocky.getName();
        // Assert
        assertEquals("Rocky", name);
    }

    @Test
    void isHappy_AtStart_ReturnsFalse() {
        // Act
        boolean happy = rocky.isHappy();
        // Assert
        assertEquals(false, happy);
    }

    @Test
    void isHappy_AfterPlay_ReturnsTrue() {
        // Act
        rocky.play();
        // Assert
        assertEquals(true, rocky.isHappy());
    }
}
