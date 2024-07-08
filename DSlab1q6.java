import java.util.Scanner;

public class DSlab1q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        int base=sc.nextInt();int ans=1;
        System.out.println("Enter its power");
        int power=sc.nextInt();
        for(int i=power;i>0;i--){
            ans=ans*base;
        }
        System.out.println("the number is:"+ans);
    }
}
