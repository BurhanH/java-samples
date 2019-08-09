/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.findmax;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author baur
 */
public class FindMax {
    public static void main(String[] args) {
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        System.out.println("Max number is : " + v0(nums));
        
        Integer[] nums2 = {2, 5, 7, 1, 3, 9};
        System.out.println("Max number is : " + v1(nums2));
    }
    
    public static int v0(Integer [] nums) {
        int max = 0;
        if (nums.length > 0) {
            max = Collections.max(Arrays.asList(nums));
        }
        return max;
    }
    
    public static int v1(Integer [] nums) {
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
