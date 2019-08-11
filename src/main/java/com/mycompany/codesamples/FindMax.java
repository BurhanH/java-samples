/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author baur
 */
public class FindMax {
    
    public static int findMaxNumber(Integer [] nums) {
        int max = 0;
        if (nums.length > 0) {
            max = Collections.max(Arrays.asList(nums));
        }
        return max;
    }
    
    public static int findMaxNumber2(Integer [] nums) {
        int max = 0;
        if (nums.length > 0) {
            max = nums[0];
        
            for (int i = 1; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
        }
        return max;
    }
}
