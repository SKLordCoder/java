package IfStatments;

import java.util.Scanner;

public class tenmarksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Percentage:-");
        int mark1 = sc.nextInt();
        if ((mark1 >= 90 && mark1 <= 100))
            System.out.print("A+");
        else if ((mark1 >= 85 && mark1 < 90))
            System.out.print("A");
        else if (((mark1 > 74) && (mark1 < 85)))
            System.out.print("B");
        else if (((mark1 > 60) && (mark1 < 74)))
            System.out.print("C");
        else if (((mark1 > 35) && (mark1 < 60)))
            System.out.print("D");
        else if (((mark1 > 0) && (mark1 < 35)))
            System.out.print("Failed");
        else {
            System.out.println("Wrong Input! Marks Cannot Be Higher Then 100 or lower Than 0");
        }
    }
}
