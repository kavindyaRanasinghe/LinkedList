package LinkedList;

public class FIFOQueueUsingLinkedList {
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Queue {
	    private Node front, rear;

	    public Queue() {
	        this.front = this.rear = null;
	    }

	    public void enqueue(int data) {
	        Node newNode = new Node(data);

	        if (this.rear == null) {
	            this.front = this.rear = newNode;
	            return;
	        } 
	        this.rear.next = newNode;
	        this.rear = newNode;
	    }

	    public int dequeue() {
	        if (this.front == null) {
	            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
	        }

	        int data = this.front.data;
	        this.front = this.front.next;

	        if (this.front == null) {
	            this.rear = null;
	        }

	        return data;
	    }

	    public int peek() {
	        if (this.front == null) {
	            throw new IllegalStateException("Queue is empty. Cannot peek.");
	        }

	        return this.front.data;
	    }

	    public boolean isEmpty() {
	        return this.front == null;
	    }
	}
	    public static void main(String[]args) {
	    	FIFOQueueUsingLinkedList OF = new FIFOQueueUsingLinkedList();
	        Queue queue = OF.new Queue(); 

	        queue.enqueue(64);
	        queue.enqueue(35);
	        queue.enqueue(82);

	        System.out.println("Front element is: " + queue.peek());
	        System.out.println("Dequeued element is: " + queue.dequeue());
	        System.out.println("Front element after dequeue is: " + queue.peek());

	        queue.enqueue(40);
	        System.out.println("Front element after enqueue 40 is: " + queue.peek());

	        while (!queue.isEmpty()) {
	            System.out.println("Dequeued element is: " + queue.dequeue());
	        }

	    }

		private static FIFOQueueUsingLinkedList FIFOQueueUsingLinkedList() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	

