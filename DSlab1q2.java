import java.util.Scanner;

public class DSlab1q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check whether it's odd or even");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("The given number is even.");
        }
        else{
            System.out.println("The given number is odd.");
        }
    }
}
