package com.bridgelabs.logicprograms;

import java.util.Scanner;

public class Coupon_Number {
    public static void main(String[] args) {
        int num;
        int num1;
        int num2=0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many coupons you want to find");
        num = scanner.nextInt();
        boolean[] coupon = new boolean[num];

        while (num2 < num) {
            num1 = (int) ((Math.random() * 10) % num);
            count++;
            if (coupon[num1] == false) {
                num2++;
                coupon[num1] = true;
                System.out.println(num1);
            }
        }
        System.out.println("count of while loop executed is "+ count);
    }
}

