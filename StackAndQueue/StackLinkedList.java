// stack implementation using linked list

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {

    static Node top = null;

    static void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped Element: " + top.data);
        top = top.next;
    }

    static void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack Elements: ");

        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            push(sc.nextInt());
        }

        display();

        pop();

        display();

        sc.close();
    }
}