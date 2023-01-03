package com.bridgelabs.logicprograms;

public class Prime_Numbers {
    public static void main(String[] args) {
        int i , j ;
        for(i = 10 ; i<=30 ;i++)
        {
            for(j = 2 ; j<i; j++)
            {
                if(i%j == 0)
                    break;
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }

    }
}
