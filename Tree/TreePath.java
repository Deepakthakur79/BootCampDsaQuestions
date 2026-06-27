//binary tree paths

import java.util.*;

class TreePath {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }


    static void printPaths(Node root, String path) {

        if(root == null)
            return;


        path = path + root.data;


        // leaf node
        if(root.left == null && root.right == null) {
            System.out.println(path);
            return;
        }


        printPaths(root.left, path + "->");

        printPaths(root.right, path + "->");
    }


    public static void main(String[] args) {


        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(5);


        printPaths(root, "");
    }
}