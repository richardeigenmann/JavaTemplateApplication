package org.me;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Richard
 */
public class AnimalTest {

    public AnimalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Animal.
     */
    @Test
    public void testGetName() {
        Animal crocodile = new Animal("Fred", 4, 20);
        assertEquals("Fred", crocodile.getName());
    }

    /**
     * Test of getLegs method, of class Animal.
     */
    @Test
    public void testGetLegs() {
        Animal crocodile = new Animal("Fred", 4, 20);
        assertEquals(4, crocodile.getLegs());
    }

    /**
     * Test of getSpeed method, of class Animal.
     */
    @Test
    public void testGetSpeed() {
        Animal crocodile = new Animal("Fred", 4, 20);
        assertEquals(20, crocodile.getSpeed());
    }

}
