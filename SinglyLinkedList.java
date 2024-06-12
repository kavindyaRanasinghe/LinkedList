package LinkedList;

public class SinglyLinkedList {
	
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    
    public SinglyLinkedList() {
        this.head = null;
    }

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        
        list.insert(10);
        list.insert(42);
        list.insert(56);
        list.insert(40);
        
       
        System.out.print("Linked List: ");
        list.printList();
        
       
        list.delete(56);
        
        
        System.out.print("Linked List after deletion: ");
        list.printList();
    }

}
