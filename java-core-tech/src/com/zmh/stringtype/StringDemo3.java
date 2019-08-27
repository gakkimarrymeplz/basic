package com.zmh.stringtype;

/**
 * 字符串入池
 * @author zmh
 * @date 2019/8/27 15:00
 */
public class StringDemo3 {
    public static void main(String[] args) {

        String stra = "hello";
        String strb = new String("hello").intern();//手工入池
        System.out.println(stra==strb);


    }


}
