package com.zmh.reference_pass;

/**
 * @author zmh
 * @date 2019/8/28 15:16
 * 引用传递例子3
 */

class Msg{
    private String info = "nihao";
    public Msg(String info) {
       this.info=info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

public class ReferencePassDemo3 {
    //解决思路:String类对象的内容一旦声明则不可改变，对象内容的改变依靠的是引用地址的改变。
    public static void main(String[] args) {
        Msg msg = new Msg("Hello");
        fun(msg);
        System.out.println(msg.getInfo());
    }
    public static void fun(Msg temp) {
        temp.setInfo("world");

    }
}
