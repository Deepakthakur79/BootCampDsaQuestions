// Group Anagrams
import java.util.Scanner;

public class GroupAnagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String arr[] = new String[n];

        System.out.println("Enter strings:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int visited[] = new int[n];

        for(int i = 0; i < n; i++) {

            if(visited[i] == 1)
                continue;

            System.out.print("(" + arr[i] + " ");

            visited[i] = 1;

            for(int j = i + 1; j < n; j++) {

                if(arr[i].length() != arr[j].length())
                    continue;

                int flag = 1;

                for(int k = 0; k < arr[i].length(); k++) {

                    int count1 = 0;
                    int count2 = 0;

                    for(int l = 0; l < arr[i].length(); l++) {

                        if(arr[i].charAt(k) == arr[i].charAt(l))
                            count1++;

                        if(arr[i].charAt(k) == arr[j].charAt(l))
                            count2++;
                    }

                    if(count1 != count2) {
                        flag = 0;
                        break;
                    }
                }

                if(flag == 1) {
                    System.out.print(arr[j] + " ");
                    visited[j] = 1;
                }
            }

            System.out.println(")");
        }
    }
}