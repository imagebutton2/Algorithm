package com.java.bit.oj;

import java.util.ArrayList;
import java.util.List;
// 二叉树的中序遍历
//给定一个二叉树，返回它的中序 遍历。
public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList();
        if(root==null){
            return res;
        }else {
          inorderTraversal(root,res);
        }
       return res;
    }
    private void  inorderTraversal(TreeNode node,List<Integer> list){
    if(node==null){
        return;
    }
    inorderTraversal(node.left,list);
    list.add(node.val);
    inorderTraversal(node.right,list);
    }
}
