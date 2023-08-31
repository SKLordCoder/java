package Array;

import java.util.Scanner;

class Sumofnvalues {
    public static void main(String ar[]) {
        System.out.print("Enter the Lenght of array = ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("Enter the value of array = ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum of Entered Numbers = " + sum);
    }
}