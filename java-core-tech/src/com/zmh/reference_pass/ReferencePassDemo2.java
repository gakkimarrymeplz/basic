package com.zmh.reference_pass;

/**
 * @author zmh
 * @date 2019/8/28 15:16
 * 引用传递例子2
 */


public class ReferencePassDemo2 {
    //解决思路:String类对象的内容一旦声明则不可改变，对象内容的改变依靠的是引用地址的改变。
    public static void main(String[] args) {
        String msg = "Hello";
        fun(msg);
        System.out.println(msg);
    }
    public static void fun(String temp) {
        temp="world";
    }
}
