/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

/**
 *
 * @author baur
 */
public class FindSecondMax {
    
    public static int findSecondMax(Integer [] nums) {
        int maxOne = 0, maxTwo = 0;
        if (nums.length > 0) {
            maxOne = nums[0];
        
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > maxOne) {
                    maxTwo = maxOne;
                    maxOne = nums[i];
                }
            }
        }
        return maxTwo;
    }
}
