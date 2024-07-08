public class DSlab12q2 {
    public static void main(String[] args) {
        
    }
}
class Node{
    int data;
    Node link;
    public Node(int data){
        this.data=data;
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
    public Node toInsertInReverseLinkedList(Node first_pointer,Node n){
            Node pre=null; 
        if(first_pointer==null){
            pre=n;
            first_pointer=n;
            return first_pointer;
        }
        else{
            Node shift=first_pointer;
            while(shift!=null){
                
            }
            pre=n;
            first_pointer.link=pre;
            return first_pointer;
        }
        
    }
    public Node toReverseLinkedList(Node first_pointer, Node first_pointer2){


        return first_pointer;
    }
}