package com.zmh.wrapper;

/**
 * @author zmh
 * @date 2019/9/25 14:25
 */
class MyInt{
    private int num;

    public MyInt(int num) {
        this.num = num;
    }
    public int getValue() {
        return this.num;
    }
}
public class WrapperDemo {
    public static void main(String[] args) {
        MyInt mi = new MyInt(10);
        int temp=mi.getValue();
        System.out.println(2*temp);

    }
}
