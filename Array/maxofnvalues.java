package Array;

import java.util.Scanner;

public class maxofnvalues {
    public static void main(String ar[]) {
        System.out.print("Enter the Lenght of array = ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int Max = 0;
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("Enter the value of array = ");
            arr[i] = sc.nextInt();
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        System.out.println("Maximum Number in All These = " + Max);
    }
}
