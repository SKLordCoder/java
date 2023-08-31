package Loops;

import java.util.Scanner;

public class TableofNumber {
    public static void main(String df[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number To Print Table= ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = n * i;
            i++;
            System.out.println(n + " x " + i + " = " + sum);
        }
    }

}
