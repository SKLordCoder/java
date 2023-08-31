package Nested_Loops;

public class Patternofaab {
    public static void main(String[] args) {
        int k = 'a';
        int b = 9;
        for (int i = 1; i <= 5; i++) {
            for (int h = 1; h <= b; h++) {
                System.out.print(" ");
            }
            b--;
            b--;
            k = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + (char) k);
                k = k + 1;
            }
            System.out.println("");
        }
    }
}
