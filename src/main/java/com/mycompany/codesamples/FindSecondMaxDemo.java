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
public class FindSecondMaxDemo {
    public static void main(String[] args) {
        FindSecondMax func = new FindSecondMax();
        
        Integer[] nums = {2, 5, 7, 1, 3, 2};
        System.out.println("Second max number is : " + func.findSecondMax(nums));
    }
}
    
