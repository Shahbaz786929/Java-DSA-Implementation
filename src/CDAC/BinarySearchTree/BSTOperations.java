package CDAC.BinarySearchTree;

public interface BSTOperations<E> {

    void insert(E data);

    boolean search(E data);
    boolean contains(E data);

    void inorder();
    void preorder();
    void postorder();

    E findMin();
    E findMax();

    void delete(E data);

    int size();

    boolean isEmpty();

    void printTree();
}