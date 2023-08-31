package Loops;

import java.util.Scanner;

public class sumofdigitofoddandevendigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number To Find Sum of Digits=");
        int num = sc.nextInt();
        int digit = 0;
        int sumo = 0;
        int sume = 0;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            if ((digit % 2) == 0)
                sume += digit;
            else
                sumo += digit;
        }
        System.out.print("\nSum of Odd digits is " + sumo + "\n");
        System.out.print("\nSum of Even digits is " + sume + "\n");
    }

}
