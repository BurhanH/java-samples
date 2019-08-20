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
public class FibonacciDemo {
    public static void main(String[] args) {
        Fibonacci func = new Fibonacci();
        
        System.out.println(func.getSequence(8));
    }
}
