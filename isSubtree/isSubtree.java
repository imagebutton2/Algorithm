package com.java.bit.oj;
//另一个树的子树
//给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
//示例 1:
//给定的树 s:
//     3
//    / \
//   4   5
//  / \
// 1   2
//
//给定的树 t：
//   4
//  / \
// 1   2
//返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
//示例 2:
//给定的树 s：
//     3
//    / \
//   4   5
//  / \
// 1   2
//    /
//   0
//给定的树 t：
//   4
//  / \
// 1   2
//返回 false。
//另一颗的子树=查找二叉树中指定值的节点+判断两颗二叉树是否完全相同；
//找到t的根节点在s中的位置，
//判断两颗二叉树是否相同
public class isSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean flag = false;
       if(s!=null&& t!= null){
            if(s.val==t.val){
                flag=isSameTree(s,t);
            }
            if(!flag){
                flag=isSubtree(s.left,t)||isSubtree(s.right,t);
            }
       }
       return flag;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
