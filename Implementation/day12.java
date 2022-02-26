//  Linked List Practice Question

//  1. Count No. oof Nodes in a Linked List

import java.util.Scanner;

public class day12 {

    // displaying how to create structure of Node , we make a class for Node

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

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
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.print("Do u want to add more data, then press :1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void count() {
        int c = 0;
        Node temp = head;
        while(temp != null) {
            c++;
            temp = temp.next;
        }
        System.out.println("The no. of nodes are:- " + c);
        
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.print("Linked list does not exist");
        } else {
            while (temp != null) {
                
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {

        day12 ll = new day12();
        ll.creation();
        ll.traverse();
        ll.count();

    }
}
