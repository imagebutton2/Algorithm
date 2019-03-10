//дһ��������

public interface Sequence {
    /**
     * �����Ա������Ԫ��
     * @param data Ҫ�洢��Ԫ��
     */
    void add(Object data);

    /**
     * ���Ա���ɾ��Ԫ��
     * @param index Ҫɾ����Ԫ���±�
     * @return �Ƿ�ɾ���ɹ�
     */
    boolean remove(int index);

    /**
     * �����Ա��в���ָ��������Ԫ��
     * @param index Ҫ���ҵ�����
     * @return
     */
    Object get(int index);

    /**
     * �ж����Ա����Ƿ���ָ��Ԫ��
     * @param data Ҫ���ҵ�Ԫ������
     * @return
     */
    boolean contains(Object data);

    /**
     * �޸����Ա���ָ������������
     * @param index Ҫ�޸ĵ�Ԫ���±�
     * @param newData �޸ĺ������
     * @return
     */
    Object set(int index, Object newData);

    /**
     * ���ص�ǰ���Ա�Ԫ�ظ���
     * @return
     */
    int size();

    /**
     * ֱ��������Ա�����
     */
    void clear();

    /**
     * �����Ա�תΪ����
     * @return
     */
    Object[] toArray();
}



public class SequenceLinkImpl implements Sequence{
    private int size;
    private Node  dummyHead=new Node(null,null);
    private class Node {
        Object data;
        Node next;

        public Node(Object data) {

            this.data = data;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    @Override
    public void add(Object data) {
        addLast(data);
    }
    private void addLast(Object data){
        add(size,data);
    }
    private void addFirst(Object data){
        add(0,data);
    }
    //������λ�ò���Ԫ��
    public void add(int index,Object data) {
        rangeCheck(index);
        Node prev=dummyHead;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        //Node newNode = new Node(data);
        //newNode.next = prev.next;
       // prev.next=newNode;
        prev.next=new Node(data,prev.next);
        size++;
    }

    @Override
    public boolean remove(int index) {
        rangeCheck(index);
        Node prev=dummyHead;
        for (int i=0;i<index-1;i++){
            prev = prev.next;
        }
        Node cur=node(index);
        prev.next=cur.next;
        cur.next=null;
        size--;

        return true;
    }

    @Override
    public Object get(int index) {
        rangeCheck(index);
        return node(index).data;
    }

    @Override
    public boolean contains(Object data) {
        Object[] datas=toArray();
        if(data==null){
            for (int i=0;i<datas.length;i++){
                if(datas[i]==null)
                    return true;
            }
        }else {
            for (int i=0;i<datas.length;i++){
                if (data.equals(datas[i])){
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public Object set(int index, Object newData) {
        rangeCheck(index);
        Node prev=node(index);
        Object oldData=prev.data;
        prev.data = newData;
        return oldData;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void clear() {
        Node node=dummyHead.next;
        for (;node!=null;){
            node.data=null;
            Node temp=node.next;
            node.next=null;
            node=temp;
            size--;
        }
    }

    @Override
    public Object[] toArray() {
        //�����ڵ㽫���ݴ�ŵ�����������
        Object[] datas = new Object[size];
        int i=0;
        for (Node temp=dummyHead.next;temp!=null;temp= temp.next){
            datas[i++]  =temp.data;
        }
        return datas;
    }
    private void rangeCheck(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("Illengal Index!");
        }
    }
    //�ҵ���ǰ�ڵ�
    private  Node node(int index){
        Node cur=dummyHead.next;
        for (int i=0;i<index-1;i++){
            cur = cur.next;
        }
        return cur;
    }
}