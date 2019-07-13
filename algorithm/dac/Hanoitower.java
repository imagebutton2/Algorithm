package com.gjz.dac;

public class Hanoitower {

	public static void main(String[] args) {
		hanoiTower(2, 'A', 'B', 'C');
	}

	/**
	 *	汉诺塔的移动的方法
	 * 	使用分治算法
	 * @param num 当前要移动盘的个数
	 * @param a A塔
	 * @param b B塔
	 * @param c C塔
	 */
	public static void hanoiTower(int num, char a, char b, char c) {
	//如果只有1个盘  就是出口  A->C
		if(num==1){
			System.out.println("第1个盘从 " + a + "->" + c);
		}else {
			//把A塔的上的盘看做2部分 最下面的盘 1，剩下的是num-1。
				//第一步要做的就是num-1部分移动到B 塔，要用到c塔
			hanoiTower(num-1,a,c,b);
				//2. 把最下边的盘 A->C
			System.out.println("第" + num + "个盘从 " + a + "->" + c);
			//3. 把B塔的所有盘 从 B->C , 移动过程使用到 a塔
			hanoiTower(num-1,b,a,c);
		}
	}
}
