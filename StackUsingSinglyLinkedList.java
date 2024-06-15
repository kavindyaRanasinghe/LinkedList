package LinkedList;

public class StackUsingSinglyLinkedList {
	class Node {
	    int data;
	    Node next;

	    
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	class Stack {
	    private Node top;

	    public Stack() {
	        this.top = null;
	    }

	   
	    public void push(int data) {
	        Node nNode = new Node(data);
	        nNode.next = top;
	        top = nNode;
	    }

	    
	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot pop.");
	        }
	        int data = top.data;
	        top = top.next;
	        return data;
	    }

	    
	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot peek.");
	        }
	        return top.data;
	    }

	  
	    public boolean isEmpty() {
	        return top == null;
	    }

	}
	    public static void main(String[] args) {
	       StackUsingSinglyLinkedList OC= new StackUsingSinglyLinkedList();
	        Stack stack =OC.new Stack();
	        

	        stack.push(70);
	        stack.push(80);
	        stack.push(24);

	        System.out.println("Top element is: " + stack.peek());
	        System.out.println("Popped element is: " + stack.pop());
	        System.out.println("Top element after pop is: " + stack.peek());

	        stack.push(40);
	        System.out.println("Top element after pushing 40 is: " + stack.peek());

	        while (!stack.isEmpty()) {
	            System.out.println("Popped element is: " + stack.pop());
	        }

	       
	    }
	
	}

	
	
	

