
import java.util.Scanner;;
public class DSlab5q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int mr=sc.nextInt();
        System.out.println("enter the no. of columns");
        int nc=sc.nextInt();
        int [][]matric1=new int[mr][nc];
        int [][]matric2=new int[mr][nc];
        int [][]matricans=new int[mr][nc];
        for(int i=0;i<mr;i++){
            for(int j=0;j<nc;j++){
                System.out.println("enter the element of matrics1");
                matric1[i][j]=sc.nextInt();
                System.out.println("enter the element of matrics2");
                matric2[i][j]=sc.nextInt();
                matricans[i][j]=matric1[i][j]+matric2[i][j];
            }
        }
        
        for(int i=0;i<mr;i++){
            for(int j=0;j<nc;j++){
                System.out.println(matricans[i][j]);
              
                
                
            }
        }
        
    }
}
