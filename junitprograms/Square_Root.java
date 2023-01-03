package com.bridgelabs.logicprograms.junitprograms;

import com.bridgelabs.junitprograms.Utility;

public class Square_Root {
    public static void main(String[] args) {
        System.out.println("Enter positive Integer value ");
        double c = Utility.getIntValue();
        double t = c;
        t = ((c / t) + t) / 2;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = ((c / t) + t) / 2;
        }
        System.out.println(t);
    }
}
