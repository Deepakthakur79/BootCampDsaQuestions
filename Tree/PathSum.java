//Path Sum binary tree ka ek concept hai jisme hum check karte hain ki root se leaf node tak 
// koi aisa path hai ya nahi jiska total sum given value ke equal ho.
//Root value + child values + .... + leaf value = Target Sum

class PathSum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean pathSum(Node root, int sum) {

        if(root == null)
            return false;

        // leaf node
        if(root.left == null && root.right == null)
            return sum == root.data;

        sum = sum - root.data;

        return pathSum(root.left, sum) ||
               pathSum(root.right, sum);
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


        int target = 22;

        System.out.println(pathSum(root, target));
    }
}