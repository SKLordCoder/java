package Loops;

import java.util.Scanner;

public class ReverseofGivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number To Find Sum of Digits=");
        int num = sc.nextInt();
        int Reverse = 0;
        int Digit = 0;
        while (num != 0) {
            Digit = num % 10;
            num = num / 10;
            Reverse = (Reverse * 10) + Digit;
        }
        System.out.print("Reverse of digits is " + Reverse + "\n");
    }
}
