package com.zmh.reference_pass;

/**
 * @author zmh
 * @date 2019/8/28 15:16
 * 引用传递例子1
 */

class Message{
    private int num=10;

    public Message(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class ReferencePassDemo1 {
    public static void main(String[] args) {
        Message message = new Message(50);
        fun(message);
        System.out.println(message.getNum());
    }
    public static void fun(Message temp) {
        temp.setNum(100);
    }
}
