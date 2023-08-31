package Area_of_Diffrent_Shapes;

import java.util.Scanner;

public class areaofsphere {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double r = sc.nextDouble();
        double sarea = (4) * ((3.14) * (r * r));// multiplying with 10^(-3)
        System.out.printf("%f", sarea);

    }
}
