import java.util.Scanner;

public class DSlab1q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        int radius=sc.nextInt();
        System.out.println("The area of circle is:"+Math.PI*Math.pow(radius,2));
    }
}
