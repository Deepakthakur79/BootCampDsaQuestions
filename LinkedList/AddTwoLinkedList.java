// Add two numbers represented by linked lists
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

public class AddTwoLinkedList {
    static Node head1 = null;
    static Node head2 = null;

    // insert
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // simple addition
    static Node add(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
        }

        if (carry > 0) {
            temp.next = new Node(carry);
        }

        return dummy.next;
    }

    // display
    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first list size:");
        int n1 = sc.nextInt();
        System.out.println("Enter first list elements:");
        for (int i = 0; i < n1; i++) {
            head1 = insert(head1, sc.nextInt());
        }

        System.out.println("Enter second list size:");
        int n2 = sc.nextInt();
        System.out.println("Enter second list elements:");
        for (int i = 0; i < n2; i++) {
            head2 = insert(head2, sc.nextInt());
        }

        System.out.println("Result:");
        display(add(head1, head2));
    }
}