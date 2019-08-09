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
public class FindMin {
    public static void main(String[] args) {
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        System.out.println("Min number is : " + findMinNumber(nums));
        
        Integer[] nums2 = {9, 5, -1, 4, 78, 0};
        System.out.println("Min number is : " + findMinNumber(nums2));
    }
    
    public static int findMinNumber(Integer [] nums) {
        int min = 0;
        if (nums.length > 0) {
            min = Collections.min(Arrays.asList(nums));
        }
        return min;
    }
    
    public static int findMinNumber2(Integer [] nums) {
        int min = 0;
        if (nums.length > 0) {
            min = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
        }
        return min;
    }
}
