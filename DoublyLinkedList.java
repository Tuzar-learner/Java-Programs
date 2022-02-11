package Program;

import java.util.Scanner;

public class DoublyLinkedList {  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    Node head, tail = null;  
    public void add(int data) { 
        Node newNode = new Node(data);
        if(head == null) {   
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else { 
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println(" List is empty");  
            return;  
        }  
        System.out.println(" Nodes of doubly linked list: ");  
        while(current != null) {   
            System.out.print(" "+current.data );  
            current = current.next;  
        }  
    }  
    void delete(Node del)
    {
        if (head == null || del == null) 
            return;
        if (head == del) 
            head = del.next;
        if (del.next != null) 
            del.next.previous = del.previous;
        if (del.previous != null)
            del.previous.next = del.next;
        return;
    }
    public static void main(String[] args) {  
    	Scanner sc=new Scanner(System.in);
    	int n;
        DoublyLinkedList dList = new DoublyLinkedList();
        System.out.print("\nEnter the number of elements to be inserted into the DLList:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	System.out.print("Enter the element "+i+": ");
        	dList.add(sc.nextInt());
        }
        System.out.print("\n");
        dList.display();
        System.out.println("\n \nDoubly Linked list after deleteion of first element");
        dList.delete(dList.head);
        dList.display();  
    }  
}  