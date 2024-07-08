import java.util.Scanner;

public class DSlab3q5 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF array");
    int size=sc.nextInt();
    int [] array=new int[size];
     // displaying&inserting 
     for(int i=0;i<size;i++){
        System.out.println("enter the element in array");
        array[i]=sc.nextInt();

    }int count=0;
    for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]==array[j]){
                count++;
            }
        }
    }
    if(count!=0){
        System.out.println("the array doesn't have duplicate values");
    }
    else{
        System.out.println("the array does have duplicate values");
    }
    }
}
