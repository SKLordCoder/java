package Loops;

import java.util.Scanner;

public class Palindromeornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number=");
        int num = scanner.nextInt();
        int numcpy = num;
        int numrev = 0;
        int digit = 0;
        while (numcpy != 0) {
            digit = numcpy % 10;
            numcpy = numcpy / 10;
            numrev = (numrev * 10) + digit;
        }
        if ((num == numrev)) {
            System.out.println(num + " is palindrom");
        } else {
            System.out.println(num + " is not palindrom");
        }
    }
}
