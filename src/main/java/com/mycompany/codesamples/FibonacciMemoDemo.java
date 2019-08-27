/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;
import java.math.BigInteger;
/**
 *
 * @author baur
 */
public class FibonacciMemoDemo {
    public static void main(String[] args) {
        FibonacciMemo func = new FibonacciMemo();
        System.out.println(func.getSequence(new BigInteger("50")));
    }
}
