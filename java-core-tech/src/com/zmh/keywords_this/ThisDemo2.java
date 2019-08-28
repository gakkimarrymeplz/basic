package com.zmh.keywords_this;

/**
 * @author zmh
 * @date 2019/8/28 9:53
 */
class Dog{
    private String type;
    private double price;

    public Dog() {
        //把这行代码看成100行代码
        System.out.println("构造方法执行");
    }

    public Dog(String type) {
        this();
        this.type = type;
    }

    public Dog(String type, double price) {
        this(type);
        this.price = price;
    }
    public String getInfo() {
        return "品种:"+this.type+",价格"+this.price;
    }
}
public class ThisDemo2 {
    /*构造方法能调用普通方法，普通方法不能调构造方法
     因为构造方法只在初始化的时候执行一次，而普通方法可以无限次调用
    * */

    /*
    * 虽然以上代码实现了构造方法间的互相调用，但此处依然会有一些限制：
    * 限制一：使用"this关键字"调用构造方法的形式只能放在（条件一）"构造方法"的（条件二）"首行"。
    * 限制二：进行构造方法互相调用的时候，一定要保留调用的出口。
    * */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getInfo();
    }



}
