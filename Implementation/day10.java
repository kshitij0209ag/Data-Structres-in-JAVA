// Doubly Linked list insertion(begining, end, specific location)

import java.util.Scanner;

public class day10 {

    // displaying how to create structure of Node , we make a class for Node

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    // now we make how to create a node
    public void creation() {
        int data, n, m;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node; // 30 20 10
                tail = new_node;
            } else {
                
                System.out.print("Enter 1 to insert at begining, 2 for insertng at end, 3 for insert at specific location");
                m = sc.nextInt();
                switch (m) {
                    case 1: // inserting at begining
                    new_node.next = head;
                    head.prev = new_node;
                    head = new_node;
                    break;

                    case 2: /// inserting at end
                    tail.next = new_node;
                    new_node.prev = tail;
                    tail = new_node;
                    break;

                    case 3: // inserting at specified location
                    int p;
                    System.out.print("Enter the position to inserted: ");
                    p = sc.nextInt();
                    Node temp1 = head;
                    Node ptr = temp1.next;
                    for (int i = 1; i < (p - 1); i++) {
                        temp1 = ptr;
                        ptr = ptr.next;
                    }
                    new_node.prev = temp1;
                    new_node.next = ptr;
                    temp1.next = new_node;
                    ptr.prev = new_node;
                    break;
                }
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
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {

        day10 ll = new day10();
        ll.creation();
        ll.traverse();

    }
}
