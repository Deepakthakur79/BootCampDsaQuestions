// merge two linked list
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeList {

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First List
        System.out.print("Enter size in List 1: ");
        int n1 = sc.nextInt();

        Node head1 = null, tail1 = null;

        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) {
            Node newNode = new Node(sc.nextInt());

            if (head1 == null) {
                head1 = tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // Second List
        System.out.print("Enter size in List 2: ");
        int n2 = sc.nextInt();

        Node head2 = null, tail2 = null;

        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++) {
            Node newNode = new Node(sc.nextInt());

            if (head2 == null) {
                head2 = tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        // Merge
        tail1.next = head2;

        System.out.println("Merged List:");
        display(head1);

        sc.close();
    }
}