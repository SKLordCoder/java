package Temp_Conversion;

import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius To Convert Into Fahrenheit =");
        int f = sc.nextInt();
        double c = (f - 32) * 0.5555555555555556;
        System.out.println("Fahrenheit to Celsius = " + c);

    }
}
