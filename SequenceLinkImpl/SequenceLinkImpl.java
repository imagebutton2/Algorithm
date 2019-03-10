//写一个单链表

public interface Sequence {
    /**
     * 向线性表中添加元素
     * @param data 要存储的元素
     */
    void add(Object data);

    /**
     * 线性表中删除元素
     * @param index 要删除的元素下标
     * @return 是否删除成功
     */
    boolean remove(int index);

    /**
     * 在线性表中查找指定索引的元素
     * @param index 要查找的索引
     * @return
     */
    Object get(int index);

    /**
     * 判断线性表中是否有指定元素
     * @param data 要查找的元素内容
     * @return
     */
    boolean contains(Object data);

    /**
     * 修改线性表中指定索引的内容
     * @param index 要修改的元素下标
     * @param newData 修改后的内容
     * @return
     */
    Object set(int index, Object newData);

    /**
     * 返回当前线性表元素个数
     * @return
     */
    int size();

    /**
     * 直接清空线性表内容
     */
    void clear();

    /**
     * 将线性表转为数组
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
    //在任意位置插入元素
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
        //遍历节点将数据存放到对象数组中
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
    //找到当前节点
    private  Node node(int index){
        Node cur=dummyHead.next;
        for (int i=0;i<index-1;i++){
            cur = cur.next;
        }
        return cur;
    }
}