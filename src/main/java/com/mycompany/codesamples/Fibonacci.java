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
public class Fibonacci {
    public static int getSequence(Integer num){
        if (num < 2) {
            return num;
        }
        return getSequence(num - 2) + getSequence(num - 1);
    }
}
