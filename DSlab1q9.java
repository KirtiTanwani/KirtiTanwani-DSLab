import java.util.Scanner;

public class DSlab1q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the seconds :");
        int seconds=sc.nextInt();
        int hours=seconds/3600;
        seconds%=3600;
        int minutes=seconds/60;
        seconds%=60;
        System.out.println("the hours are:"+hours+"HH:"+minutes+"MM:"+seconds+"SS.");
    }
}
