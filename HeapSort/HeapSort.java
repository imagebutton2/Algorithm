package com.java.myDS.Sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[]nums={4,6,8,5,9};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 功能： 完成 将 以 i 对应的非叶子结点的树调整成大顶堆
     * 举例  int arr[] = {4, 6, 8, 5, 9}; => i = 1 => adjustHeap => 得到 {4, 9, 8, 5, 6}
     * 如果我们再次调用  adjustHeap 传入的是 i = 0 => 得到 {4, 9, 8, 5, 6} => {9,6,8,5, 4}
     * @param arr 待调整的数组
     * @param index 表示非叶子结点在数组中索引
     * @param len 表示对多少个元素继续调整， len 是在逐渐的减少
     */
    public static  void adjust(int []arr,int index,int len){
        int temp=arr[index];
        for(int i=index*2+1;i<len;i=i*2+1){
            if(i+1<len&&arr[i]<arr[i+1]){
                i++;
            }
            if(arr[i]>temp){
                arr[index]=arr[i];
                index=i;
            }else {
                break;
            }
        }
        arr[index]=temp;
    }
    public static void heapSort(int arr[]) {
        int temp = 0;
        //将无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            adjust(arr,i,arr.length);
        }
		/*
		 * 2).将堆顶元素与末尾元素交换，将最大元素"沉"到数组末端;
　　			3).重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到整个序列有序。
		 */
        for(int j=arr.length-1;j>0;j--){
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjust(arr,0,j);
        }


    }

    public static void heapSort1(int arr[]){

    }
    private static void swap(int[]arr,int indexA,int indexB){
        int temp=arr[indexA];
        arr[indexA]=arr[indexB];
        arr[indexB]=temp;
    }

}
