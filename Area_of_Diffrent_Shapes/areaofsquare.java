package Area_of_Diffrent_Shapes;

import java.util.Scanner;

public class areaofsquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square =");
        int a = sc.nextInt();
        double s = a * a;
        System.out.print("Area is " + s + " sq units.");
    }
}
