package CDAC.dsaPractise.setOne;

public class PatientBST {

    private static class BSTNode {
        Patient data;
        BSTNode left, right;

        BSTNode(Patient data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private BSTNode root;

    public void insert(Patient p) {
        if (p == null) {
            return;
        }

        root = insertRecursive(root , p);
    }

    private BSTNode insertRecursive(BSTNode curr, Patient p) {
        if (curr == null) {
            return new BSTNode(p);
        }

        if (p.getId() > curr.data.getId()) {
            curr.right = insertRecursive(curr.right, p);
        }
        return curr;
    }

    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        inorderRecursive(root);
    }

    private void inorderRecursive(BSTNode curr) {
        if (curr == null) {
            return;
        }
        inorderRecursive(curr.left);
        System.out.println(curr.data);

        inorderRecursive(curr.right);
    }

    public void postorder() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        postOrderRecursive(root);
    }

    private void postOrderRecursive(BSTNode curr) {
        if (curr == null) {
            return;
        }

        postOrderRecursive(curr.left);
        postOrderRecursive(curr.right);
        System.out.println(curr.data);
    }

    public Patient findMin() {
        if (root == null) {
            return null;
        }

        BSTNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
    }


    public static void main(String[] args) {

        PatientBST tree = new PatientBST();

        tree.insert(new Patient(105, "Vinod", 45, "Cardiology"));
        tree.insert(new Patient(102, "Shyam", 12, "Pediatrics"));
        tree.insert(new Patient(108, "Ananya", 68, "Cardiology"));
        tree.insert(new Patient(101, "Deepak", 29, "Orthopedics"));
        tree.insert(new Patient(104, "Kavya", 5, "Pediatrics"));
        tree.insert(new Patient(110, "Rahul", 82, "Geriatrics"));

        System.out.println("--- INORDER TRAVERSAL ---");
        tree.inorder();

        System.out.println("\n--- POSTORDER TRAVERSAL ---");
        tree.postorder();

        System.out.println("\n--- MINIMUM ID PATIENT ---");
        Patient min = tree.findMin();

        if (min != null) {
            System.out.println(min);
        } else {
            System.out.println("Tree is empty.");
        }
    }
}
