/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.findmax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author baur
 */
public class FindMaxTest {
    
    FindMax func = new FindMax();
    int expected;
    
    @Test
    public void testV0() {
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        expected = 7;
        
        assertEquals(expected, func.v0(nums));
        
    }
    
    @Test
    public void testV0Empty() {
        Integer[] nums = {};
        expected = 0;
        
        assertEquals(expected, func.v0(nums));
    }
    
    @Test
    public void testV0Negative() {
        Integer[] nums = {-2, 5, -7, -1, 3, 0};
        expected = 5;
        
        assertEquals(expected, func.v0(nums));
        
    }
    
    @Test
    public void testV1() {
        Integer[] nums = {2, 5, 7, 1, 3, 9};
        expected = 9;
        
        assertEquals(expected, func.v1(nums));
        
    }
    
    @Test
    public void testV1Empty() {
        Integer[] nums = {};
        expected = 0;
        
        assertEquals(expected, func.v1(nums));
    }
    
    @Test
    public void testV1Negative() {
        Integer[] nums = {-2, 4, -7, -1, 0, 0};
        expected = 4;
        
        assertEquals(expected, func.v0(nums));
        
    }
    
}
