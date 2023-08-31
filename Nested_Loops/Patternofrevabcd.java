package Nested_Loops;

public class Patternofrevabcd {
    public static void main(String[] args) {
        int a = 97;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) a++ + " ");
            }
            System.out.println("");
        }
    }
}
