// Preorder Traversal using Array Representation .
// Root->Left->Right
//visit the node 1st time
import java.util.Scanner;
public class PreorderTraversal {
    static void preorder(int tree[], int i) {
         if (i >= tree.length)
             return;

        System.out.print(tree[i] + " ");
        preorder(tree, 2 * i + 1);
        preorder(tree, 2 * i + 2);
    }

    public static void main(String[] args) {
        int tree[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Preorder: ");
        preorder(tree, 0);
    }
}
