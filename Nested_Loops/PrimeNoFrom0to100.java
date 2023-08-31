package Nested_Loops;

public class PrimeNoFrom0to100 {
    public static void main(String[] args) {
        boolean Prime = false;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                } else {
                    Prime = true;
                }
            }
            if (Prime == true) {
                System.out.println("The number is prime : " + i);
            }
        }
    }
}

