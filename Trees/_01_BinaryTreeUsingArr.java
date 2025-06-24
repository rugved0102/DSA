// package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class _01_BinaryTreeUsingArr {
    public _01_BinaryTreeUsingArr() {

    }

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void BuildBinaryTreeFromArr(int[] arr) {
        if(arr.length == 0 || arr[0] == -1) return;

        root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        

        while(!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();
            if(arr[i] != -1) {
                current.left = new Node(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if(i >= arr.length) break;

            if(arr[i] != -1) {
                current.right = new Node(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
    }
    public void display() {
            display(root, "");
    }

        private void display(Node node, String indent) {
            if(node == null) return;
            System.out.println(indent + node.value);
            display(node.left, indent + "\t");
            display(node.right, indent + "\t");
     }

     public static void main(String[] args) {
        _01_BinaryTreeUsingArr tree = new _01_BinaryTreeUsingArr();
        int[] input = {1,2,3,5,4,-1,-1};
        tree.BuildBinaryTreeFromArr(input);

        System.out.println("Tree Structure");
        tree.display();
     }
}
