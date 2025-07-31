package com.DSAtopics;

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
    public int get(int index) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (i == index) return temp.data;
            temp = temp.next;
            i++;
        }
        throw new IndexOutOfBoundsException("Index " + index + " out of range");
    }

    // Set value at index
    public void set(int index, int value) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (i == index) {
                temp.data = value;
                return;
            }
            temp = temp.next;
            i++;
        }
        throw new IndexOutOfBoundsException("Index " + index + " out of range");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.traverse();

        list.set(1, 25);  // change 20 to 25
        list.traverse();

        System.out.println("Element at index 2: " + list.get(2));

        list.delete(1);   // delete 25
        list.traverse();
        list.delete(21);
        list.traverse();
    }
}

