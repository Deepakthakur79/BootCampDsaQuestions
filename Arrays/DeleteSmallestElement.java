//delete the smallest element from an array
import java.util.Scanner;
public class DeleteSmallestElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int smallest = arr[0];
        int pos = 0;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
                pos = i;
            }
        }

       // ------both are correct logic--------

        // for(int i=pos;i<n-1;i++)
        //     arr[i] = arr[i+1];
        // n--;
        // for(int i=0;i<n;i++)
        //     System.out.print(arr[i] + " ");

        for(int i=0;i<n;i++){
            if(i==pos){
                continue;
            }
                System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}