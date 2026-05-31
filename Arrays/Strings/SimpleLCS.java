// longest common subsequence
/*
Do strings me jo characters same order me milte hain, lekin continuous hona zaroori nahi hai, unhe common subsequence kehte hain.

Example 1

String 1:

ABCDGH

String 2:

AEDFHR

Common characters same order me:
ADH
Longest Common Subsequence = ADH
Length = 3

ADH */

import java.util.Scanner;

public class SimpleLCS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Build DP table
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Find LCS string
        int i = m;
        int j = n;

        String lcs = "";

        while (i > 0 && j > 0) {

            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                lcs = s1.charAt(i - 1) + lcs;

                i--;
                j--;

            } else if (dp[i - 1][j] > dp[i][j - 1]) {

                i--;

            } else {

                j--;
            }
        }

        System.out.println("Longest Common Subsequence: " + lcs);
        System.out.println("Length: " + lcs.length());
    }
}