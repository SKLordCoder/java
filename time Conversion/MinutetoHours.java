import java.util.Scanner;

public class MinutetoHours {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Minutes To Convert Into Hours=");
        int Minutes = Sc.nextInt();
        float Hours = Minutes / 60;
        System.out.println(Minutes + " Minutes is " + Hours + " Hours");
    }
}
