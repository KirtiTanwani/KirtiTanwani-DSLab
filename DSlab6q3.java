import java.util.Scanner;

public class DSlab6q3 {
    public static void main(String[] args) {
     
    }
}
class   Student_Detasils{
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);

    String name,sem;
    int rollno;
    float cpi;
 public void toscandetails(){
     System.out.println("entre the name of student:");
     name=sc.nextLine();
     System.out.println("entre the rollno of student:");
     rollno=sc1.nextInt();
     System.out.println("entre the sem of student:");
     sem=sc.next();
     System.out.println("entre the cpi of student:");
     cpi=sc2.nextFloat();
 }
 public void todisplaydetails(){
    System.out.println("name of student:"+name);
    System.out.println("rollno of student:"+rollno);
    System.out.println("sem of student:"+sem);
    System.out.println("cpi of student:"+cpi);

 }
}
