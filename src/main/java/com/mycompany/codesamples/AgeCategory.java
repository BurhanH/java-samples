package com.mycompany.codesamples;

/**
 *
 * @author baur
 */
public class AgeCategory {
    public static String getAgeCategory(int age){
        if (age >= 0 && age <= 5) {
            return "Baby";
        } else if (age >= 6 && age <= 11) {
            return "Kid";
        } else if (age >= 12 && age <= 17) {
            return "Teen";
        } else if (age >= 18) {
            return "Adult";
        } else {
            return "Invalid";
        }
    }
}
