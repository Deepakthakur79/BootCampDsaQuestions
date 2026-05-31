// String Compression
/*
String Compression Kya Hota Hai?

String me consecutive repeated characters ko count ke saath represent karna.

Example 1

Input:

aaabbccccd

Output:

a3b2c4d1 */

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int count = 1;

        for(int i = 0; i < str.length(); i++) {

            count = 1;

            while(i < str.length() - 1 &&
                  str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }

            System.out.print(str.charAt(i) + "" + count);
        }
    }
}