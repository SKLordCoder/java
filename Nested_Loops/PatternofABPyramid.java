package Nested_Loops;

public class PatternofABPyramid {
    public static void main(String[] args) {
        int a = 9;
        for (int i = 65; i <= 69; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            a--;
            a--;
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            if (i > 65) {
                for (int j = i - 1; j >= 65; j--) {
                    System.out.print((char) j + " ");
                }
            }
            System.out.println("");
        }
    }
}
