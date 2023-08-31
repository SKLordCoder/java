package Loops;

import java.util.Scanner;

public class sumofoddandevenofseries {
    public static void main(String df[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Till You Want to Sum of Series: ");
        int n = sc.nextInt();
        int i = 1;
        int sumo = 0;
        int sume = 0;
        while (i <= n) {
            if (i % 2 == 0)
                sume = sume + i;
            else
                sumo = sumo + i;
            i++;
        }
        System.out.println("Sum of Odd Numbers of Series =" + sumo);
        System.out.println("Sum of Even Numbers of Series =" + sume);
    }
}
