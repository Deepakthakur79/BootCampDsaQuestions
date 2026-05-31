// frequency count of elements in an array
import java.util.Scanner;

public class FrequencyCount{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
    
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            int flag = 0;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    flag = 1;
                }
            }

            if (flag == 0) {
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}