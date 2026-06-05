// stock span problem Har din ke stock price ke liye span find karna hai.

//Span = Current day se pichle consecutive days tak kitne days ke prices current price se chhote ya equal hain.
/*
Example

Input:

100 80 60 70 60 75 85

Output:

1 1 1 2 1 4 6 */

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    static Stack<int[]> stack = new Stack<>();

    static int next(int price) {
        int res = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            res += stack.pop()[1];
        }

        stack.push(new int[]{price, res});

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();

            int span = next(price);

            System.out.println("Price = " + price +
                               "  Span = " + span);
        }

        sc.close();
    }
}