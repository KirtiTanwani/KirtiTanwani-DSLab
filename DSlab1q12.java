

public class DSlab1q12 {
    public static void main(String[] args) {
        int [] ans=new int[100];int j=0;
       for(int i=1;i<=1000;i++){
        if(i>9&&i<100){
            int a=i%10;
            int b=i/10;
            if(i==(Math.pow(a, 2)+Math.pow(b, 2))){
                ans[j]=i;j++;
            }
        }
        else{
            if(i>99&&i<1001){
                int a=i%10;
                i/=10;
            int b=i%10; int c=i/10;
            if(i==(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3))){
                ans[j]=i;j++;
            }
            }
        }
       } 
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }
}
