import java.util.*;

class LinkedList {  
    static Node head; 
  
    static class Node { 
    
        int data; 
        Node next; 
    
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
    
    /* Function to reverse the linked list */
    Node reverse(Node node) { 
        Node temp = null;
        Node current = node;
        Node next = null;
        while(current != null) { 
            next = current.next;
            current.next = temp;
            temp = current;
            current = next;
        }
        head = temp;
        return head;
    } 
    
    // prints content of double linked list 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
    
    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
        
        // 85 -> 15 -> 4 -> 20

        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
}

//Space Complexity : O(1)
//Time Complexity: O(n)