import java.util.Scanner;

public class DSlab7q1 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Scanner sca=new Scanner(System.in);
    System.out.println("enter the size");
    int size=sc.nextInt();
    Stack s=new Stack(size);
    System.out.println("give any value greater that zero to start programme");
    // int i=sc.nextInt();
    boolean i=true;
    while(i!=false){
        System.out.println("enter 1 to add ,2topop,3to peep, 4to change, 5 to display");
        int j=sc.nextInt();
        switch (j) {
            case 1:
            System.out.println("enter the element to push");
                int ji=sc.nextInt();
                s.push(ji);
                break;
                case 2:
                
                    s.pop();
                    break;
                    case 3:
            System.out.println("enter the index to peep");
                int joi=sc.nextInt();
                s.peep(joi);
                break;
                case 4:
            System.out.println("enter the element to change");
                int jri=sc.nextInt();
                System.out.println("eneter the index to change");
                int jini=sc.nextInt();
                s.change(jri, jini);;
                break;
            case 5:
            s.display();;
            break;
            case 6: i=false; break;
        }
    }
    // switch(i){
    //     case -1: break;
    //     default: for(int l=0;i!= -1;l++) {
    //         System.out.println("enter add to push an element , pop to pop , peep to peep,change to  change& by default we will display");
    //         String a=sca.nextLine();
    //         if(a.equals("add")){
    //             System.out.println("enter the element to push");
    //             int j=sc.nextInt(); s.push(j);
    //         } else if(a.equals("pop")){
    //             System.out.println(s.pop());
    //         }
    //         else if(a.equals("peep")){
    //             System.out.println("enter the index to peep");
    //             int k=sc.nextInt();
    //             s.peep(k);
    //         }
    //         else if(a.equals("change")){
    //             System.out.println("eneter the value to change");
    //             int m=sc.nextInt();
    //             System.out.println("enter the index ");
    //             int n=sc.nextInt();
    //             s.change(m, n);
    //         }

    //         s.display();
    //         i = sc.nextInt();
    //             } 
    //        }
 }   
}
class Stack{
    int size=0,top=-1; int [] array;
    public Stack(int size){
        this.size=size;
        array=new int[size];

    }
    public void push(int value){
        if(top>=size-1){
            System.out.println("Stack Overflow");
        }
        else{
            top+=1;
            array[top]=value;
        }
    }
    public int pop(){
        if(top<=-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            top-=1;
            return array[top+1];
        }
    }
    public int peep(int index){
        if(size-index+1<=0){
            System.out.println("stack undeflow");
            return -1;
        }
        else{
            return array[size-index+1];
        }
    }
    public void change(int value, int index){
        if(size-index+1<=0){
            System.out.println(index+"th element doesn't exists");
        }
        else{
            array[size-index+1]=value;
        }
    }
    public void display(){
        for(int i=array.length;i>0;i--){
            System.out.println(array[i]+",");
        }
    }
}
