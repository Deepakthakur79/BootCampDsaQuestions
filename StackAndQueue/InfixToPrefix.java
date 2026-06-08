// infix to prefix conversion
import java.util.Stack;

public class InfixToPrefix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        return 0;
    }

    public static String infixToPrefix(String exp) {

        StringBuilder input = new StringBuilder(exp);
        input.reverse();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                input.setCharAt(i, ')');
            else if (input.charAt(i) == ')')
                input.setCharAt(i, '(');
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toString().toCharArray()) {

            if (Character.isLetterOrDigit(ch))
                result.append(ch);

            else if (ch == '(')
                stack.push(ch);

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                stack.pop();
            }

            else {
                while (!stack.isEmpty() &&
                       precedence(stack.peek()) > precedence(ch))
                    result.append(stack.pop());

                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            result.append(stack.pop());

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String exp = "(A+B)*C";
        System.out.println("Prefix: " + infixToPrefix(exp));
    }
}