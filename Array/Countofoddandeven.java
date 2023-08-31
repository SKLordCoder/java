package Array;

import java.util.Scanner;

public class Countofoddandeven {
    public static void main(String ar[]) {
        System.out.print("Enter the Lenght of array = ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int Counto = 0;
        int Counte = 0;
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("Enter the value of array = ");
            arr[i] = sc.nextInt();
            if ((arr[i] % 2) == 0)
                Counte++;
            else
                Counto++;
        }
        System.out.println("Count of Odd Numbers = " + Counto);
        System.out.println("Count of Even Numbers = " + Counte);
    }
}
