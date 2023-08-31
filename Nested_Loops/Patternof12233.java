package Nested_Loops;

public class Patternof12233 {
    public static void main(String[] args) {
        int b = 9;
        for (int i = 1; i <= 5; i++) {
            for (int h = 1; h <= b; h++) {
                System.out.print(" ");
            }
            b--;
            b--;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println("");
        }
    }
}
