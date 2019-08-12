/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author baur
 */
public class ReveseArrayTest {
    
    @Test
    public void testReverseArray() {
        int[] array = {1, 2, 3, 4, 5, 6}, expected = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, ReverseArray.reverse(array));
        
    }
    
    @Test
    public void testReverseArray2() {
        int[] array = {-1, -2, 5, 6}, expected = {6, 5, -2, -1};
        assertArrayEquals(expected, ReverseArray.reverse(array));
        
    }
}
