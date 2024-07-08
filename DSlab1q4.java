import java.util.Scanner;

public class DSlab1q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number to finds it's factorical");
       int number=sc.nextInt();int ans=1;
       for(int i=number;i>0;i--){
        ans=ans*i;
       } 
       System.out.println("the factorical of given bumner id:"+ans);
    }
}
