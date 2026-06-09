// Queue using stack
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int x) {
        s1.push(x);
    }

    static int dequeue() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            enqueue(x);
        }

        System.out.println("Queue Elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(dequeue() + " ");
        }

        sc.close();
    }
}