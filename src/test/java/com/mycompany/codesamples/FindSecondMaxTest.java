package com.mycompany.codesamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baur
 */
public class FindSecondMaxTest {
    private FindSecondMax func = new FindSecondMax();
    private int expected;
    
    @Test
    public void testFindMaxNumber() {
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        expected = 5;
        
        assertEquals(expected, func.findSecondMax(nums));
        
    }
}
