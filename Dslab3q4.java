import java.util.Scanner;

public class Dslab3q4 {
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
    int index_ofsmallest_no=0,indexof_largest_no=0;
        for(int i=0;i<array.length;i++){
            if(array[index_ofsmallest_no]>array[i]){
                index_ofsmallest_no=i;
            }
            if(array[indexof_largest_no]<array[i]){
                indexof_largest_no=i;
            }
        }
        System.out.println("smallest="+index_ofsmallest_no+" largest="+indexof_largest_no);

 }   
}
