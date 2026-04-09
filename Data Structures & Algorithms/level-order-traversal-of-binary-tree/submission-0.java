/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finList = new ArrayList<>();
        if (root == null) return finList;
        Queue<TreeNode> queue = new LinkedList<>();
        int currLevel = 0; //tracks how many nodes are left in queue that are on curr level
        int nextLevel = 0; //tracks how many nodes are on next level
        
        //add root
        queue.add(root);
        currLevel++;
        List<Integer> currList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            currLevel--;
            currList.add(node.val);

            //add left and right nodes if you can to queue
            if (node.left != null) {
                queue.add(node.left);
                nextLevel++;
            }
            if (node.right != null) {
                queue.add(node.right);
                nextLevel++;
            }

            if (currLevel == 0) {
                //add current Levels list to finList then create new list
                finList.add(currList);
                currList = new ArrayList<>();
                currLevel = nextLevel;
                nextLevel = 0;
            }
        }


        return finList;
    }
}
