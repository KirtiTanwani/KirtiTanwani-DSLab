import java.util.Scanner;

public class DSlab1q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find it's factorical:");
        int number=sc.nextInt();
        System.out.println(factorical_Recursion.toFindFactoricalByRecursion(number));
    }
}
class factorical_Recursion{
    public static int toFindFactoricalByRecursion( int a){
        if(a==0||a==1){
            return 1;
        }

        return a*toFindFactoricalByRecursion(a-1);
    }
}
