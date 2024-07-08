public class DSlab4q5 {
    public static void main(String[] args) {
        int [] a1={1,2,3,4},a2={1,2,6,7};
        int [] ans=new int[a1.length];
        for(int i=0;i<ans.length;i++){
            for(int j=i+1;j<ans.length;j++){
                if(ans[i]==ans[j]){
                    ans[j]=ans[i+2];
                }
                System.out.println(ans[i]);
            }
        }
    }
}
