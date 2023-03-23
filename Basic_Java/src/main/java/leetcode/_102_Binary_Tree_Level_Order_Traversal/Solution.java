package leetcode._102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public static void main(String[] args) {

        // tree initialization
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        // call LevelOrder
        System.out.println(levelOrder(tree));

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // process all element in queue
        while (queue.size() > 0) {

            // need to process elements in queue
            int size = queue.size();

            // levelResults
            List<Integer> tempResult = new ArrayList();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                tempResult.add(currentNode.val);
                // process left and right child if present
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(tempResult);
        }

        return result;
    }

}
