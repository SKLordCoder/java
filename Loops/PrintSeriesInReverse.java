package Loops;

import java.util.Scanner;

public class PrintSeriesInReverse {
    public static void main(String df[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Till You Want to Print Series in Reverse: ");
        int n = sc.nextInt();
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
