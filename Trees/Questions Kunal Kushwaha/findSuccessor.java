import java.util.LinkedList;
import java.util.Queue;

public class findSuccessor {
    // Make TreeNode static so it can be used in static context
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Sample tree:
        //        1
        //      /   \
        //     2     3
        //    / \
        //   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(FindSuccessor(root, 2));  // Output: 3
        System.out.println(FindSuccessor(root, 5));  // Output: -1
        System.out.println(FindSuccessor(root, 3));  // Output: 4
    }

    public static int FindSuccessor(TreeNode root, int k) {
        if (root == null) return -1;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) q.offer(curr.left);
            if (curr.right != null) q.offer(curr.right);

            if (curr.val == k) {
                // Return the next node in level-order
                TreeNode next = q.poll();
                return next != null ? next.val : -1;
            }
        }

        return -1; // not found
    }
}
