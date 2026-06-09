//group wise loop detection in linked list

/*
Loop ko remove karta hai
Loop todkar normal linked list bana deta hai
Pehle loop detect, phir break karte hain
Linked list modify ho jati hai */
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DetectLoopGroup {

    static Node reverseK(Node head, int k) {

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverseK(next, k);
        }

        return prev;
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

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            Node newNode = new Node(x);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter group size (k): ");
        int k = sc.nextInt();

        head = reverseK(head, k);

        System.out.println("Group Wise Reversed List:");
        display(head);

        sc.close();
    }
}