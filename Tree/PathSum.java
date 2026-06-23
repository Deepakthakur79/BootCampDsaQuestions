//Path Sum binary tree ka ek concept hai jisme hum check karte hain ki root se leaf node tak 
// koi aisa path hai ya nahi jiska total sum given value ke equal ho.
//Root value + child values + .... + leaf value = Target Sum

import java.util.*;

class PathSum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static boolean hasPathSum(Node root, int targetSum) {

        if (root == null)
            return false;

        // leaf node condition
        if (root.left == null && root.right == null) {
            return targetSum == root.data;
        }

        // subtract current node value
        int remaining = targetSum - root.data;

        return hasPathSum(root.left, remaining) ||
               hasPathSum(root.right, remaining);
    }


    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(11);

        root.right.left = new Node(13);
        root.right.right = new Node(4);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);


        int targetSum = 22;

        if (hasPathSum(root, targetSum))
            System.out.println("Path exists");
        else
            System.out.println("Path does not exist");
    }
}