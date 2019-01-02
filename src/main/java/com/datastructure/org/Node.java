package com.datastructure.org;


/**
 * @Author nanqf
 * @Date 2018-12-28 19:28
 * @Description TODO
 * @Version 1.0
 **/
public class Node {
    private  Node next;
    private int value;

    public Node() {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
