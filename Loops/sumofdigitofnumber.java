package Loops;

import java.util.Scanner;

public class sumofdigitofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number To Find Sum of Digits=");
        int num = sc.nextInt();
        int digit = 0;
        int sum = 0;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            sum += digit;
        }
        System.out.print("\nSum of digits is " + sum + "\n");
    }
}