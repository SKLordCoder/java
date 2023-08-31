package Array;

import java.util.Scanner;

public class Sumofoddandevenusingarray {
    public static void main(String ar[]) {
        System.out.print("Enter the Lenght of array = ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int sumo = 0;
        int sume = 0;
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("Enter the value of array = ");
            arr[i] = sc.nextInt();
            if ((arr[i] % 2) == 0)
                sume += arr[i];
            else
                sumo += arr[i];
        }
        System.out.println("Sum of Odd Numbers = " + sumo);
        System.out.println("Sum of Even Numbers = " + sume);
    }

}
