import java.util.Scanner;

public class DSlab6q5 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        BankAccount [] bank=new BankAccount[10];
        for(int i=0;i<bank.length;i++){
            bank[i].to_get_details();
        
        }
        System.out.println(" do u want to deposit or to check or to withdraw from balance");
        String ans=sc2.nextLine();
        if(ans.equalsIgnoreCase("deposit")){
            System.out.println("enter the amount number");
            int amt=sc3.nextInt();
            System.out.println("enter the amount ");
            int amount=sc3.nextInt();
            bank[amt].to_deposit(amount);
        }
        else if(ans.equalsIgnoreCase("widthdraw")){
            System.out.println("enter the amount number");
            int amt=sc3.nextInt();
            System.out.println("enter the amount ");
            int amount=sc3.nextInt();
            bank[amt].to_withdraw(amount);
     
        }
        else{
            System.out.println("enter the amount number");
            int amt=sc3.nextInt();
           bank[amt].to_check();
     
        }
    }
}
class BankAccount{
    Scanner sc=new Scanner(System.in);
    Scanner SC1=new Scanner(System.in);
    int account_no=0;
    double balance=0;
    String account_holder="";
    public void to_deposit(double a){
        balance+=a;
    }
    public void to_withdraw( double a){
        if(balance<=0|| balance-a<=0){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=a;        
            System.out.println("balane"+balance);

        }   
     } 
     public void to_check(){
        System.out.println("balane"+balance);
     }
    public void to_get_details(){
        System.out.println("Enter your account number: ");
        account_no=sc.nextInt();
        System.out.println("Enter your account holder name: ");
        account_holder=SC1.nextLine();
        System.out.println("Enter your account balance: ");
        balance=sc.nextDouble();

    }
}
