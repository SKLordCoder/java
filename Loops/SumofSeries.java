package Loops;

import java.util.Scanner;

public class SumofSeries {
    public static void main(String df[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Till You Want to Sum of Series: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of Series =" + sum);
    }
}
