import java.util.Scanner;

public class DSlab3q2 {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the no ");
        int start_no=sc.nextInt();
        System.out.println("enter the last no:");
        int end_no=sc.nextInt(); 
        int sum=0;
        for(int i=start_no;i<=end_no;i++){
            sum+=i;
        }
        System.out.println(sum);
        // average of number
        

   } 
}
