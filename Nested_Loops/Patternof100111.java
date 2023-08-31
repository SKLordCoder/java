package Nested_Loops;

public class Patternof100111 {
    public static void main(String[] args) {
        int b = 9;
        int c = 1;
        for (int i = 1; i <= 5; i++) {
            for (int h = 1; h <= b; h++) {
                System.out.print(" ");
            }
            b--;
            b--;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + c);
            }
            if (c == 0)
                c++;
            else
                c--;
            System.out.println("");
        }
    }
}
