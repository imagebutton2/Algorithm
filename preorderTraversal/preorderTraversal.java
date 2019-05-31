package com.java.bit.oj;

import java.util.ArrayList;
import java.util.List;
//二叉树的前序遍历
//给定一个二叉树，返回它的 前序 遍历。
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class preorderTraversal {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        preorderTraversal(result,root);
        return result;
    }
    private void preorderTraversal(List<Integer> list,TreeNode node){
    if(node==null){
        return ;
    }
    list.add(node.val);
    preorderTraversal(list,node.left);
    preorderTraversal(list,node.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(3);
        root.right=node1;
        node1.left=node2;
        preorderTraversal traversal=new preorderTraversal();
        List<Integer> result=traversal.preorderTraversal(root);
        System.out.println(result);

    }
}
