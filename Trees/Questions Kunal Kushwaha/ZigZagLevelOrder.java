import java.util.*;

//   Definition for a binary tree node.
//   public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }
//   }
 
class Solution {
    public List<List<Integer>> ZigZagLevelOrder(TreeNode root) {
         List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        boolean leftToRight = true;
        if(root == null) return res;
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
           for(int i = 0; i < size; i++) {
                if(leftToRight) {
                    TreeNode curr = q.pollFirst();
                    temp.add(curr.val);
                    if(curr.left != null) q.offerLast(curr.left);
                    if(curr.right != null) q.offerLast(curr.right);
                } else {
                    TreeNode curr = q.pollLast();
                    temp.add(curr.val);
                    if(curr.right != null) q.offerFirst(curr.right);
                    if(curr.left != null) q.offerFirst(curr.left);
                }
           }
            res.add(temp);
            leftToRight = !leftToRight;
        }
        return res;
    }

}