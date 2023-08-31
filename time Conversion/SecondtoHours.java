import java.util.Scanner;

public class SecondtoHours {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Seconds To Convert Into Hours=");
        int Seconds = Sc.nextInt();
        double Hours = Seconds / 3600;
        System.out.println(Seconds + " Seconds is " + Hours + " Hours");
    }
}
