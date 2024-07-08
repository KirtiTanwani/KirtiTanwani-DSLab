import java.util.Scanner;

public class DSlab4q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int [] old_arr=new int[size];
        int [] new_array=new int[size-1];
        for(int i=0;i<size;i++){
            System.out.println("enter the number");
            old_arr[i]=sc.nextInt();
        }
        System.out.println("enter the index whose element is to change");
        int index=sc.nextInt();

        for(int i=0;i<size-1;i++){
            if(i<index){
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
