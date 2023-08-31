package Nested_Loops;

public class ArmstrongFrom0to1000 {
    public static void main(String[] args) {
        int temp = 0, count = 0, digit = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum = 0;
            count = 0;
            temp = i;
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            temp = i;
            while (temp != 0) {
                digit = temp % 10;
                sum = sum + (int) Math.pow(digit, count);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println("" + i + " is an Armstrong number.");
            }
        }
    }
}
