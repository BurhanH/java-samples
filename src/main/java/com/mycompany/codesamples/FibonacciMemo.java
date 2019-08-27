/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger; 

/**
 *
 * @author baur
 */
public class FibonacciMemo {
    private static Map<BigInteger, BigInteger> map;
    static {
        map = new HashMap<>();
        map.put(BigInteger.ZERO, BigInteger.ZERO);
        map.put(BigInteger.ONE, BigInteger.ONE);
    }
 
    public static BigInteger getSequence(BigInteger num){
        if (! map.containsKey(num)) {
            BigInteger tmp = getSequence(num.subtract(BigInteger.TWO)).add(getSequence(num.subtract(BigInteger.ONE)));
            map.put(num, tmp);
        }
        return map.get(num);
    }
}
