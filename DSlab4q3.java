import java.util.Scanner;

public class DSlab4q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the number to delete");
        int num=sc.nextInt();
       
        System.out.println("enter the size");
        int size=sc.nextInt();
        int [] old_arr=new int[size];
        int [] new_array=new int[size-1];
        for(int i=0;i<size;i++){
            System.out.println("enter the number");
            old_arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size-1;i++){
            if(old_arr[i]<num){
                new_array[i]=old_arr[i];
            }
            else{
                new_array[i]=old_arr[i+1];
            }
        }for(int i=0;i<size-1;i++){
            System.out.println(new_array[i]);
        }
    }
}
