//difference first and last element of array
import java.util.Scanner;
public class Difference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int difference = arr[0] - arr[n-1];
        System.out.println("Difference between first and last element is: " + difference);
        sc.close();
    }
}