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
public class CounterDemo {
    public static void main(String[] args) {
        Counter c;
        c = new Counter();
        c.increment();
        c.increment(3);
        int tmp = c.getCount();
        c.reset();
        
        Counter d = new Counter(5);
        d.increment();
        
        Counter e = d;
        tmp = e.getCount();
        e.increment(2);
    }
}
