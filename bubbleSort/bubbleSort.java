public class BubbleSort {
    public static void main(String[] args) {
        int [] datas=new int[]{1,5,8,2,4,7};
       bubbleSort(datas);
        for (int i=0;i<datas.length;i++){
            System.out.print(datas[i]+" ");
        }

    }
    public  static void bubbleSort(int []array) {
         int n = array.length;
        boolean flag=false;
        if (n == 0) {
            return;
        } else {

            //控制冒泡排序的次数
            //一次冒泡只能确保一个元素到达最终位置
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i-1; j++) {
                    if (array[j] > array[j + 1]) {
                        flag=true;
                        int temp = array[j + 1];
                        array[j+1] = array[j ];
                        array[j ] = temp;
                    }

                }
                if(!flag){
                    break;
                }
            }
        }
}