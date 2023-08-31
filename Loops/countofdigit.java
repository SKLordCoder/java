package Loops;

import java.util.Scanner;

public class countofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number To Find Sum of Digits=");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.print("Count of digits is " + count + "\n");
    }

}
