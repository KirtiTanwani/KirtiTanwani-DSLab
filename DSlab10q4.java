import java.util.Scanner;

public class DSlab10q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
       Node first_pointer=new Node(0);
       Node first_pointer2=new Node(0);
        Linked_list l=new Linked_list();
        Linked_list l2=new Linked_list();
        int i=0,j=0;
        first_pointer=null;
        first_pointer2=null;
        while(i!=-1){
            System.out.println("enter the number to insert in linkedlist:");
             i=sc.nextInt();
                Node n1= new Node(i);
                first_pointer=l.toInssertInLinkedlist(n1, first_pointer);
                System.out.println("enter -1 to stop inserting");
        }
        while(j!=-1){
            System.out.println("enter the number to insert in linkedlist:");
             j=sc.nextInt();
                Node n1= new Node(i);
                first_pointer2=l2.toInssertInLinkedlist(n1, first_pointer2);
                System.out.println("enter -1 to stop inserting");
        }
        System.out.println("the two list are :"+l.toCheck(first_pointer, first_pointer2)+" to each other.");
    }
}

class Node{
    int data;
    Node link;
    public Node(int data){
        this.data=data;
        link=null;
    }
}
//  Node n1=new Node(0);
class Linked_list{
    public Node toInssertInLinkedlist(Node n, Node first_pointer){
        if(first_pointer==null){
            first_pointer=n;
            return first_pointer;
        }
        else{
            Node point=first_pointer;
            while(point.link!=null){
                point=point.link;
            }
            point.link=n;
            return first_pointer;
        }
    }
   public boolean toCheck(Node first_pointer,Node first_pointer2){
    Node shift=first_pointer;
    Node shift2=first_pointer2;
    boolean ans=false;
    while(shift!=null && shift2!=null){
        if(shift.data!=shift2.data){
            return ans;
        }
        else{
            ans=true;
        }
        shift=shift.link;
        shift2=shift2.link;
    }
    return ans;
   }
}

