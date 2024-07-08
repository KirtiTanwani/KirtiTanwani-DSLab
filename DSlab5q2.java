
import java.util.Scanner;;
public class DSlab5q2 {
    public static void main(String[] args) {
    int[][] matric1=new int [3][2];
    int[][] matric2=new int[2][3];
    int [][] matricans=new int[3][3];
    Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("eneter the element in matrics 1");
                matric1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("eneter the element in matrics 2");
                matric2[i][j]=sc.nextInt();
            }
        }
        int k=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             if(j==1){
                matricans[i][j]=matric1[i][j]*matric2[k][k]+matric1[i][k+1]*matric2[k+1][k];
             }  
             if(j==2){
                matricans[i][j]=matric1[i][j-1]*matric2[k][j]+matric1[i][j]*matric2[i][j];
             } if(j==3){
                matricans[i][j]=matric1[i][k]*matric2[k][j]+matric1[i][j-1]*matric2[k+1][j];
             } 
                
                System.out.println(matricans[i][j]);
            }
        }
        
    }
}