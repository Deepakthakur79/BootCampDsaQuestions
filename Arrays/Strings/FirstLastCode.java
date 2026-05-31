// First name and Last name and code print of a String
import java.util.Scanner;

public class FirstLastCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name and code: ");
        
        String name = sc.nextLine();
        String code = sc.nextLine();

        String arr[] = name.split(" ");

        String first = arr[0];
        String last = arr[arr.length - 1];

        System.out.println(first + "_" + last + code);
    }
}