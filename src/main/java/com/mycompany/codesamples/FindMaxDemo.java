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
public class FindMaxDemo {
    public static void main(String[] args) {
        FindMax func = new FindMax();
        
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        System.out.println("Max number is : " + func.findMaxNumber(nums));
        
        Integer[] nums2 = {2, 5, 7, 1, 3, 9};
        System.out.println("Max number is : " + func.findMaxNumber2(nums2));
    }
}
