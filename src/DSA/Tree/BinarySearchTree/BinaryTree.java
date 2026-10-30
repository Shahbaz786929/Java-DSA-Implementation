package DSA.Tree.BinarySearchTree;

import java.util.Scanner;

public class BinaryTree {

    static class Node {
        Node left;
        Node right;
        int key;

        public Node(int key) {
            this.key = key;
        }

        public Node(Node left, Node right, int key) {
            this.left = left;
            this.right = right;
            this.key = key;
        }
    }

    Node root;

    public void populate() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root Element");
        root = new Node(s.nextInt());
        populate(root);
        s.close();
    }
    public void populate(Node n){
        System.out.println("Do you want to Insert element lefi side :" + n.key);
        boolean left = new Scanner(System.in).nextBoolean();
        if (left) {
            n.left = new Node(new Scanner(System.in).nextInt());
            populate(n.left);
        }
        System.out.println("Do you want to Insert element right side :" + n.key);
        boolean right = new Scanner(System.in).nextBoolean();
        if (right) {
            n.right = new Node(new Scanner(System.in).nextInt());
            populate(n.right);
        }
    }

    public void display () {
        display(root, 0);
    }

    public void display(Node n , int level) {
        if (n == null) return;
        display(n.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++){
                System.out.println("|\t");
            }
            System.out.println("|------------>" + n.key);
        }
        else {
            System.out.println(n.key);
            display(n.left, level + 1);
        }
    }

    public static void main(String[] args) {
        BinaryTree tr = new BinaryTree();
        tr.populate();
        tr.display();
    }
}
