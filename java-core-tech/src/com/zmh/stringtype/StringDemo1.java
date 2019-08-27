package com.zmh.stringtype;

/**
 * @author zmh
 * @date 2019/8/27 15:00
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String str = "I have a pen i have an apple a!!! applepen";
        String[] s1 = str.split(" ");//按照空格拆分
        String[] s2 = str.split(" ",3);//按照空格拆分 最多拆3个，拆到有三个就不拆了
        for (String a : s1) {
            System.out.println(a);
        }
        System.out.println("---------------------");
        for (String b : s2) {
            System.out.println(b);
        }
    }
}
