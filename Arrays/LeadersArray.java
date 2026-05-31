// Leaders in an Array
import java.util.Scanner;

public class LeadersArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders are:");

        for (int i = 0; i < n; i++) {

            int j;

            for (j = i + 1; j < n; j++) {

                // If right element is greater
                if (arr[j] > arr[i]) {
                    break;
                }
            }
            if (j == n) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}