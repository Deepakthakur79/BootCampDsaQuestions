// lowest common ancestor of two nodes in a binary tree
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class LCATree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null)
            return root;

        return left != null ? left : right;
    }


    public static void main(String[] args) {

        LCATree obj = new LCATree();

        // Creating tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(6);


        TreeNode p = root.left.left.left; // 6
        TreeNode q = root.left.right;     // 5


        TreeNode ans = obj.lowestCommonAncestor(root, p, q);

        System.out.println("LCA = " + ans.val);
    }
}