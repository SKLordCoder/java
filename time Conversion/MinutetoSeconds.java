import java.util.Scanner;

public class MinutetoSeconds {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Minutes To Convert Into Seconds=");
        int Minutes = Sc.nextInt();
        int Seconds = Minutes * 60;
        System.out.println(Minutes + " Minutes is " + Seconds + " Seconds");

    }
}
