package Nested_Loops;

public class PatternofPyramid {
    public static void main(String[] args) {
        int a = 9;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            a--;
            a--;
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println("");
        }
    }
}
