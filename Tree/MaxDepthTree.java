// find the max depth of a binary tree
import java.util.Scanner;
public class MaxDepthTree {

    static int maxDepth(int tree[], int i) {
        if (i >= tree.length)
            return 0;

        int left = maxDepth(tree, 2 * i + 1);
        int right = maxDepth(tree, 2 * i + 2);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        int tree[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Maximum Depth = " + maxDepth(tree, 0));
    }
}