package CDAC.dsaPractise.setTwo;

import java.sql.SQLOutput;

public class ProductBST {
    private static class BSTNode{
        Product data;
        BSTNode left ,right;

        BSTNode(Product data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    BSTNode root;
    int count;

    public void insert(Product p) {
        if (p == null) {
            return;
        }

        root =  insertRecursive(root, p);
    }

    public BSTNode insertRecursive(BSTNode curr, Product p) {

        if(curr==null){
            return new BSTNode(p);
        }
        if (p.pid < curr.data.pid) {
            curr.left = insertRecursive( curr.left, p);
        }else {
            curr.right = insertRecursive(curr.right,p);
        }

        return curr;
    }
    public void inorder (){
        if(root==null){
            return;

        }
        inorderRecursive(root);
    }
    private void inorderRecursive(BSTNode current){
        if(current==null){
            return;
        }
        inorderRecursive(current.left);
        System.out.println(current.data);
        inorderRecursive(current.right);
    }

    public void preOrder() {
        if (root == null) {
            System.out.println("Tree is empty...");
            return;
        }
        preOrderRecursive(root);
    }

    private void preOrderRecursive(BSTNode curr) {
        if (curr == null) {
            return;
        }
        System.out.println(curr.data);
        preOrderRecursive(curr.left);
        preOrderRecursive(curr.right);

    }
    public int height(){
        return height(root);
    }
    public int height(BSTNode current){
        if(current==null){
            return -1;
        }
        int leftHeight=height(current.left);
        int  rightHeight=height(current.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        ProductBST bst=new ProductBST();
        bst.insert(new Product(50, "Smartphone", "Mobiles", 4.6, 25000.0));
        bst.insert(new Product(25, "Tablet", "Electronics", 4.3, 18000.0));
        bst.insert(new Product(75, "Ultrabook", "Computers", 4.8, 65000.0));
        bst.insert(new Product(10, "Stylus Pen", "Accessories", 4.1, 1500.0));
        bst.insert(new Product(35, "Tablet Case", "Accessories", 4.0, 799.0));
        bst.insert(new Product(60, "Wireless Router", "Networking", 4.4, 3200.0));
        bst.insert(new Product(90, "Gaming Chair", "Furniture", 4.7, 14000.0));
        System.out.println("--- 1. INORDER TRAVERSAL (Sorted by ID) ---");
        bst.inorder();
        System.out.println("\n--- 2. PREORDER TRAVERSAL (Root -> Left -> Right) ---");
        bst.preOrder();
        System.out.println("\n--- 3. TREE HEIGHT ---");
        System.out.println("Calculated Tree Height: " + bst.height());
    }
}
