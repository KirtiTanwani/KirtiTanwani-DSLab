import java.util.Scanner;

public class DSlab6q4 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the celsius temperature:");
    float cel=sc.nextFloat();
    float fahrenheit=(cel*9/5)+32;
    System.out.println("the fahrenheit temperature is:"+fahrenheit);
   } 
}
