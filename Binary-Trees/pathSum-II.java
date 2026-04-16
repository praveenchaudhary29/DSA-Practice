//Question - Leetcode (113 Medium)
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer = new ArrayList<>();
        path(root,targetSum,answer,new ArrayList<>());
        return answer;
    }

    public void path(TreeNode root,int targetSum,List<List<Integer>> answer,List<Integer> current){
        if(root == null) return;
        current.add(root.val);
        if(root.left == null && root.right==null && targetSum == root.val){
          answer.add(new ArrayList<>(current));
        }else{
          path(root.left,targetSum-root.val,answer,current);
          path(root.right,targetSum-root.val,answer,current);
        }
        current.remove(current.size()-1);
    }
}
