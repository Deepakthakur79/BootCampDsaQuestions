// morris traversal
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MorrisTraversal {

    public static void morrisInorder(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {

            if (curr.left == null) {
                System.out.print(curr.val + " ");
                curr = curr.right;
            } else {

                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr; // create thread
                    curr = curr.left;
                } else {
                    pred.right = null; // remove thread
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        morrisInorder(root);
    }
}