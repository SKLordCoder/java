package Nested_Loops;

public class Patternof121 {
    public static void main(String[] args) {
        int a = 9;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            a--;
            a--;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            if (i > 1) {
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}
