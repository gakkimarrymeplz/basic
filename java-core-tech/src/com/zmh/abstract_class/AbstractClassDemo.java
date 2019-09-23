package com.zmh.abstract_class;

/**
 * @author zmh
 * @date 2019/9/23 15:47
 */

abstract class A{
    public abstract void print();
    private static class B extends A{
        public void print(){
            System.out.println("Hello World");
        }
    }
    public static A getInstance(){
        return new B();
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        A a=A.getInstance();
        a.print();
    }
}
