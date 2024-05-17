package strukDat5;



public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public BinaryTree() {
        root = null;
    }

    // Fungsi untuk menambahkan node secara manual
    public void addRoot(int data) {
        root = new Node(data);
    }

    // In-order traversal
    public void inOrder(Node node) {
        if (node != null) { // node != null
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    // Pre-order traversal
    public void preOrder(Node node) {
        if (node != null) { // node != null
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Post-order traversal
    public void postOrder(Node node) {
        if (node != null) { // node != null
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Menentukan struktur tree secara manual
        tree.addRoot(20); // Root
        tree.root.left = new Node(2); // Menambahkan node
        tree.root.right = new Node(25); // Menambahkan node
        tree.root.left.left = new Node(37); // Menambahkan node
        tree.root.left.right = new Node(12); // Menambahkan node
        tree.root.right.right = new Node(16); // Menambahkan node

        // Menampilkan traversals
        System.out.println("\nPre Order: ");
        tree.preOrder(tree.root);
        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);
    }
}