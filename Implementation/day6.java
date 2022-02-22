// Circular linked list (creation + traverse)

import java.util.Scanner;

public class day6 {

    // displaying how to create structure of Node , we make a class for Node

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // 'tail' defines the last address of the node which connects to the starting head node
    Node tail = null;
    Node head= null;    

    // now we make how to create a node
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;      
                tail = new_node;
                new_node.next = head;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
            }
            System.out.print("Do u want to add more data, then press :1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.print("Linked list does not exist");
        } else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    public static void main(String args[]) {

        day6 ll = new day6();
        ll.creation();
        ll.traverse();

    }
}
