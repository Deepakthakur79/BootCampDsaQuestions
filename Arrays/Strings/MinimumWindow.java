/*
Minimum Window Substring Kya Hota Hai?

👉 Ek badi string S aur ek target string T di hoti hai.

Hume S me sabse chhoti substring dhoondhni hoti hai jisme T ke saare characters maujood hon.

S = ADOBECODEBANC
T = ABC

Possible windows:

ADOBEC
CODEBA
BANC

Sabse chhoti valid window:

BANC

Output:

Minimum Window = BANC
 */
import java.util.Scanner;

public class MinimumWindow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        String answer = "";

        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i < s.length(); i++) {

            for(int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                boolean found = true;

                for(int k = 0; k < t.length(); k++) {

                    if(sub.indexOf(t.charAt(k)) == -1) {
                        found = false;
                        break;
                    }
                }

                if(found && sub.length() < minLen) {
                    minLen = sub.length();
                    answer = sub;
                }
            }
        }

        System.out.println("Minimum Window = " + answer);
    }
}