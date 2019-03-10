import java.util.Arrays;
public class SequenceArrayImpl implements Sequence{
    private static final int DEFAULT_CAPACITY = 10;//默认的数组长度
    private int size;//元素个数
    private Object[] elementData;//数组
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;//界


    public SequenceArrayImpl(){
        elementData=new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(Object data) {
        ensureCapacity(size+1);
        elementData[size++]=data;

    }

    private void ensureCapacity(int minCap){
        //判断是否要增加数组长度，如果默认数组够用，不扩容；
        if(minCap-elementData.length>0){
            grow(minCap);
        }
    }
    private void grow(int minCap){
        int oldCap=elementData.length;
        int newCap=oldCap<<1;
        if(newCap-minCap<0){//需要的数组比按默认扩容的要大
        newCap=minCap;//size+1
        }
        if(newCap-MAX_ARRAY_SIZE>0){
            throw new ArrayIndexOutOfBoundsException("超过数组最?阈值");
        }
    elementData=Arrays.copyOf(elementData,newCap);

    }
    //检查数组中下标有没有越界
    private void rangCheck(int index) {
        if(index>=size){
            System.out.println("数组下标越界");
        }

    }



    /**
     * 线性表中删除元素
     * @param index 要删除的元素下标
     * @return 是否删除成功
     */

    @Override
    public boolean remove(int index) {
        rangCheck(index);
        Object oldData=elementData[index];
        int movesSize=size-index-1;
        if(movesSize>=0) {
            System.arraycopy(elementData, index + 1, elementData, index, movesSize);
            elementData[--size] = null;
            return true;
        }
        return false;
    }


    @Override
    public Object get(int index) {
        rangCheck(index);
        return elementData[index];
    }


    /**
     * 判断线性表中是否有指定元素
     * @param data 要查找的元素内容
     * @return
     */
    @Override
    public boolean contains(Object data) {
        if(null==data){
            for (int i=0;i<elementData.length;i++){
                if(elementData[i]==null)
                    return true;
            }
        }
        else{
            for(int i=0;i<elementData.length;i++){
                if(data.equals(elementData[i]))
                    return true;
            }
        }
        return false;
    }

    /**
     * 修改线性表中指定索引的内容
     * @param index 要修改的元素下标
     * @param newData 修改后的内容
     * @return
     */
    @Override
    public Object set(int index, Object newData) {
        rangCheck(index);
        Object oldData = elementData[index];
        elementData[index] = newData;
        return oldData;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i=0;i<size;i++){
            elementData[size]=null;
        }
        this.size=0;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData,size);
    }
}
