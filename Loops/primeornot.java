package Loops;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= num / 2; ++i) {
            if ((num % i) == 0) {
                ++count;
            }
        }
        if ((count >= 1 && num != 1) || num < 3)
            System.out.print("Not Prime Number ");
        else
            System.out.print("Prime Number ");

    }
}
