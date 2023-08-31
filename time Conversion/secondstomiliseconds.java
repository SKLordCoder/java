import java.util.Scanner;

public class secondstomiliseconds {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Seconds To Convert Into Miliseconds=");
        int Seconds = Sc.nextInt();
        int Miliseconds = Seconds * 1000;
        System.out.println(Seconds + " Seconds is " + Miliseconds + " Miliseconds");
    }
}
