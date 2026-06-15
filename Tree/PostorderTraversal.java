// Postorder Traversal using Array Representation .
//Left->Right->Root 
// visit the node 3rd time
import java.util.Scanner;
public class PostorderTraversal {
        static void postorder(int tree[], int i) {
          if (i >= tree.length)
          return;

        postorder(tree, 2 * i + 1);
        postorder(tree, 2 * i + 2);
        System.out.print(tree[i] + " ");
    }
    public static void main(String[] args) {
        int tree[] = {1, 2, 3, 4, 5, 6, 7, 8,9,10};

        System.out.print("Postorder: ");
        postorder(tree, 0);
    }
}