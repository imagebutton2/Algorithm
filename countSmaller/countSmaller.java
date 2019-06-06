package com.java.myAlgorithm;
//给定一个整数数组 nums，按要求返回一个新数组 counts。数组 counts 有该性质：
// counts[i] 的值是  nums[i] 右侧小于 nums[i] 的元素的数量。

import java.util.*;

/**
 * 示例:
 * <p>
 * 输入: [5,2,6,1]
 * 输出: [2,1,1,0]
 * 解释:
 * 5 的右侧有 2 个更小的元素 (2 和 1).
 * 2 的右侧仅有 1 个更小的元素 (1).
 * 6 的右侧有 1 个更小的元素 (1).
 * 1 的右侧有 0 个更小的元素.
 */
public class countSmaller {
    public List<Integer> countSmaller(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>count=new ArrayList<>(nums.length);

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            count.set(i,0);
        }
        mergeSort(nums,0,nums.length-1,count,map);
        return count;
    }
    public static void mergeSort(int[] arr,int low,int high,List<Integer>count,HashMap<Integer,Integer>map) {
        int middle=(high+low)/2;
        if(low<high) {
            //处理左边
            mergeSort(arr, low, middle,count,map);
            //处理右边
            mergeSort(arr, middle+1, high,count,map);
            //归并
            merge(arr,low,middle,high,count,map);
        }
    }
    //两个数组合并
    public static void merge(int[] arr,int low,int middle, int high,List<Integer>count,HashMap<Integer,Integer>map) {
        //用于存储归并后的临时数组
        int[] temp = new int[high-low+1];
        //记录第一个数组中需要遍历的下标
        int i=low;
        //记录第二个数组中需要遍历的下标
        int j=middle+1;
        //用于记录在临时数组中存放的下标
        int index=0;
        //遍历两个数组取出小的数字，放入临时数组中
        while(i<=middle&&j<=high) {
            //第一个数组的数据更小
            if(arr[i]<=arr[j]) {
                //把小的数据放入临时数组中 //让下标向后移一位
                temp[index++]=arr[i];
                if(map.containsKey(arr[i])){
                    int n=j-middle-1;
                    int x=map.get(arr[i]);
                    int y=count.get(x)+n;
                    count.set(x,y);
                }
                i++;

            }else {
                temp[index++]=arr[j++];
            }
        }
        //处理多余的数据

        while (j<=high){
            temp[index++]=arr[j++];
        }
        while (i<=middle){

            temp[index++]=arr[i];
            if(map.containsKey(arr[i])){
                int n=j-middle-1;
                int x=map.get(arr[i]);
                int y=count.get(x)+n;
                count.set(x,y);
            }
            i++;
        }
        //把临时数组中的数据重新存入原数组
        for(int k=0;k<temp.length;k++){
            arr[low+k]=temp[k];
        }

    }

    public static void main(String[] args) {
        countSmaller countSmaller=new countSmaller();
        List<Integer> result;
        int num[]=new int[]{6,6,6,1,1,1};
        result=countSmaller.countSmaller(num);
        for(Integer i:result){
            System.out.println(i);
        }
    }


    class Solution {

        TreeNode root;//记录搜索树根节点
        Map<TreeNode,Integer> map=new HashMap<>();//节点,当前节点的子树个数+1
        public List<Integer> countSmaller(int[] nums) {
            int len=nums.length;
            List<Integer> res=new LinkedList<>();
            for(int i=len-1;i>=0;i--){
                res.add(0,buildTree(nums[i]));//从后到前依次加入二叉搜索树
            }
            return res;
        }

        public int buildTree(int x){
            if(root==null){//初次
                root=new TreeNode(x,0);
                return 0;
            }
            TreeNode node=root;
            int count=0;
            while(true){
                if(map.containsKey(node)){//先更新map里的node
                    map.put(node,map.get(node)+1);
                }
                else{
                    map.put(node,num(node)+1);
                }
                if(node.val<x){
                    if(map.containsKey(node.left))//加上node及其左子树
                        count+=map.get(node.left)+1;
                    else{
                        int y=num(node.left);
                        count+=y+1;
                        map.put(node.left,y);
                    }
                    if(node.right!=null){//node往右
                        node=node.right;
                    }
                    else{//终点
                        node.right=new TreeNode(x,count);
                        break;
                    }
                }
                else{
                    if(node.left!=null){
                        node=node.left;
                    }
                    else{
                        node.left=new TreeNode(x,count);
                        break;
                    }
                }
            }
            return count;
        }

        public int num(TreeNode x){//计算
            if(x==null)
                return 0;
            return num(x.left)+num(x.right)+1;
        }
    }
    class TreeNode{
        int small;
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val,int count){
            this.val=val;
            this.small=count;
        }
    }
}
