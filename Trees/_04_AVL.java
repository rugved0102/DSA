import java.util.*;

public class _04_AVL {

    class Node {
        int key, height;
        Node left, right;

        Node(int key) {
            this.key = key;
            height = 1;
        }
    }

    private Node root;

    // ========== AVL FUNCTIONS ==========

    int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    Node insertAVL(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insertAVL(node.left, key);
        else if (key > node.key)
            node.right = insertAVL(node.right, key);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);
        // RR
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);
        // LR
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // RL
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void insertAVL(int key) {
        root = insertAVL(root, key);
    }

    // ========== UNBALANCED BST ==========

    Node unbalancedRoot;

    Node insertUnbalanced(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.key)
            node.left = insertUnbalanced(node.left, key);
        else
            node.right = insertUnbalanced(node.right, key);

        return node;
    }

    public void insertUnbalanced(int key) {
        unbalancedRoot = insertUnbalanced(unbalancedRoot, key);
    }

    // ========== TREE PRINTER ==========

    public void printTree(Node node) {
        printTree(node, "", true);
    }

    private void printTree(Node node, String indent, boolean isRight) {
        if (node == null) return;

        printTree(node.right, indent + (isRight ? "        " : " |      "), true);
        System.out.println(indent + (isRight ? " /----- " : " \\----- ") + node.key);
        printTree(node.left, indent + (isRight ? " |      " : "        "), false);
    }

    // ========== DRIVER ==========

    public static void main(String[] args) {
        _04_AVL tree = new _04_AVL();
        int[] keys = {10, 20, 30, 40, 50, 25};

        // Insert into unbalanced BST
        for (int key : keys)
            tree.insertUnbalanced(key);

        System.out.println("\n Unbalanced BST:");
        tree.printTree(tree.unbalancedRoot);

        // Insert into AVL Tree (balanced)
        for (int key : keys)
            tree.insertAVL(key);

        System.out.println("\n Balanced AVL Tree:");
        tree.printTree(tree.root);
    }
}
