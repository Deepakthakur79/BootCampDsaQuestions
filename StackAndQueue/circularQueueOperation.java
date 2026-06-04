import java.util.Scanner;

public class circularQueueOperation {

    static int size = 5;
    static int[] queue = new int[size];
    static int front = -1, rear = -1;

    static void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = data;
    }

    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted Element: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    static void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");

        int i = front;

        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }

        System.out.println(queue[rear]);
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        display();

        dequeue();

        display();

        enqueue(60);

        display();
    }
}