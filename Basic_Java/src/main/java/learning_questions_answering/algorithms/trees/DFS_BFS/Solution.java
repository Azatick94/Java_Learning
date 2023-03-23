package learning_questions_answering.algorithms.trees.DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * RESOURCES <br>
 *
 * https://www.digitalocean.com/community/tutorials/breadth-first-search-depth-first-search-bfs-dfs
 *
 */
public class Solution {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);

        // PreOrder Traversal
        System.out.println("PreOrder Traversal:");
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        System.out.println(result);

        // InOrder Traversal
        System.out.println("InOrder Traversal:");
        result = new ArrayList<>();
        inorderTraversal(root, result);
        System.out.println(result);

        // PostOrder Traversal
        System.out.println("PostOrder Traversal:");
        result = new ArrayList<>();
        postOrderTraversal(root, result);
        System.out.println(result);

        // Level Order Traversal
        System.out.println("Level Order Traversal:");
        result = new ArrayList<>();
        levelOrderTraversal(root, result);
        System.out.println(result);



        Queue<Integer> queueLevel = new LinkedList();
        queueLevel.add(0);
        int tempLevel = queueLevel.poll();

    }


    /*

    SAMPLE BINARY SEARCH TREE

            0
          /   \
         1     2
        /  \
       3    4

    DEPTH FIRST SEARCH - DFS

    * Preorder Traversal   = 0,1,3,4,2
    * InOrder Traversal    = 3,1,4,0,2
    * PostOrder Traversal  = 3,4,1,2,0

    BREADTH FIRST SEARCH - BFS

    * Level Traversal      = 0,1,2,3,4

     */

    /**
     * In pre-order traversal of a binary tree, we first traverse the root, then the left subtree and then finally the right subtree.
     * We do this recursively to benefit from the fact that left and right subtrees are also trees.
     */
    public static void preorderTraversal(TreeNode root, List<Integer> result) {

        // check if root is null
        if (root == null) return;

        // check root
        result.add(root.val);

        // check left subtree
        preorderTraversal(root.left, result);

        // check right subtree
        preorderTraversal(root.right, result);

    }


    /**
     * In-order traversal of a binary tree first traverses the left subtree then the root and finally the right subtree.
     */
    public static void inorderTraversal(TreeNode root, List<Integer> result) {

        // check if root is null
        if (root == null) return;

        // check left subtree
        inorderTraversal(root.left, result);

        // check root
        result.add(root.val);

        // check right subtree
        inorderTraversal(root.right, result);

    }

    /**
     * Post-order traversal of a binary tree first traverses the left subtree then the right subtree and then finally the root.
     */
    public static void postOrderTraversal(TreeNode root, List<Integer> result) {

        // check if root is null
        if (root == null) return;

        // check left subtree
        postOrderTraversal(root.left, result);

        // check right subtree
        postOrderTraversal(root.right, result);

        // check root
        result.add(root.val);
    }


    /**
     * Level order traversal uses a queue to keep track of nodes to visit. After visiting a node, its children are put in the queue.
     * To get a new node to traverse, we take out elements from the queue.
     */
    public static void levelOrderTraversal(TreeNode root, List<Integer> result) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            result.add(temp.val);

            /*add left child to the queue */
            if (temp.left != null) {
                queue.add(temp.left);
            }

            /*add right right child to the queue */
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

    }

}
