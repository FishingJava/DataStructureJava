package com.hackerRank;

public class RemoveDupFromSinglyLinkedList {
	public static void main(String[] args) {  
		  
		RemoveDupFromSinglyLinkedList sList = new RemoveDupFromSinglyLinkedList();  
  
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(2);  
        sList.addNode(2);  
        sList.addNode(4);  
        sList.addNode(1);  
  
        System.out.println("Originals list: ");  
        sList.display();  
  
        //Removes duplicate nodes  
        sList.removeDuplicate();  
  
        System.out.println("List after removing duplicates: ");  
        sList.display();  
    }  
	//node of the singly linked list 
	 class Node {
	   int data;
	   Node next;
	   public Node(int data) {
	    	 this.data = data;
	    	 this.next=null;
	    	 
	     }
	 }
    //Represent the head and tail of the singly linked list  
	 public Node head = null;
	 public Node tail = null;
	 
	 public void addNode(int data) {
		 Node newNode = new  Node(data);
		//Checks if the list is empty
		 if(head == null) {
			//If list is empty, both head and tail will point to new node  
			 head = newNode;
			 tail = newNode;
			 
			 
		 } else 
		 {
		//newNode will be added after tail such that tail's next will point to newNode  
			tail.next = newNode;
			//newNode will become new tail of the list 
			tail = newNode;
			
		 }
	 }
		//removeDuplicate() will remove duplicate nodes from the list  
	public void removeDuplicate() {  
		//nodes to operate removing 
	    	Node current = head;
	    	Node temp = null;
	        Node index = null;
	   if(head == null) {
		   return;
	   
		}
	   else {
		   if(current != null) {
			   
			   temp = current;
			   index = current.next;
			   if(current.data == index.data) {
					   
			   temp.next = index.next;
		   }
			   else {
				   temp = index;
			   }
			   index = index.next;
	   }
		   current = current.next; 
    }
  }
	//display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
}
