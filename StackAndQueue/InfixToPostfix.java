// infix to postfix conversion
import java.util.Stack;

public class InfixToPostfix {

    static int priority(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        return 0;
    }

    public static void main(String[] args) {

        String infix = "(A+B)*C";
        String postfix = "";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }

            // Left Parenthesis
            else if (ch == '(') {
                stack.push(ch);
            }

            // Right Parenthesis
            else if (ch == ')') {
                while (stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            }

            // Operator
            else {
                while (!stack.isEmpty()
                        && priority(stack.peek()) >= priority(ch)) {
                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        System.out.println("Postfix = " + postfix);
    }
}