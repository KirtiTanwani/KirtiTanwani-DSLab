import java.util.Scanner;

public class DSlab10q2 {
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
        
        System.out.println("Enter number 1 to insert at first position,2 to insert at last position,3 to insert in an ordereed list,4 to delete from 1st position,5 to delete from last position,6 to delete in ordered list,7 to display the list ");
        j=sc.nextInt();
        while(j!=-1){

            switch (j) {
                
                case 1:
                    // Linked_list l3=new Linked_list();
                    System.out.println("eneter the value in add to be inserted");
                    Node n=new Node(sc.nextInt());first_pointer=l.toInssertAtFirstPositionInLinkedlist(n, first_pointer);
                    // l3.toInssertAtFirstPositionInLinkedlist(n,first_pointer);
                        break;
                case 2:
                    // Linked_list l4=new Linked_list();
                    System.out.println("eneter the node to be inserted at last");
                    Node n1=new Node(sc.nextInt());
                    first_pointer=l.toInssertAtLastPositionInLinkedlist(n1, first_pointer);
                    // l4.toInssertAtLastPositionInLinkedlist(n1,first_pointer);
                    break;
                case 3:
                    System.out.println("eneter the node to be inserted in ordered linked list:");
                    Node n2=new Node(sc.nextInt());
                    first_pointer=l.toInssertInOreredInLinkedlist(n2, first_pointer);
                    break;
                    case 4:
                    first_pointer=l.toDeleteNodeAtFirstPoistionInSinglyLinkedlist(first_pointer);
                        // Linked_list l2=new Linked_list();
                        // l2.toDeleteNodeAtFirstPoistionInSinglyLinkedlist(first_pointer);
                        break;
                case 5:
                    first_pointer=l.toDeleteNodeAtLastPoistionInSinglyLinkedlist(first_pointer);
                    break;
                case 6:
                    System.out.println("enetr a number to be deleed from ordered linked list");
                    Node n4=new Node(sc.nextInt());
                    first_pointer=l.toDeleteNodeInOrderedSinglyLinkedlist(n4, first_pointer);
                    break;
                case 7:
                    l.toDisplayAllNodes(first_pointer);
                    break;
                default: j=sc.nextInt();
                    break;
            }
            System.out.println("Enter number 1 to insert at first position,2 to insert at last position,3 to insert in an ordereed list,4 to delete from 1st position,5 to delete from last position,6 to delete in ordered list,7 to display the list ");
            j=sc.nextInt();
        }
        l.toDisplayAllNodes(first_pointer);
        
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
    public Node toInssertAtLastPositionInLinkedlist(Node n, Node first_pointer){
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
    public Node toInssertAtFirstPositionInLinkedlist(Node n, Node first_pointer){
        if(first_pointer==null){
            first_pointer=n;
            return first_pointer;
        }
        else{
           n.link=first_pointer;
           first_pointer=n;
            return first_pointer;
        }
    }
    public Node toInssertInOreredInLinkedlist(Node n, Node first_pointer){
        if(first_pointer==null){
            first_pointer=n;
            return first_pointer;
        }
        else{
           Node shift=first_pointer;
           while(shift!=null){
            if((shift.link).data>n.data){
                Node temp=shift;
                shift.link=n;
                n.link=temp;
            }
           }
            return first_pointer;
        }
    }
    public Node toDeleteNodeAtFirstPoistionInSinglyLinkedlist( Node first_pointer){
        if(first_pointer==null){
            System.out.println("the linked list is empty");
            Node n=null;
            return n;
        }
        else{
         
            first_pointer=first_pointer.link;

            return first_pointer;
        }
        
    }
    public Node toDeleteNodeAtLastPoistionInSinglyLinkedlist( Node first_pointer){
        if(first_pointer==null){
            System.out.println("the linked list is empty");
            Node n=null;
            return n;
        }
        else{
            Node shift=first_pointer;
            while (shift.link!=null){
                shift=shift.link;
            }
            shift=null;
            return first_pointer;
        }
        
    }
    public Node toDeleteNodeInOrderedSinglyLinkedlist( Node n9,Node first_pointer){
        if(first_pointer==null){
            System.out.println("the linked list is empty");
            Node n=null;
            return n;
        }
        else{
            Node shift=first_pointer;
            Node pre=shift;
            if(shift.link==null){
                System.out.println("the entered number is not in linked list");
                Node n=null;
                return n;
            }
            while (shift.link.data!=n9.data){
                pre=shift;
                shift=shift.link;
            }
          pre=shift.link;

            return first_pointer;
        }
        
    }
    public void toDisplayAllNodes(Node first_pointer){
        Node shift=first_pointer;
        while (shift!=null) {
            System.out.println(shift.data+",");
            shift=shift.link;
        }
    }
}

