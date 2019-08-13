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
public class IsPalindromeDemo {
    public static void main(String[] args) {
        IsPalindrome func = new IsPalindrome();
        
        String text = "madam";
        System.out.println("Is this text '" + text + "' palindrome? " + func.check(text));
    }
}
