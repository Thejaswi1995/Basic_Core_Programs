package com.bridgelabz.funtionalprogram;
import java.io.PrintWriter;


import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        System.out.println("enter the rows");
        row = scan.nextInt();
        System.out.println("enter the Cols");
        col = scan.nextInt();
        System.out.println("Enter Array Elements :");
        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The array elemats are");
        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++) {
                writer.print(arr[i][j] + " ");
            }
            writer.println();
        }
        writer.close();
    }
}