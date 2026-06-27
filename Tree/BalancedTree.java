//balanced tree
//Balanced Binary Tree ka matlab hota hai ki tree me har node ke
// left aur right subtree ki height ka difference zyada nahi hona chahiye.
import java.util.Scanner;
class BalancedTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }


    static int height(Node root) {

        if(root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }


    static boolean isBalanced(Node root) {

        if(root == null)
            return true;


        int left = height(root.left);
        int right = height(root.right);


        if(Math.abs(left - right) > 1)
            return false;


        return isBalanced(root.left) && 
               isBalanced(root.right);
    }


    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);


        if(isBalanced(root))
            System.out.println("Balanced Tree");
        else
            System.out.println("Not Balanced Tree");
    }
}