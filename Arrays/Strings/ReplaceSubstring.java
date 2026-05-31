//Replace Substring

import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter substring to find and replace: ");
        String find = sc.nextLine();
        System.out.print("Enter replace Symbol: ");
        String replace = sc.nextLine();

        System.out.println(str.replace(find, replace));
    }
}