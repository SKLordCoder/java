package Temp_Conversion;

import java.util.Scanner;

public class Celcioustoferhenite {
    public static void main(String args[]) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius To Convert Into Fahrenheit =");
        c = sc.nextInt();
        double f = (c * (1.8)) + 32;
        System.out.println("Celsius To Fahrenheit = " + f);

    }
}
