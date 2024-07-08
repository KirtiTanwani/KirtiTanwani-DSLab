import java.util.Scanner;

public class DSlab6q1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
    System.out.println("enter the numbers to swap:");
    int number1=sc.nextInt();
    int number2=sc.nextInt();
    System.out.println("Enter to swap with temp variable or not:");
    String swap_by=sc1.nextLine();
   Solution.to_swap(number1, number2, swap_by);
    }
}
class Solution{
    public static void to_swap(int number1,int number2,String swap_by){
    System.out.println("the numbers before swaping are:"+number1+"& "+number2);
    if(swap_by.equalsIgnoreCase("by temp")){
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("the numbers after swaping  by temp are :"+number1+" &"+number2);
    }
    else{
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
    }
    System.out.println("the numbers after swaping are :"+number1+" &"+number2);
}}