// Remove duplicate characters from a string

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            int flag = 0;

            // Check if character appeared before
            for (int j = 0; j < i; j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}