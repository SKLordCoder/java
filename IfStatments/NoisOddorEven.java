package IfStatments;

import java.util.Scanner;

public class NoisOddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number To Check Its Odd or Even=");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("\nThe Given Number is an even");
        } else {
            System.out.println("\n The given Number Is An odd ");
        }

    }
}
