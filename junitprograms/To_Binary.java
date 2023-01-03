package com.bridgelabs.logicprograms.junitprograms;

import java.util.Scanner;
public class To_Binary {
        public static void toBinary() {
                int num;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number to convert in binary");
                num = scanner.nextInt();
                String binary ="";
                int i = 0;
                int num1;
                while (num > 0) {
                        num1 = num % 2;
                        binary = binary + num1;
                        num = num / 2;
                        i++;
                }
                System.out.println(binary);
                while (binary.length() < 8) {

                        binary = "0" +binary;
                }
                System.out.println("padding of binary is " +binary);
        }
        public static void main(String[] args) {
              To_Binary  .toBinary();
        }
}