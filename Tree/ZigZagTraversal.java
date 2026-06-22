// ZigZag Traversal of a Binary Tree
//Zig-Zag me direction change hoti hai:

//Level 0 → Left to Right
//Level 1 → Right to Left
//Level 2 → Left to Right

import java.util.*;

class ZigZag {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }


    static void zigzag(Node root) {

        if(root == null)
            return;


        Queue<Node> q = new LinkedList<>();

        q.add(root);

        boolean leftToRight = true;


        while(!q.isEmpty()) {

            int size = q.size();

            int arr[] = new int[size];


            for(int i = 0; i < size; i++) {

                Node temp = q.remove();


                int index;

                if(leftToRight)
                    index = i;
                else
                    index = size - 1 - i;


                arr[index] = temp.data;


                if(temp.left != null)
                    q.add(temp.left);


                if(temp.right != null)
                    q.add(temp.right);
            }


            for(int i = 0; i < size; i++)
                System.out.print(arr[i]+" ");


            leftToRight = !leftToRight;
        }
    }


    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);


        zigzag(root);
    }
}