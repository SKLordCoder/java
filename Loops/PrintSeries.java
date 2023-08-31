package Loops;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String df[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Till You Want to Print Series: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
