import java.util.Scanner;

public class DSlab1q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter teh number to find it's prime or not");
        int number=sc.nextInt(); int count=0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count!=0){
            System.out.println("the given is not a prime");
        }
        else{
            System.out.println("thegiven number isnot prime.");
        }
    }
}
