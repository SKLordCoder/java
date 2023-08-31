package Loops;

import java.util.Scanner;

public class countofoddandeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number To Find Sum of Digits=");
        int num = sc.nextInt();
        int digit = 0;
        int counto = 0;
        int counte = 0;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            if ((digit % 2) == 0)
                counte++;
            else
                counto++;
        }
        System.out.print("Count of Odd digits is " + counto + "\n");
        System.out.print("Count of Even digits is " + counte + "\n");
    }
}
