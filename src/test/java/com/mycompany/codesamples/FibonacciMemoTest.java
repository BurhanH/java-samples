/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
/**
 *
 * @author baur
 */
public class FibonacciMemoTest {
    private FibonacciMemo func = new FibonacciMemo();
    private BigInteger expected, num;
    
    @Test
    public void testFibonacciEight() {
        num = BigInteger.valueOf(8);
        expected = BigInteger.valueOf(21);
        
        assertEquals(expected, func.getSequence(num));
        
    }
    
    @Test
    public void testFibonacciTwo() {
        num = BigInteger.valueOf(2);
        expected = BigInteger.valueOf(1);
        
        assertEquals(expected, func.getSequence(num));
        
    }
    
    @Test
    public void testFibonacciFifty() {
        num = BigInteger.valueOf(50);
        expected = BigInteger.valueOf(12586269025L);
        assertEquals(expected, func.getSequence(num));
        
    }
}
