package BinaryTree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
  TreeNode left;
   TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }

}

public class BoundaryTraversal {
        ArrayList<Integer> boundaryTraversal(TreeNode root) {
         ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (!iss(root)) {
            res.add(root.val);
        }
        addl(root,res);
        preor(root,res);
        addr(root,res);
        return res;
        
    }
    
    public static boolean iss(TreeNode root){
        return root.left==null && root.right==null;
    }
    public static void addl(TreeNode root, List<Integer> res){
        TreeNode cur=root.left;
        while(cur!=null){
            if(iss(cur)==false){
                res.add(cur.val);
            }
            if(cur.left!=null){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
    }
     public static void addr(TreeNode root, List<Integer> res){
        TreeNode cur=root.right;
        List<Integer> temp=new ArrayList<>();
        while(cur!=null){
            if(iss(cur)==false){
                temp.add(cur.val);
            }
            if(cur.right!=null){
                cur=cur.right;
            }
            else{
                cur=cur.left;
            }

        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }
    public static void preor(TreeNode root,List<Integer> res){
        if (iss(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null) {
            preor(root.left, res);
        }
        if (root.right != null) {
            preor(root.right, res);
        }

    }
   
}
