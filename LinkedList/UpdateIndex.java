// Update the index of a node in the linked list

import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class UpdateIndex {
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
        newNode.prev = temp;
    }

    static void updateAtIndex(int index, int newValue) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (i == index) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
            i++;
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter node values: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            insert(value);
        }
        System.out.print("Enter index to update and new value: ");
        int index = sc.nextInt();
        int newValue = sc.nextInt();

        updateAtIndex(index, newValue);

        display();

        sc.close();
    }
}