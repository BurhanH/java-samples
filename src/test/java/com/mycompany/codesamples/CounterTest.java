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
public class CounterTest {
    private Counter counter;
    private int expected;
    
    @Test
    public void testCounterInitialization() {
        expected = 0;
        counter = new Counter();
        assertEquals(expected, counter.getCount());
        
    }
    
    @Test
    public void testCounterInitializationBy() {
        expected = 2;
        counter = new Counter(expected);
        assertEquals(expected, counter.getCount());
        
    }
    
    @Test
    public void testCounterIncrementation() {
        expected = 1;
        counter = new Counter();
        counter.increment();
        assertEquals(expected, counter.getCount());
        
    }
    
    @Test
    public void testCounterIncrementationByDelta() {
        expected = 3;
        counter = new Counter();
        counter.increment(expected);
        assertEquals(expected, counter.getCount());
        
    }
    
    @Test
    public void testCounterReset() {
        expected = 0;
        counter = new Counter();
        counter.increment();
        counter.reset();
        assertEquals(expected, counter.getCount());
        
    }
    
    @Test
    public void testCounterComplex() {
        counter = new Counter();
        assertEquals(0, counter.getCount());
        counter.increment();
        assertEquals(1, counter.getCount());
        counter.reset();
        assertEquals(0, counter.getCount());
        counter.increment(10);
        assertEquals(10, counter.getCount());
        counter.increment();
        assertEquals(11, counter.getCount());

    }
}
