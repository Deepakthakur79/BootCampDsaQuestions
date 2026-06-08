//Bubble sorting
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Simple Bubble Sort
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}