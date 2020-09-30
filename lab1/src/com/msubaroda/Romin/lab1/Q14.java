package com.msubaroda.Romin.lab1;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
//         Creating objects of Scanner Class 
        Scanner sc = new Scanner(System.in);
//         Taking input the principle amount
        System.out.print("Enter the Principle: ");
        int principle = sc.nextInt();
//         Taking input the rate
        System.out.print("Enter the Rate: ");
        int rate = sc.nextInt();
//         taking Input the Time
        System.out.print("Enter the Time: ");
        int time = sc.nextInt();
//         Calculating the Simple Intrest
        float si = (principle * rate * time)/100;
        System.out.println("The simple intrest is: " + si);

    }

}
