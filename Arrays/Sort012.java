import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (0,1,2):");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int zero = 0, one = 0, two = 0;

        // Count 0s, 1s and 2s
        for(int i = 0; i < n; i++) {

            if(arr[i] == 0)
                zero++;
            else if(arr[i] == 1)
                one++;
            else
                two++;
        }

        int index = 0;

        // Fill 0s
        while(zero > 0) {
            arr[index++] = 0;
            zero--;
        }

        // Fill 1s
        while(one > 0) {
            arr[index++] = 1;
            one--;
        }

        // Fill 2s
        while(two > 0) {
            arr[index++] = 2;
            two--;
        }

        System.out.println("Sorted Array:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}