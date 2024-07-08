import java.util.Scanner;

public class DSlab6q2 {
    public static void main(String[] args) {
    Employee_details ed=new Employee_details();
    ed.to_get_details();
    ed.to_display_details();        
    }
}
class Employee_details{
    String name="",designation="";
    int age=0,employee_id=0,salary=0;
    public  void to_get_details(){

        Scanner sc1=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee name");
         name = sc.nextLine();
        System.out.println("enter the employee id");
         employee_id=sc1.nextInt();
        System.out.println("enter employee designation:");
     designation=sc.nextLine();
        System.out.println("enter employee salary:");
         salary=sc1.nextInt();
      }
      public  void to_display_details(){
        System.out.println("employee name:"+name);
        System.out.println("employee id:"+employee_id);
        System.out.println("employee designation:"+designation);
        System.out.println("employee salary:"+salary);
      }
}
