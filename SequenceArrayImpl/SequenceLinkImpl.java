import java.util.Arrays;
public class SequenceArrayImpl implements Sequence{
    private static final int DEFAULT_CAPACITY = 10;//Ĭ�ϵ����鳤��
    private int size;//Ԫ�ظ���
    private Object[] elementData;//����
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;//��


    public SequenceArrayImpl(){
        elementData=new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(Object data) {
        ensureCapacity(size+1);
        elementData[size++]=data;

    }

    private void ensureCapacity(int minCap){
        //�ж��Ƿ�Ҫ�������鳤�ȣ����Ĭ�����鹻�ã������ݣ�
        if(minCap-elementData.length>0){
            grow(minCap);
        }
    }
    private void grow(int minCap){
        int oldCap=elementData.length;
        int newCap=oldCap<<1;
        if(newCap-minCap<0){//��Ҫ������Ȱ�Ĭ�����ݵ�Ҫ��
        newCap=minCap;//size+1
        }
        if(newCap-MAX_ARRAY_SIZE>0){
            throw new ArrayIndexOutOfBoundsException("����������?��ֵ");
        }
    elementData=Arrays.copyOf(elementData,newCap);

    }
    //����������±���û��Խ��
    private void rangCheck(int index) {
        if(index>=size){
            System.out.println("�����±�Խ��");
        }

    }



    /**
     * ���Ա���ɾ��Ԫ��
     * @param index Ҫɾ����Ԫ���±�
     * @return �Ƿ�ɾ���ɹ�
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
     * �ж����Ա����Ƿ���ָ��Ԫ��
     * @param data Ҫ���ҵ�Ԫ������
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
     * �޸����Ա���ָ������������
     * @param index Ҫ�޸ĵ�Ԫ���±�
     * @param newData �޸ĺ������
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
