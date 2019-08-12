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
public class ReverseArray {
    
    static int[] reverse(int array[]) {
        int i, n = array.length, j = n;
        int[] reversed = new int[n];
        for (i = 0; i < n; i++) {
            reversed[j - 1] = array[i];
            j -= 1;
        }
        return reversed;
    }
}
