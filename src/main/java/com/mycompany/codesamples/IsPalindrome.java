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
public class IsPalindrome {
    public static boolean check(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length(), forward = 0, backward = length -1;
        
        while (backward > forward) {
            char fChar = clean.charAt(forward++);
            char bChar = clean.charAt(backward--);
            if (fChar != bChar) {
                return false;
            }
        }
        return true;
    }
}
