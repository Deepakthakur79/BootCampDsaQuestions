// Remove duplicates from a sorted linked list
import java.util.Scanner;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesSorted {
    static Node head = null;

    // Insert at end
    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Remove duplicates
    static void removeDuplicates() {
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next; // skip duplicate
            } else {
                temp = temp.next;
            }
        }
    }

    // Display list
    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter sorted elements:");

        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }

        System.out.println("Original List:");
        display();

        removeDuplicates();

        System.out.println("After removing duplicates:");
        display();
    }
}