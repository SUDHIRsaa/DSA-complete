package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


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

public class HieghtOfaTree {
    
    
   
    public int maxDepth(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return 0;
        q.add(root);

        while(!q.isEmpty()){
        int size=q.size();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            
            ls.add(node.val);
            if (node.left != null) {
                    q.add(node.left);
             }
           if (node.right != null) {
                    q.add(node.right);
          }

        }
        ans.add(ls);
        }
        return ans.size();
    }

}
