// stack implementation using array

import java.util.Scanner;

public class StackArray {
    static int[] stack;
    static int top = -1;
    static int size;

    static void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped Element: " + stack[top--]);
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack Elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        size = sc.nextInt();

        stack = new int[size];

        System.out.println("Enter stack elements:");

        for (int i = 0; i < size; i++) {
            push(sc.nextInt());
        }

        display();

        pop();

        display();

        sc.close();
    }
}