// Labelorder Traversal using Array Representation .
// visit the node 1st time
import java.util.Scanner;
public class LabelorderTraversal {
    static void levelOrder(int tree[]) {
    for (int i = 0; i < tree.length; i++) {
        System.out.print(tree[i] + " ");
    }
}
    public static void main(String[] args) {
        int tree[] = {1, 2, 3,8,9, 4, 5, 6, 7};

        System.out.print("Levelorder: ");
        levelOrder(tree);
    }
}