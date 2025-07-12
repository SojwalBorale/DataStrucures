class Node{
    int data;
    Node next;

     Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    static Node head;
    public void insert(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
     public void delete(int value){
      if(head== null){
          return;
      }
      if (head.data == value){
          head = head.next;
          return;
      }
      Node prev;
      Node ptr;
      prev = head;
      ptr = head.next;
      while( ptr.data != value && ptr.next!=null){
          prev =  ptr;
          ptr = ptr.next;
      }
       if(ptr.data != value){
         //  prev.next=null;
           return;
       }
         if(ptr!= null){
             prev.next = ptr.next;
         }
     }
    public void traverse(){
        Node temp = head;
        System.out.print("Linked List:");
        while
        (temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
      list.insert(5);
      list.insert(6);
      list.insert(7);
      list.insert(8);
      list.traverse();
      list.delete(21);
      list.traverse();
    }
}

