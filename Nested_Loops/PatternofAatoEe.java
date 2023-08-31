package Nested_Loops;

public class PatternofAatoEe {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= 69; j++) {
                System.out.print(" " + (char) (j) + (char) (j + 32));
            }
            System.out.println("");
        }
    }
}
