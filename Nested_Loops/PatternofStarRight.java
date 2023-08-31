package Nested_Loops;

public class PatternofStarRight {
    public static void main(String[] args) {
        int b = 9;
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= b; k++) {
                System.out.print(" ");
            }
            b--;
            b--;
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println("");
        }
    }
}
