package com.OJ.Day19_07_29;

import java.util.ArrayList;

/**
 * F(i,j)=min(F(i-1,j),F(i-1,j-1))+triangle[i][j]
 */
public class minimumTotal {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle.size() == 0 || triangle == null) {
            return 0;
        }
        int dp[][] = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                }
                dp[i][j] = dp[i][j] + triangle.get(i).get(j);
            }
        }
        int min_Total = Integer.MAX_VALUE;
        for (int i = 0; i < triangle.size(); i++) {
            min_Total = Math.min(min_Total, dp[triangle.size() - 1][i]);
        }

        return min_Total;
    }
}
