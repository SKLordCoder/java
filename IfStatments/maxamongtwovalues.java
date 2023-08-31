package IfStatments;

import java.util.Scanner;

public class maxamongtwovalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("enter the first number =");
        a = sc.nextInt();
        System.out.print("enter the Second number =");
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }
}
