//Symatric tree (mirror image)
import java.util.Scanner;

public class Main {

    static boolean isSymmetric(int tree[]) {

        int n = tree.length;

        for (int i = 1; i <= (n - 1) / 2; i++) {

            int mirror = n - i;

            if (tree[i] != tree[mirror])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int tree[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }

        if (isSymmetric(tree))
            System.out.println("Symmetric Tree");
        else
            System.out.println("Not Symmetric Tree");
    }
}