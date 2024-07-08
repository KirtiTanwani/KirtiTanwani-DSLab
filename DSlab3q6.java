import java.util.Scanner;

public class DSlab3q6 {
 public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF array");
    int size=sc.nextInt();
    int [] array=new int[size];
     // displaying&inserting 
     for(int i=0;i<size;i++){
        System.out.println("enter the element in array");
        array[i]=sc.nextInt();

    }
    System.out.println("Enter the two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    for(int i=0;i<array.length;i++){
        if(array[i]==a){
            array[i]=b;
            System.out.println("index is :"+i);
        }
        
    }
    System.out.println("the final array is:");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+",");
    }
 }   
}
