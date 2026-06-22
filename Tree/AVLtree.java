//AVL tree is a self-balancing binary search tree where the difference between heights of left
// and right subtrees cannot be more than one for any node.
class AVLTree {

    static class Node {
        int data;
        Node left, right;
        int height;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }


    static int height(Node n) {
        if(n == null)
            return 0;

        return n.height;
    }


    static int getBalance(Node n) {

        if(n == null)
            return 0;

        return height(n.left) - height(n.right);
    }


    // Right Rotation
    static Node rightRotate(Node root) {

        Node temp = root.left;

        root.left = temp.right;
        temp.right = root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;

        return temp;
    }


    // Left Rotation
    static Node leftRotate(Node root) {

        Node temp = root.right;

        root.right = temp.left;
        temp.left = root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;

        return temp;
    }


    static Node insert(Node root, int data) {

        if(root == null)
            return new Node(data);


        if(data < root.data)
            root.left = insert(root.left, data);

        else
            root.right = insert(root.right, data);


        root.height = Math.max(height(root.left), height(root.right))+1;


        int balance = getBalance(root);


        // LL
        if(balance > 1)
            return rightRotate(root);


        // RR
        if(balance < -1)
            return leftRotate(root);


        return root;
    }


    static void inorder(Node root) {

        if(root != null) {

            inorder(root.left);

            System.out.print(root.data+" ");

            inorder(root.right);
        }
    }


    public static void main(String[] args) {

        Node root = null;


        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 10);
        root = insert(root, 40);


        System.out.println("Inorder:");

        inorder(root);
    }
} 