package IfStatments;

import java.util.Scanner;

public class maxamongthreevalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the first number: ");
        a = sc.nextInt();

        System.out.print("Enter the Second number: ");
        b = sc.nextInt();

        System.out.print("Enter the Third number: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("\nThe maximum among three numbers is " + a);
        } else if (b > a && b > c) {
            System.out.println("\n The Maximum Among Three Numbers Is " + b);
        } else if (c > a && c > b) {
            System.out.println("\nMaximum Among Three Number Is " + c);
        } else {
            System.out.println("All Are Equal");
        }
    }
}
