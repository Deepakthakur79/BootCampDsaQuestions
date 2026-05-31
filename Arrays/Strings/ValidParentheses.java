// Valid Parentheses in a string

import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String str = sc.nextLine();

        while (str.contains("()") ||
               str.contains("{}") ||
               str.contains("[]")) {

            str = str.replace("()", "");
            str = str.replace("{}", "");
            str = str.replace("[]", "");
        }

        if (str.length() == 0)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}