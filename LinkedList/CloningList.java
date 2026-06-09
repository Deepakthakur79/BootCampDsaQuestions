//cloning a linked list
//Cloning ka matlab hai original linked list ki exact copy banana.

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CloningList {

    static Node cloneList(Node head) {

        if (head == null)
            return null;

        Node newHead = new Node(head.data);
        Node temp1 = head.next;
        Node temp2 = newHead;

        while (temp1 != null) {
            temp2.next = new Node(temp1.data);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return newHead;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, tail = null;

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node clone = cloneList(head);

        System.out.print("Original List: ");
        display(head);

        System.out.print("\nCloned List: ");
        display(clone);

        sc.close();
    }
}