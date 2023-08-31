package Array;

import java.util.Scanner;

public class minimumfromnvalues {
    public static void main(String ar[]) {
        System.out.print("Enter the Lenght of array = ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of array = ");
            arr[i] = sc.nextInt();
            Min = Math.min(Min, arr[i]);
        }
        System.out.println("Minimum Number in All These = " + Min);
    }
}
// Pending Program