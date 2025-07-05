import java.util.LinkedList;
import java.util.Queue;

public class _03_BST {
    public class Node {
        int value;
        int height;
        Node left, right;

     Node(int value) {
            
            this.value = value;
        }
    }

    public Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if(node == null) {
            return new Node(value);
        }

        if(value < node.value) {
            node.left = insertRec(node.left, value);
        }
        else if(value > node.value) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    public int getHeight(Node node) {
        if(node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    public void printTreeStructure() {
        int height = getHeight(root);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int maxWidth = (int) Math.pow(2, height) * 2;

        for (int level = 0; level < height; level++) {
            int levelNodes = queue.size();
            int spaces = maxWidth / (levelNodes + 1);

            printSpaces(spaces / 2);

            for (int i = 0; i < levelNodes; i++) {
                Node node = queue.poll();
                if (node == null) {
                    System.out.print(" ");
                    queue.offer(null);
                    queue.offer(null);
                } else {
                    System.out.print(node.value);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }

                printSpaces(spaces);
            }

            System.out.println();
        }
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) System.out.print(" ");
    }

    public static void main(String[] args) {
        _03_BST tree = new _03_BST();
        int[] values = {10, 5, 15, 3, 7, 12, 18};
        for (int val : values) {
            tree.insert(val);
        }

        tree.printTreeStructure();
    }
}
