class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete at position (0-based)
    public void delete(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;

        temp.next = temp.next.next;
    }

    // Get element at index
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

    // Print list
    public void traverse() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
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
    }
}

