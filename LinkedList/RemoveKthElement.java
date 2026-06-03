import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class RemoveKthElement {
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

    static void removeKthElement(int k) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (k <= 0) {
            System.out.println("Invalid position");
            return;
        }

        // remove head
        if (k == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    static void display() {
        Node temp = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int value = sc.nextInt();

            if (value == -1) {
                break; //
            }

            insert(value);
        }

        System.out.print("Enter position to remove: ");
        int k = sc.nextInt();

        removeKthElement(k);

        System.out.println("Updated list:");
        display();
    }
}