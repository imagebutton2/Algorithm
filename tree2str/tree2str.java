package com.java.bit.oj;

public class tree2str {
    //根据二叉树创建字符串

    /**
     * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
     *
     * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。

     输入: 二叉树: [1,2,3,4]
     1
     /   \
     2     3
     /
     4

     输出: "1(2(4))(3)"

     解释: 原本将是“1(2(4)())(3())”，
     在你省略所有不必要的空括号对之后，
     它将是“1(2(4))(3)”。

     示例 2:

     输入: 二叉树: [1,2,3,null,4]
     1
     /   \
     2     3
     \
     4

     输出: "1(2()(4))(3)"




     */




    public String tree2str(TreeNode t) {
        StringBuilder res = new StringBuilder();
        tree2str(t, res);
        return res.toString();
    }

    public void tree2str(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append(node.val);
        if (node.left != null) {
            sb.append("(");
            tree2str(node.left, sb);
            sb.append(")");
        } else {
            //左子树为空,同时判断右子树空
            if(node.right!=null){
                sb.append("()");
            }
        }

        if (node.right != null) {
            sb.append("(");
            tree2str(node.right, sb);
            sb.append(")");
        }
    }
}
