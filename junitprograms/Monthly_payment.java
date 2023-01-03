package com.bridgelabs.logicprograms.junitprograms;

import java.util.Scanner;

public class Monthly_payment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value :");
        double p = scan.nextDouble();
        double y = scan.nextDouble();
        double R = scan.nextDouble();
        double n = 12 * y ;
        double r = R /( 12 * 100 );
        double payment = ( p * r)/(1-Math.pow((1 + r),(-n)));
        System.out.println(payment);
    }
}
