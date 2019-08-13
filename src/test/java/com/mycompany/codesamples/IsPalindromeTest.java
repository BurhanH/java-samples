/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 *
 * @author baur
 */
public class IsPalindromeTest {
    private IsPalindrome func = new IsPalindrome();
    private String text;
    private boolean expected;
    
    @Test
    public void testIsPalindromePositive() {
        text = "madam";
        expected = true;
        
        assertEquals(expected, func.check(text));
        
    }
    
    @Test
    public void testIsPalindromePositive1() {
        text = "detartrated";
        expected = true;
        
        assertEquals(expected, func.check(text));
        
    }
    
    @Test
    public void testIsPalindromePositive2() {
        text = "Never odd or even";
        expected = true;
        
        assertEquals(expected, func.check(text));
        
    }
    
    @Test
    public void testIsPalindromeNegative() {
        text = "duckduckgo";
        expected = false;
        
        assertEquals(expected, func.check(text));
        
    }
    
    @Test
    public void testIsPalindromeNegative2() {
        text = "supercalifragilisticexpialidocious";
        expected = false;
        
        assertEquals(expected, func.check(text));
        
    }
}
