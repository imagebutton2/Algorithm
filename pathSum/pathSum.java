package My.leetcode.My;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }

}

public class pathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> retList = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        dfs(root, sum, list, retList);
        return retList;
    }
    private void dfs(TreeNode root, int value, List<Integer> list, List<List<Integer>> retList) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        if (root.left == null && root.right == null && value == root.val) {
            retList.add(new ArrayList(list)); // 第一个要 注意的点，这里应该添加此时此刻列表的快照，不能直接添加，因为后面还会更改这个列表
            // return; 第三个注意的点，不能直接返回，即使找到了符合条件的列表，也需要接着执行，在后面删除当前添加的最后一个节点然后返回给上层
        }

        dfs(root.left, value - root.val, list, retList);
        dfs(root.right, value - root.val, list, retList);

        // 第二个要注意的点，此时底层遍历完后，应当删除这一层遍历中添加的元素（恢复list的原貌），再返回给上层进行其他子树的遍历
        list.remove(list.size() - 1);
    }
}
