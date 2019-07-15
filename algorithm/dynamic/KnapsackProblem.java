package com.gjz.dynamic;
public class KnapsackProblem {
    //背包问题01
    public static void main(String[] args) {
        int[] w = {1, 4, 3};//物品的重量
        int[] val = {1500, 3000, 2000}; //物品的价值 这里val[i] 就是前面讲的v[i]
        int m = 4; //背包的容量
        int n = val.length; //物品的个数

        //dp[][]
        //n是物品的个数 m是可选择的背包的大小
        int dp[][] = new int[n + 1][m + 1];

        //为了记录放入商品的情况，我们定一个二维数组
        int path[][] = new int[n + 1][m + 1];

        //从物品1开始挑选
        for (int i = 1; i < dp.length; i++) {
            //从背包容量为1开始
            for (int j = 1; j < dp[0].length; j++) {
                //如果当前物品的重量大于背包的重量
                if (w[i - 1] > j) {
                    //按上个物品的选择
                    dp[i][j] = dp[i - 1][j];
                } else { //如果当前物品的重量小于等于背包的重量
                    //上一次的最优选择小于当前物品的最优选择（当前物品的最优选择=选择当前物品+上一次的在背包容量为j - w[i - 1]]的最优解）
                    if (dp[i - 1][j] < (val[i - 1] + dp[i - 1][j - w[i - 1]])) {
                        dp[i][j] = val[i - 1] + dp[i - 1][j - w[i - 1]];
                        path[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }

                }

            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        int i = path.length - 1; //行的最大下标
        int j = path[0].length - 1;  //列的最大下标
        while(i > 0 && j > 0 ) { //从path的最后开始找
            if(path[i][j] == 1) {
                System.out.printf("第%d个商品放入到背包\n", i);
                j -= w[i-1]; //w[i-1]
            }
            i--;
        }
    }

}
