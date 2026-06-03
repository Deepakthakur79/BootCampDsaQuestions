// Count occurrences of a specific element in a linked list .
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountOccurance {
    static Node head = null;

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

    static int countOccurrence(int key) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }

        return count;
    }

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

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }

        System.out.print("Enter key to count occurrence: ");
        int key = sc.nextInt();

        System.out.println("Linked List:");
        display();

        int result = countOccurrence(key);

        System.out.println("Occurrence of " + key + " = " + result);
    }
}