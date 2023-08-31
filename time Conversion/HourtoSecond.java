import java.util.Scanner;

public class HourtoSecond {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Hour To Convert Into Seconds=");
        int Hours = Sc.nextInt();
        int Seconds = Hours * 3600;
        System.out.println(Hours + " Hours is " + Seconds + " Seconds");

    }
}
