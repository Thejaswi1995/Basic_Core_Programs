package com.bridgelabz.funtionalprogram;
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args)
    {
        double t ,v ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature ");
        t = sc.nextDouble();

        System.out.println("enter the wind speed");
        v = sc.nextDouble();

        if (t < 50 && v < 120) {
            double windChillTemp = 35.74 + 0.6215 * t +  (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("temperature" + t);
            System.out.println("wind speed" + v);
            System.out.println("Wind Chill Temperature is " + windChillTemp);
        }
        else {
            System.out.println("you have enter wrong temperature or speed");
        }
    }
}
