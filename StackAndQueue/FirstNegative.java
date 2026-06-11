// find the first negative number in every window of size k
//k = window ka size (ek baar me kitne elements consider karne hain).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;

        for (int i = 0; i <= arr.length - k; i++) {

            boolean found = false;

            for (int j = i; j < i + k; j++) {

                if (arr[j] < 0) {
                    System.out.print(arr[j] + " ");
                    found = true;
                    break;
                }
            }

            if (!found)
                System.out.print("0 ");
        }
    }
}