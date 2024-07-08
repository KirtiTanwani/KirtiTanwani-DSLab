import java.util.Scanner;
public class DSlab3{
    public static void main(String [] args){
        // display& read n numbers
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF array");
    int size=sc.nextInt();
    int [] array=new int[size];
    // displaying&inserting 
    for(int i=0;i<size;i++){
        System.out.println("enter the element in array");
        array[i]=sc.nextInt();

    }
    for(int i=0;i<array.length;i++){
        if(i!=(size-1))
        System.out.print(array[i]+",");
        else
        System.out.println(array[i]+".");
    }
        //sum of mton 
        // 
        // position of smallest&largest
        // 
        




    }

}