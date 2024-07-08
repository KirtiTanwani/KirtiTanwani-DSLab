import java.util.Scanner;

public class DSlab1q11 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:"
    );int sum=0;
    int number=sc.nextInt();
    for(int i=1;i<=number;i++){
        sum+=i;
    }
    System.out.println(sum);
 }   
}
