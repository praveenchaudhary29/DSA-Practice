//Question - Leetcode (110 Easy)
class Solution {
    public boolean isBalanced(TreeNode root) {
         int height = balance(root,0);
         return isbalance;
       } 

    public boolean isbalance = true;

    public int balance(TreeNode root,int height){
        if(root == null){
            return height;
        }
        int left = balance(root.left,height+1);
        int right = balance(root.right,height+1);
        int diff = Math.abs(left-right);
        if(diff > 1){
          isbalance = false;
        }
        return Math.max(left,right);
}   
}
