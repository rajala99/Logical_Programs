package com.bridgelabs.logicprograms.junitprograms;
import java.util.Scanner;

public class Cel_Fah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        double c = sc.nextDouble();
        double f = ((c*9/5+32));
        System.out.println(f+"degree celsius = " +f +"degree fahrenhit");
    }
}
