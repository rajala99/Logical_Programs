package com.bridgelabs.logicprograms.junitprograms;

import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int amount = scan.nextInt();
    int remaining;
        if ( amount >= 1000) {
        remaining = amount / 1000;
        System.out.println("Number of 1000 Rs. note is " + remaining);
        amount = amount % 1000;
        }
        if (amount >= 500) {
            remaining = amount / 500;
            System.out.println("Number of 500 Rs. note is " + remaining);
            amount = amount % 500;
        }
        if (amount >= 100) {
            remaining = amount / 100;
            System.out.println("Number of 100 Rs. note is " + remaining);
            amount = amount % 100;
        }
        if (amount >= 50){
        remaining = amount / 50;
        System.out.println("Number of 50 Rs. note is " + remaining);
        amount = amount % 50;
        }
            if (amount >= 5) {
                remaining = amount / 5;
                System.out.println("Number of 5 Rs. note is " + remaining);
                amount = amount % 5;
            }
            if (amount >= 2) {
                remaining = amount / 2;
                System.out.println("Number of 2 Rs. note is " + remaining);
                amount = amount % 2;
            }
            if (amount == 1) {
                remaining = amount;
                System.out.println("Number of 1 Rs. note is " + remaining);
            }
        }
    }


