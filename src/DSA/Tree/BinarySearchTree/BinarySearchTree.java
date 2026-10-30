package DSA.Tree.BinarySearchTree;

public class BinarySearchTree {

    class Node {
        Node left;
        int key;
        Node right;

        public Node(int key) {
            this.key = key;
        }

        public Node(Node left, int key, Node right) {
            this.left = left;
            this.key = key;
            this.right = right;
        }
    }

    Node root;
    int count = 0;
    boolean flag;

    public boolean add ( int key) {
        flag  = true;
        root = add(root, key);
        return flag;
    }

    public int size () {
        return count;
    }

    public Node add(Node n, int key) {
        if (n == null) {
            n = new Node(key);
            count++;
            return n;
        }
        if (key < n.key) {
            n.left = add(n.left, key);
        } else if (key > n.key) {
            n.right = add(n.right, key);
        }
        else {
            flag = false;
        }
        return n;
    }

    public Boolean contains(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.key > val) {
            return contains(root.left, val);
        } else if (root.key == val) {
            return true;
        }
        else {
            return contains(root.right, val);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bfs = new BinarySearchTree();
         bfs.size();
        bfs.add(10);
        bfs.add(20);
        bfs.add(30);
        bfs.add(40);
        bfs.add(90);
        bfs.add(80);
        bfs.add(50);
        bfs.add(60);
        bfs.add(70);
        System.out.println( bfs.size());

        System.out.println( bfs.contains(bfs.root,91));
    }
}
