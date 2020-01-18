package com.mycompany.codesamples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author baur
 */
public class AgeCategoryTest {
    private String expected;

    @Test
    public void testAgeCategoryBaby() {
        expected = "Baby";
        assertEquals(expected, AgeCategory.getAgeCategory(2));
    }

    @Test
    public void testAgeCategoryKid() {
        expected = "Kid";
        assertEquals(expected, AgeCategory.getAgeCategory(7));
    }

    @Test
    public void testAgeCategoryTeen() {
        expected = "Teen";
        assertEquals(expected, AgeCategory.getAgeCategory(14));
    }

    @Test
    public void testAgeCategoryAdult() {
        expected = "Adult";
        assertEquals(expected, AgeCategory.getAgeCategory(21));
    }

    @Test
    public void testAgeCategoryNegative() {
        expected = "Invalid";
        assertEquals(expected, AgeCategory.getAgeCategory(-1));
    }
}
