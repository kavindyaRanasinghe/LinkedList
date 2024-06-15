package LinkedList;

public class DoublyLinkedList { //insert add the beginning
	 class Node{    
	        String data;    
	        Node prev;    
	        Node next;    
	  
	        public Node(String data) {    
	            this.data = data;    
	        }    
	    }    
	  
	       
	    Node head = null;  
	    Node tail = null;    
	      
	    public void addNewNodeInBegin(String data) {    
	              
	            Node newNode = new Node(data);    
	                
	                
	            if(head == null)   
	            {    
	                  
	                head = newNode;  
	                tail = newNode;  
	                    
	                head.prev = null;    
	                    
	                tail.next = null;    
	            }    
	            
	            else {    
	                  
	                head.prev = newNode;    
	                   
	                newNode.next = head;    
	                  
	                newNode.prev = null;    
	               
	                head = newNode;    
	            }    
	    }  
	      
	     
	    public void DisplayData() {  
	       
	        Node current = head;    
	        
	        if(head == null) {  
	              
	            System.out.println("List is empty");    
	            return;    
	        }  
	        
	        System.out.println("Nodes of doubly linked list: ");    
	          
	        while(current != null) {    
	                 
	            System.out.print(current.data + "\n");    
	            current = current.next;    
	        }    
	    }    
	  
	    public static void main(String[] args) {    
	  
	    	DoublyLinkedList obj = new DoublyLinkedList();    
	  
	        //Adding nodes into the doubly linked list   
	        obj.addNewNodeInBegin("chanuki");    
	        obj.addNewNodeInBegin("kaveesha");    
	        obj.addNewNodeInBegin("Amali");    
	        obj.addNewNodeInBegin("Chamodi");    
	        obj.addNewNodeInBegin("Nimali");    
	          
	          
	          
	        obj.DisplayData();    
	    }    

}
