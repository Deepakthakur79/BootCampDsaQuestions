import java.util.Scanner;
public class InorderTraversal {

    static void inorder(int tree[], int i) {
        if (i >= tree.length)
            return;

        inorder(tree, 2 * i + 1);
        System.out.print(tree[i] + " ");
        inorder(tree, 2 * i + 2);
    }

    public static void main(String[] args) {
        int tree[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Inorder: ");
        inorder(tree, 0);
    }
}