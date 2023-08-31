package Area_of_Diffrent_Shapes;

import java.util.Scanner;

public class areaofcone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1 = scanner.nextInt();
        double h = scanner.nextInt();
        double l = Math.sqrt((r1 * r1) + (h * h));
        double area = (3.14 * r1 * l) + (3.14 * r1 * r1);
        System.out.printf("Area=" + area);
    }
}
