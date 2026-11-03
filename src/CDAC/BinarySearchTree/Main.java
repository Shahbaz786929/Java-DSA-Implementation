package CDAC.BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        BSTOperations<Integer> bst = new BinarySearchTree<>();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Binary Search Tree:");
        bst.printTree();

        System.out.println("\nSearch 40: " + bst.search(40));

        System.out.println("Contains 100: " + bst.contains(100));

        System.out.print("\nInorder: ");
        bst.inorder();

        System.out.print("Preorder: ");
        bst.preorder();

        System.out.print("Postorder: ");
        bst.postorder();

        System.out.println("\nMinimum: " + bst.findMin());
        System.out.println("Maximum: " + bst.findMax());

        System.out.println("Size: " + bst.size());

        System.out.println("Is Empty: " + bst.isEmpty());

        bst.delete(30);

        System.out.println("\nAfter Deletion:");
        bst.printTree();

        System.out.println("Size: " + bst.size());
    }
}