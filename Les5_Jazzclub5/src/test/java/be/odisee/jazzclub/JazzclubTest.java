package be.odisee.jazzclub;

import be.odisee.jazzclub.domain.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JazzclubTest {

    Jazzclub jazzclub;

    @BeforeEach
    public void setUp() {
        // Arrange
        jazzclub = new Jazzclub();
    }

    @Test // REQ0001
    public void testInitJazzclub() {
        // Act
        List<Lid> ledenlijst = jazzclub.getLedenLijst();
        // Assert
        assertNotNull(ledenlijst);
        assertNotEquals(ledenlijst.size(), 0);
    }

    @Test // De methode getLidById is onrechtstreeks nodig voor verschillende REQs
    public void getLidById_WhenNietBeschikbaar_ThenReturnsNull() {
        // Arrange
        // De data setup zorgt ervoor dat er geen lid met lidnummer 99 bestaat
        // Act
        Lid gevondenLid = jazzclub.getLidById(99);
        // Assert
        assertNull(gevondenLid);
    }

    @Test
    public void getLidById_WhenBeschikbaar_ThenReturnsLidObjectMetZelfdeLidnummer() {
        // Arrange
        // De data setup zorgt ervoor dat er geen lid met lidnummer 2 bestaat
        // Act
        Lid gevondenLid = jazzclub.getLidById(2);
        // Assert
        assertNotNull(gevondenLid);
        assertEquals(2, gevondenLid.getLidnummer());
    }
}