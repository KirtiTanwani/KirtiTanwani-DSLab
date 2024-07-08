import java.util.Scanner;

public class DSlab1q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find it's factors");
        int number=sc.nextInt();
        System.out.print("the factor of given number is:");
        for(int i=1;i<(number/2);i++){
            if(number%i==0){
                System.out.print(i+",");
            }
        }
    }
}
