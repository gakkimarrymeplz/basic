package com.zmh.abstract_class;

/**
 * @author zmh
 * @date 2019/9/23 15:58
 */
abstract class E{

    public E() {
        this.print();
    }
    public abstract void print();
}
class F extends E{

    private int num=100;

    public F(int num){
        this.num=num;
    }
    @Override
    public void print() {
        System.out.println("num="+num);
    }
}
public class AbstractClassDemo2 {
    public static void main(String[] args) {
        new F(30).print();
    }
}
