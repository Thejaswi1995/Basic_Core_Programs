package com.bridgelabz.coreprogram;

public class SwapNumber {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println("The actual value of a =" +a);
        System.out.println("The actual value of b =" +b);
        System.out.println("After swaping of two numbers");
        temp = a;
        a = b;
        b = temp;
        System.out.println("The present value of a =" +a);
        System.out.println("The present value of b =" +b);
    }
}
