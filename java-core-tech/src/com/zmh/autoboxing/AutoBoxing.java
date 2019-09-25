package com.zmh.autoboxing;

/**
 * @author zmh
 * @date 2019/9/25 15:49
 */
public class AutoBoxing {
    public static void main(String[] args) {
        Object obj = 10;//先包装再转换
        int temp = (Integer) obj;//先向下变为Integer而后自动拆箱
        System.out.println(temp*2);

    }
}
