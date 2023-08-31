package IfStatments;

import java.util.Scanner;

public class NoisWholeorInteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        if (num >= 0)
            System.out.print("The Number is Whole or Integer. ");
        else {
            System.out.print("The Number is Integer.");
        }
    }
}
