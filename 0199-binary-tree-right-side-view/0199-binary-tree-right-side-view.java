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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res,0);
        return res;
    }
    
    public void dfs(TreeNode root, ArrayList<Integer> res, int currLevel){
        if(root == null) return;
      
        if(res.size()==currLevel) res.add(root.val);
        dfs(root.right, res, currLevel+1);
        
         dfs(root.left, res, currLevel+1);
    }
}