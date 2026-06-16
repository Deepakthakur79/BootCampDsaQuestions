import java.util.Scanner;

public class SymatricMirrorImg {

    static boolean isMirror(int tree[], int left, int right) {

        if (left >= tree.length && right >= tree.length)
            return true;

        if (left >= tree.length || right >= tree.length)
            return false;

        if (tree[left] != tree[right])
            return false;

        return isMirror(tree, 2 * left + 1, 2 * right + 2)
                && isMirror(tree, 2 * left + 2, 2 * right + 1);
    }

    static boolean isSymmetric(int tree[]) {
        return isMirror(tree, 1, 2);
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