package com.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 输入:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * 输出:
 * [
 * "cats and dog",
 * "cat sand dog"
 * ]
 * 示例 2：
 * <p>
 * 输入:
 * s = "pineapplepenapple"
 * wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 * 输出:
 * [
 * "pine apple pen apple",
 * "pineapple pen apple",
 * "pine applepen apple"
 * ]
 * 解释: 注意你可以重复使用字典中的单词。
 * 示例 3：
 * <p>
 * 输入:
 * s = "catsandog"
 * wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出:
 * []
 */
public class Solution140 {
    private static Map<String, List<String>> map = new HashMap<>();

    public static List<String> wordBreak(String s, List<String> wordDict) {
        if (map.containsKey(s)) return map.get(s);
        List<String> list = new ArrayList<>();
        if (s.length() == 0) {
            list.add("");
            return list;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> tmpList = wordBreak(s.substring(word.length()), wordDict);
                for (String tmp : tmpList)
                    list.add(word + (tmp.equals("") ? "" : " ") + tmp);
            }
        }
        map.put(s, list);
        return list;
    }
}
