// implementation of stack using queue
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void push(int x) {

        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    static int pop() {

        if (q1.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }

        return q1.remove();
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }
}