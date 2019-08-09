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
public class FindMaxTest {
    
    private FindMax func = new FindMax();
    private int expected;
    
    @Test
    public void testFindMaxNumber() {
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        expected = 7;
        
        assertEquals(expected, func.findMaxNumber(nums));
        
    }
    
    @Test
    public void testFindMaxNumberEmpty() {
        Integer[] nums = {};
        expected = 0;
        
        assertEquals(expected, func.findMaxNumber(nums));
    }
    
    @Test
    public void testFindMaxNumberNegative() {
        Integer[] nums = {-2, 5, -7, -1, 3, 0};
        expected = 5;
        
        assertEquals(expected, func.findMaxNumber(nums));
        
    }
    
    @Test
    public void testFindMaxNumber2() {
        Integer[] nums = {2, 5, 7, 1, 3, 9};
        expected = 9;
        
        assertEquals(expected, func.findMaxNumber2(nums));
        
    }
    
    @Test
    public void testFindMaxNumber2Empty() {
        Integer[] nums = {};
        expected = 0;
        
        assertEquals(expected, func.findMaxNumber2(nums));
    }
    
    @Test
    public void testFindMaxNumber2Negative() {
        Integer[] nums = {-2, 4, -7, -1, 0, 0};
        expected = 4;
        
        assertEquals(expected, func.findMaxNumber2(nums));
        
    }
    
}
