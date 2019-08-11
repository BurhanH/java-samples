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
public class FindMinDemo {
    public static void main(String[] args) {
        FindMin func = new FindMin();
        
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        System.out.println("Min number is : " + func.findMinNumber(nums));
        
        Integer[] nums2 = {9, 5, -1, 4, 78, 0};
        System.out.println("Min number is : " + func.findMinNumber(nums2));
    }
}
