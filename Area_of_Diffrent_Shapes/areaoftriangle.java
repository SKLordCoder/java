package Area_of_Diffrent_Shapes;

import java.util.Scanner;

class areaoftriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle=");
        int b = sc.nextInt();
        System.out.print("Enter the Height of triangle=");
        int h = sc.nextInt();
        double area = b * h * 0.5;
        String s = "Area=" + area + "sq units";
        System.out.print("\n" + s + "\n\n");
    }
}