package Area_of_Diffrent_Shapes;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double l = sc.nextDouble();
        System.out.println("Enter the width of rectangle ");
        double w = sc.nextDouble();
        // area formula
        int a = (int) (l * w);
        System.out.println("Area of Rectangle = " + a);
    }
}
