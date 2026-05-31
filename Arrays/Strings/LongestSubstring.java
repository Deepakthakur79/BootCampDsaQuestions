// Longest Substring Without Repeating Characters
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int maxLen = 0;
        String longest = "";

        for(int i = 0; i < str.length(); i++) {

            String temp = "";

            for(int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if(temp.indexOf(ch) != -1) {
                    break;
                }

                temp += ch;

                if(temp.length() > maxLen) {
                    maxLen = temp.length();
                    longest = temp;
                }
            }
        }

        System.out.println("Longest Substring = " + longest);
        System.out.println("Length = " + maxLen);
    }
}