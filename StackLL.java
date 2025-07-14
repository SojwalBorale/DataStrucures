class Nodee{
    int data;
    Nodee next;
    Nodee(int data){
        this.data = data;
    }
}
public class StackLL {

     static Nodee head;
     public void push(int data){
         Nodee node = new Nodee(data);
         if (head==null){
             head =node;
             return;
         }
         node.next = head;
         head = node;
     }
     public void pop(){
         if(head == null){
             System.out.println("stack is empty");
             return;
         }
         head=head.next;
     }
    public void traverse(){
         Nodee temp = head;
        System.out.print("Linked List:");
         while (temp!=null){
             System.out.print(temp.data+"->");
             temp = temp.next;
         }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
         StackLL sc = new StackLL();
         sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
         sc.traverse();
         sc.pop();
         sc.traverse();
    }
}
