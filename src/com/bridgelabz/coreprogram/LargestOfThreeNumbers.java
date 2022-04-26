package com.bridgelabz.coreprogram;
public class LargestOfThreeNumbers {

    public static void main (String[] args){
        int n1 = 10 ,n2 = 1000 , n3 = 100;
        if ( (n1 > n2) && (n1 > n3))

            System.out.println("The greatest number is " +n1);
        else if ( (n2 > n1) && (n2 > n3))
            System.out.println("The greatest number is " +n2);

        else
            System.out.println("The greatest number is " +n3);
    }
}

