package com.zmh.stringtype;

/**
 * 字符串首字母转大写功能其余小写
 * @author zmh
 * @date 2019/8/27 15:00
 */
public class StringDemo2 {
    public static void main(String[] args) {

        String str = "hELLo";
        System.out.println(initCaps(str));

    }

    public static String initCaps(String temp) {
        return temp.substring(0,1).toUpperCase().concat(temp.substring(1).toLowerCase());
    }
}
