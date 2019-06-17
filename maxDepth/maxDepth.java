package com.java.bit.oj;

public class maxDepth {
    //返回以root为根节点的二叉树最大深度
    public int maxDepth(TreeNode root) {
            if(root==null)
               return 0;
            int maxDepth=Math.max(maxDepth(root.left),maxDepth(root.right));
            return maxDepth+1;
    }
}
