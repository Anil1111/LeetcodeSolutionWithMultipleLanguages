/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        int ans = 0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left!=null){
                if(node.left.left == null && node.left.right==null){
                    ans += node.left.val;
                }else{
                    stack.push(node.left);
                }
            }

            if(node.right!=null){
                if(node.right.left != null || node.right.right!=null){
                    stack.push(node.right);
                }
            }
        }

        return ans;
    }
}