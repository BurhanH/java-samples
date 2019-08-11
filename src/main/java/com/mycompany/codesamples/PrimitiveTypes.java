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
public class PrimitiveTypes {
    public static void main(String[] args) {
        boolean flag = true;
        boolean debug, verbose; // two variables declared, but not yet initialized
        char grade = 'A';
        byte b = 12;
        short s = 24;
        int i, j, k = 256;  // three variables declared, only k initialized
        long l = 890L;      // note the use of "L" here
        float pi = 3.1416F; // note the use of "F" here
        double e = 2.71828, a = 6.022e23; // both variables are initialized
        
        System.out.println("Flag value: " + flag);
        System.out.println("Grade value: " + grade);
        System.out.println("B value: " + b);
        System.out.println("S value: " + s);
        System.out.println("K value: " + k);
        System.out.println("L value: " + l);
        System.out.println("Pi value: " + pi);
        System.out.println("E and A values: " + e + " ," + a);
    }
}
