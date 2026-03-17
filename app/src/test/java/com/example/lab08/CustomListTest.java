package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // Should FAIL (method not implemented yet)
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        list.deleteCity(calgary);

        // Should FAIL initially
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Edmonton", "AB"));

        // Should FAIL initially
        assertEquals(2, list.countCities());
    }
}