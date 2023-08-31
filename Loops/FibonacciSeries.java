package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number of Terms of Fibonacci Series = ");
        int n = scanner.nextInt();
        int f1 = 0;
        int s1 = 1;
        System.out.print(f1 + " ");
        System.out.print(s1);
        int pvn = f1 + s1; // 1
        for (int i = 2; i <= n; i++) {
            s1 = pvn - s1;
            pvn = pvn + s1;
            System.out.print(" " + pvn);
        }
    }
}
