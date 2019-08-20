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
public class FibonacciTest {
    private Fibonacci func = new Fibonacci();
    private int expected;
    
    @Test
    public void testFibonacciEight() {
        Integer num = 8;
        expected = 21;
        
        assertEquals(expected, func.getSequence(num));
        
    }
    
    @Test
    public void testFibonacciTwo() {
        Integer num = 2;
        expected = 1;
        
        assertEquals(expected, func.getSequence(num));
        
    }
    
    @Test
    public void testFibonacciThirty() {
        Integer num = 30;
        expected = 832040;
        
        assertEquals(expected, func.getSequence(num));
        
    }
}
