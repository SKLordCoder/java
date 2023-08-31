package Loops;

import java.util.Scanner;

public class countofoddandevenofseries {
    public static void main(String df[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Till You Want to Count of Series: ");
        int n = sc.nextInt();
        int i = 1;
        int counto = 0;
        int counte = 0;
        while (i <= n) {
            if (i % 2 == 0)
                counte++;
            else
                counto++;
            i++;
        }
        System.out.println("Count of Odd Numbers of Series =" + counto);
        System.out.println("Count of Even Numbers of Series =" + counte);
    }
}
