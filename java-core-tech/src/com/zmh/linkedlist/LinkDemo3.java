package com.zmh.linkedlist;

/**
 * @author zmh
 * @date 2019/9/12 10:49
 */



public class LinkDemo3 {
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
