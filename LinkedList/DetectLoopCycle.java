// Detect Loop or cycle in a Linked List
// used Floyd’s Cycle Detection Algorithm .
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoopCycle {
    static Node head = null;

    static void insert(int data){
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

    static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; 
            }
        }

        return false; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
       }
        temp.next = head.next;
        
        if(detectLoop(head)){
            System.out.println("Loop detected.");
        } else {
            System.out.println("No loop detected.");
        }
    }
}