import java.util.Scanner;

public class DSlab10q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
       Node first_pointer=new Node(0);
        Linked_list l=new Linked_list();
        
        int i=0,j=0;
        first_pointer=null;
        while(i!=-1){
            System.out.println("enter the number to insert in linkedlist:");
             i=sc.nextInt();
                Node n1= new Node(i);
                first_pointer=l.toInssertInLinkedlist(n1, first_pointer);
                System.out.println("enter -1 to stop inserting");
        }
       System.out.println("the no of nodes are: "+l.toCount(first_pointer));
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
   public int toCount(Node first_pointer){
    int count=0;
    Node shift=first_pointer;
    while(shift.link!=null){
        count++;
        shift=shift.link;
    }
    return count;
   }
}

