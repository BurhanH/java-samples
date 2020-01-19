package com.mycompany.codesamples;

/**
 *
 * @author baur
 */
public class DiceDemo {
    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i = 0; i < 3; i++) {
            System.out.println(dice.roll());
        }
    }
}
