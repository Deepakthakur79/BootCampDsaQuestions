// Longest Common Prefix
/*Kai strings ke starting me jo same characters lagatar aate hain, unhe common prefix kehte hain.

Example 1
flower
flow
flight

Start me sab me:

fl */

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];

        System.out.println("Enter strings:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String prefix = arr[0];

        for(int i = 1; i < n; i++) {

            while(arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println("Longest Common Prefix = " + prefix);
    }
}