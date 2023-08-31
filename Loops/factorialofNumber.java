package Loops;

import java.util.Scanner;

public class factorialofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 1;
        if (number == 0) {
            System.out.println("The Factorial of 0 is:1");
        } else {
            for (int i = 2; i <= number; ++i) {
                sum = sum * i;
            }
            System.out.println("Factorial of " + number + " = " + sum);
        }
    }
}