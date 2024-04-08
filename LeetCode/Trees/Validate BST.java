//TC:O(H) SC:O(H)
public class Solution {
    public boolean check(TreeNode root, long mini, long maxi) {
        if (root == null)
            return true;

        if (root.val >= maxi || root.val <= mini)
            return false;

        return check(root.left, mini, root.val) && check(root.right, root.val, maxi);
    }

    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}

// TC:O(H) SC:O(N)
class Solution {
    ArrayList<Integer> ls= new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i)>=ls.get(i+1))
            return false;
        }
        return true;
    }
  void  inorder(TreeNode root){
    if(root== null)
    return;

    inorder(root.left);
    ls.add(root.val);
    inorder(root.right);
  }
}
