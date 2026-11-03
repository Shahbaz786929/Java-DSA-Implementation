package CDAC.BinarySearchTree;

public class BinarySearchTree<E extends Comparable<E>> implements BSTOperations<E> {

    private Node<E> root;
    private int count = 0;

    @Override
    public void insert(E data) {

        root = insertNode(root, data);
    }

    private Node<E> insertNode(Node<E> root, E data) {

        if (root == null) {
            count++;
            return new Node<>(data);
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertNode(root.left, data);
        }
        else if (data.compareTo(root.data) > 0) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    @Override
    public boolean search(E data) {

        Node<E> current = root;

        while (current != null) {

            int result = data.compareTo(current.data);

            if (result == 0) {
                return true;
            }
            else if (result < 0) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }

        return false;
    }

    @Override
    public boolean contains(E data) {

        return search(data);
    }

    @Override
    public void inorder() {

        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(Node<E> root) {

        if (root == null) {
            return;
        }

        inorderTraversal(root.left);

        System.out.print(root.data + " ");

        inorderTraversal(root.right);
    }

    @Override
    public void preorder() {

        preorderTraversal(root);
        System.out.println();
    }

    private void preorderTraversal(Node<E> root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    @Override
    public void postorder() {

        postorderTraversal(root);
        System.out.println();
    }

    private void postorderTraversal(Node<E> root) {

        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);

        System.out.print(root.data + " ");
    }

    @Override
    public E findMin() {

        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        Node<E> current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    @Override
    public E findMax() {

        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        Node<E> current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    @Override
    public void delete(E data) {

        if (search(data)) {
            root = deleteNode(root, data);
            count--;
        }
    }

    private Node<E> deleteNode(Node<E> root, E data) {

        if (root == null) {
            return null;
        }

        int result = data.compareTo(root.data);

        if (result < 0) {
            root.left = deleteNode(root.left, data);
        }
        else if (result > 0) {
            root.right = deleteNode(root.right, data);
        }
        else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }
            Node<E> successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.data = successor.data;

            root.right = deleteNode(root.right, successor.data);
        }

        return root;
    }

    @Override
    public int size() {

        return count;
    }

    @Override
    public boolean isEmpty() {

        return root == null;
    }

    @Override
    public void printTree() {

        printTreeStructure(root, 0);
    }

    private void printTreeStructure(Node<E> root, int level) {

        if (root == null) {
            return;
        }

        printTreeStructure(root.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        System.out.println(root.data);

        printTreeStructure(root.left, level + 1);
    }
}