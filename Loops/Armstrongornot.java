package Loops;

import java.util.Scanner;

public class Armstrongornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number=");
        int num = sc.nextInt();
        int count = 0;
        int numcpy = num;
        int numcpy2 = num;
        int digit = 0;
        Double arms = 0.0;
        while (numcpy != 0) {
            numcpy = numcpy / 10;
            count++;
        }
        while (numcpy2 != 0) {
            digit = numcpy2 % 10;
            numcpy2 = numcpy2 / 10;
            arms = arms + Math.pow(digit, count);
        }
        if ((arms == num)) {
            System.out.print("\nArmstrong");
        } else {
            System.out.print("\nNot armstrong");
        }
    }
}
