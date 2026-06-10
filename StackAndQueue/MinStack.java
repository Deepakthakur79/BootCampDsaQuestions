//Implementation of min stack 
import java.util.Stack;

public class Main {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    static void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    static void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        int x = stack.pop();

        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    static int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        push(10);
        push(5);
        push(20);
        push(2);

        System.out.println("Minimum = " + getMin());

        pop();

        System.out.println("Minimum = " + getMin());
    }
}