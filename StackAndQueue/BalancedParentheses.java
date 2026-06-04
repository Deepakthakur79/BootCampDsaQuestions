// balance parentheses using stack
/*
FOR each character

    IF opening bracket
        PUSH

    ELSE IF closing bracket

        IF stack empty
            Not Balanced

        POP top

        IF pair not matching
            Not Balanced

END FOR

IF stack empty
    Balanced
ELSE
    Not Balanced */


import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String str = sc.nextLine();

        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}