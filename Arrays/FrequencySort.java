import java.util.Scanner;

public class FrequencySort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = new int[n];

        // Count frequency
        for(int i = 0; i < n; i++) {
            freq[i] = 1;

            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    freq[i]++;
                }
            }
        }

        // Sort according to frequency (descending)
        for(int i = 0; i < n - 1; i++) {

            for(int j = i + 1; j < n; j++) {

                if(freq[i] < freq[j]) {

                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Frequency Sorted Array:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}