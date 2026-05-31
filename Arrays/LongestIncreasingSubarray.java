//longest increasing subarray
import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLen = 1;
        int currLen = 1;

        int currStart = 0;
        int maxStart = 0;

        for(int i = 1; i < n; i++) {

            if(arr[i] > arr[i - 1]) {
                currLen++;
               
            } else {
                currLen = 1;
                 currStart = i ;
            }

            if(currLen > maxLen) {
                maxLen = currLen;
                maxStart = currStart;
            }
        }

        System.out.println("Longest Increasing Subarray Length = " + maxLen);
         for(int i = maxStart; i < maxStart + maxLen; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}