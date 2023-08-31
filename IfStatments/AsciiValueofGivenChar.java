package IfStatments;

import java.util.Scanner;

public class AsciiValueofGivenChar {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in);
        char ch1 = input.next().charAt(0);
        System.out.println("The ASCII Value Of " + ch1 + " Is :" + (int) ch1);
    }
}
