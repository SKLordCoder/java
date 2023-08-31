import java.util.Scanner;

public class HourtoMinute {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Hour To Convert Into Minutes=");
        int Hours = Sc.nextInt();
        int Minutes = Hours * 60;
        System.out.println(Hours + " Hours is " + Minutes + " Minutes");

    }
}
