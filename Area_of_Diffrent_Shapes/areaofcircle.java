package Area_of_Diffrent_Shapes;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle To Calculate Its Area =");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of Circle is " + area + " sq units");
    }
}
