// Doubly linked list (creation + traverse)

import java.util.Scanner;

public class day9 {

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
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node; // 30 20 10
                tail = new_node;
            } else {
                head.prev = new_node;
                new_node.next = head;
                head = new_node;
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

        day9 ll = new day9();
        ll.creation();
        ll.traverse();

    }
}
