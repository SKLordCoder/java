package Nested_Loops;

public class PatternofStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println("");
        }
    }
}