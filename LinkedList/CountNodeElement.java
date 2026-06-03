// Count the number of nodes in the linked list and terminateit when -1 is found while traversing.

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountNodeElement {

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

    static int countElements() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == -1) {
                break; // Stop counting when -1 is found
            }

            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int value = sc.nextInt();
            insert(value);

            if (value == -1) {
                break;
            }
        }

        System.out.println(countElements());

        sc.close();
    }
}