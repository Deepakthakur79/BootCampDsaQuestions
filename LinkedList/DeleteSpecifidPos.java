import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteSpecifidPos {

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    static void deleteAtPosition(int pos) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (pos == 1) {

            if (head.next == head) {
                head = null;
                return;
            }

            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        if (temp.next == head) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    static void display() {

        if (head == null) {
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt(); // number of nodes
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insert(data);
        }
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt(); // position to delete

        deleteAtPosition(pos);

        display();

        sc.close();
    }
}