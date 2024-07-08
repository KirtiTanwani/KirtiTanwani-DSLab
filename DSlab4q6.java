public class DSlab4q6 {
    public static void main(String[] args) {
        int [] a1={1,7,2}, a2={0,2,3};
        int [] ans=new int[2*(a1.length)];
        for(int i=0;i<ans.length;i++){
            ans[i]=a1[i]+a2[i];
            System.out.println(ans[i]);
        }
    }
}
