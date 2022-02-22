// Circular linked list - deletion(begining, end, specific loation)

import java.util.Scanner;

public class day8 {

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
                head = new_node;
                tail = new_node;
                new_node.next = head;
            } else {
                System.out.print(
                        "Enter 1 to insert at begining, 2 for insertng at end, 3 for insert at specific location");
                m = sc.nextInt();
                switch (m) {

                    case 1: // inserting at begining
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;

                    case 2: /// inserting at end
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                        break;

                    case 3: // inserting at specified location
                        int p;
                        System.out.print("Enter the position to inserted: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.print("Do u want to add more data, then press :1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void delete() {
        int n, m, p, data;
        Scanner sc1 = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.print("Linked List is Empty");

            } else {
                System.out.print("Enter 1 to delete at begining, 2 at end , 3 at specific location");
                m = sc1.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        tail.next = head;
                        break;

                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != head) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = head;
                        tail = temp1;

                        break;

                    case 3:
                        System.out.print("Enter position of node:");
                        p = sc1.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 1; i < (p - 1); i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.print("Do u want to add more data, then press :1");
            n = sc1.nextInt();
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
        day5 ll = new day5();
        ll.creation();
        ll.delete();
        ll.traverse();
        

    }
}
