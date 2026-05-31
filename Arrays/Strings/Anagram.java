// Anagram Check
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int flag = 1;

        for (int i = 0; i < str1.length(); i++) {

            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < str1.length(); j++) {

                if (str1.charAt(i) == str1.charAt(j))
                    count1++;

                if (str1.charAt(i) == str2.charAt(j))
                    count2++;
            }

            if (count1 != count2) {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}