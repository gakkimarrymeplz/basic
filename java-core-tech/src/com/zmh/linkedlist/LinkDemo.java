package com.zmh.linkedlist;

/**
 * @author zmh
 * @date 2019/9/12 10:49
 */

class Node{
    private String data;//Ҫ���������
    private Node next;//��һ���ڵ������

    public Node(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
public class LinkDemo {
    public static void main(String[] args) {
        Node root = new Node("��ͷ");
        Node n1 = new Node("����1");
        Node n2 = new Node("����2");
        root.setNext(n1);
        n1.setNext(n2);
        Node currentNode=root;
        while (currentNode!=null) {
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
        }
    }
}
