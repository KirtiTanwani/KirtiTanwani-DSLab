import java.util.Scanner;

public class DSlab3q3 {
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
    int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("  "+(sum/(array.length)));
    }
}
