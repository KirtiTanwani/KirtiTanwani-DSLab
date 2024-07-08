import java.util.Scanner;

public class DSlab12q1 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in); 
        Node first_pointer=new Node();
       Node first_pointer2=new Node();
       first_pointer=null;
       first_pointer2=null;
        Linked_list l=new Linked_list();
        Linked_list l2=new Linked_list();
        int i=7;
        while(i!=-1){
            System.out.println("enter the number to insert in linkedlist:");
             i=sc.nextInt();
             if(i == -1) break;
                Node n1= new Node(i);
                first_pointer=l.toInssertInLinkedlist(n1, first_pointer);
                System.out.println("enter -1 to stop inserting");
        }
        Node shift2=first_pointer;
        while(shift2!=null){
            System.out.println(shift2.data+" , ");
            shift2=shift2.link;
        }
        System.out.println(10);
        first_pointer2=l2.toCopy(first_pointer, first_pointer2);
        Node shift=first_pointer2;
        while(shift!=null){
            System.out.println(shift.data+" , ");
            shift=shift.link;
        }
    }
}
class Node{
    int data;
    Node link;
    public Node(int data){
        this.data=data;
    }
    public Node(){
        
    }
}
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
    public Node toCopy(Node first_pointer,Node first_pointer2){
        if(first_pointer==null){
            System.out.println(" the linked list is empty.");
            return null;
        }
        else{
            Node shift =first_pointer;
            while(shift!=null){
                Node n=new Node(shift.data);
                first_pointer2=toInssertInLinkedlist(n, first_pointer2);
                shift=shift.link;
            }

            return first_pointer2;
        }
       
    }
}