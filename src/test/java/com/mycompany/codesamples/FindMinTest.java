/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author baur
 */
public class FindMinTest {
    private FindMin func = new FindMin();
    private int expected;
    
    @Test
    public void testFindMinNumber() {
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        expected = 1;
        
        assertEquals(expected, func.findMinNumber(nums));
        
    }
    
    @Test
    public void testFindMinNumberEmpty() {
        Integer[] nums = {};
        expected = 0;
        
        assertEquals(expected, func.findMinNumber(nums));
        
    }
    
    @Test
    public void testFindMinNumber2() {
        Integer[] nums = {2, 5, 7, 1, -3, 2};
        expected = -3;
        
        assertEquals(expected, func.findMinNumber2(nums));
        
    }
    
    @Test
    public void testFindMinNumber2Empty() {
        Integer[] nums = {};
        expected = 0;
        
        assertEquals(expected, func.findMinNumber2(nums));
        
    }
}
