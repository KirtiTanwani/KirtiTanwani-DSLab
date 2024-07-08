import java.util.Arrays;
import java.util.Scanner;

public class DSlab5q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enetr the number from which you want numbers");
        int index=sc.nextInt();
        char [] array=new char[size],ans=new char[index];
        for(int i=index;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("enter the anagram of it");
        for(int i=index;i<array.length;i++){
           for(int j=0;j<ans.length;j++) {
                ans[i]=sc.nextLine().charAt(0);
                
            }
        }
        Arrays.sort(array);
        Arrays.sort(ans);
        for(int i=index;i<array.length;i++){
            for(int j=0;j<ans.length;j++) {
               if(array[i]==ans[i]){
                System.out.println("its a anagram");
               }
                 
             }
         }
    }
}
