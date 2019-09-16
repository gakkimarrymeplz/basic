package com.zmh.linkedlist;

/**
 * @author zmh
 * @date 2019/9/12 10:49
 */

class Node{
    private String data;//要保存的数据
    private Node next;//下一个节点的引用

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
        Node root = new Node("火车头");
        Node n1 = new Node("车厢1");
        Node n2 = new Node("车厢2");
        root.setNext(n1);
        n1.setNext(n2);
        Node currentNode=root;
        while (currentNode!=null) {
            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
        }
    }
}
