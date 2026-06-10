// sliding window maximum using queue
// compare with according k element and find maximum element in that window and print it
import java.util.Scanner;

public class SlidingWindowMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        for(int i = 0; i <= n - k; i++) {

            int max = arr[i];

            for(int j = i; j < i + k; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }

        sc.close();
    }
}