package com.bridgelabs.logicprograms.junitprograms;
import java.util.Scanner;

public class Fah_cel {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter temperature in Fahrenhit : ");
        double f = sc.nextDouble();
        double c = ((f-32)*5/9);
        System.out.println(f + "degree fahrenhit = " +c + "degree celsius " );
    }
}
