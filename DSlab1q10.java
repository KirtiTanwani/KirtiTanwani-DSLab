import java.util.Scanner;

public class DSlab1q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of days:");
        int days=sc.nextInt();
        int year=days/365;
        days%=365;
        int weeks=days/7;
        days%=7;
        System.out.println("the number of days can be written as:"+year+"years,"+weeks+"weeks,"+days+"days.");
    }
}
