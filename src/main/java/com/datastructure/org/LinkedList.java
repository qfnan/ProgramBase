package com.datastructure.org;

/**
 * @Author nanqf
 * @Date 2018-12-28 19:05
 * @Description TODO
 * @Version 1.0
 **/
public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * 单链表反转:传统方法，通过遍历节点来实现翻转
     * @return
     */
    public static Node reverse1(Node head){
      //判断是否为空链表、只有一个节点
        if(head==null || head.getNext()==null)
            return head;
        Node cur=head.getNext();
        head.setNext(null);
        while(cur!=null){
            //暂存下一节点
            Node temp=cur.getNext();
            //让当前节点指针指向前一节点
            cur.setNext(head);
            //上一节点往下移
            head=cur;
            //当前节点下移
            cur=temp;
        }
       return head;
    }

    /**
     * 利用递归来实现链表翻转
     * @param head
     * @return
     */
    public static Node reverse2(Node head){
        //判断是否为空链表
        if(head==null || head.getNext()==null)
            return head;
        Node rehead=reverse2(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return rehead;
    }

    /**
     * 链中环检测
     * @param node
     * @return
     */
    public static boolean isLoop(Node node){

        return false;
    }

    public static void main(String[] args) {
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        Node node4=new Node();
        node4.setValue(4);
        node3.setValue(3);
        node2.setValue(2);
        node1.setValue(1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        Node node=reverse2(node1);
        while(node!=null){
            System.out.println(node.getValue());
            node=node.getNext();
        }
    }

}
