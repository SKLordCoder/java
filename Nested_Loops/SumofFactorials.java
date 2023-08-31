package Nested_Loops;

import java.util.Scanner;

public class SumofFactorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number Till You Want Sum of factorials =");
        int number = scanner.nextInt();
        int sum = 1;
        int sumf = 0;
        for (int i = 1; i <= number; i++) {
            if (number >= 0) {
                sum = 1;
                for (int j = 2; j <= i; j++) {
                    sum = sum * j;
                }
                sumf = sumf + sum;
            }
        }
        if (number == 0) {
            System.out.println("The Factorial of 0 is:1");
        }
        System.out.println("Sum of Factorials = " + sumf);
    }
}
