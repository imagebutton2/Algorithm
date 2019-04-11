package com.My.leetcode.My;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//在波普什市有一个著名的火车站。那里的乡村山峦起伏。这个车站建于上个世纪。
// 不幸的是，当时的资金非常有限。只建立一条地面轨道是可能的。此外，事实证明，
// 该站可能只是一个死胡同（见图），由于缺乏可用空间，它只能有一个轨道。
//     当地的传统是，从A方向到B方向的每一列火车都会以某种方式重新组织车厢。
// 假设从A方向到达的列车有N<=1000节车厢，按递增顺序1、2、…、N编号。
// 列车重组负责人必须知道是否有可能编组继续沿B方向行驶的车厢，以便其顺序为A1、A2、…、AN。帮助他，写一个计划，决定是否有可能得到所需的教练顺序。
// 你可以假设在单程车厢进站前可以与列车断开连接，并且可以自行移动，直到它们在B方向的轨道上。你也可以假设在任何时候，车站内可以根据需要设置尽可能多的车厢。
// 但是，一旦客车进入车站，它就不能返回A方向的轨道，而且一旦它离开B方向的车站，它就不能返回车站。
public class Rails {

    public static boolean check_is_valid_order(Queue <?>queue){
        Stack stack=new Stack();
        int n=queue.size();
        for(int i=1;i<=n;i++){
            stack.push(i);
            while (!stack.empty()&&stack.peek()==queue.peek()){
                stack.pop();
                queue.poll();
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }

  
    }
}
