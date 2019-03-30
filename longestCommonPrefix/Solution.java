//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。
//示例 1:
//输入: ["flower","flow","flight"]
//输出: "fl"
//示例 2:
//输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
public class Solution4 {
    public  String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        if (strs.length>1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length()<=i ||strs[j].charAt(i) != curr) {
                        return sb.toString();
                    }
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {
                        sb.append(curr);
                    }
                }
            }
        }
        return sb.toString();
    }

}
