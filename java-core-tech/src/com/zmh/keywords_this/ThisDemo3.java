package com.zmh.keywords_this;

/**
 * @author zmh
 * @date 2019/8/28 10:38
 * this表示当前对象
 */
class Cat{
    public void print() {
        //哪个对象调用print(),this就自动与此对象指向同一块内存地址
        //this就是当前调用方法的对象
        //那么之前出现的"this.属性"实际上是属于当前对象中的属性，一定是堆内存中保存的内容。
        System.out.println("this="+this);
    }
}
public class ThisDemo3 {
    public static void main(String[] args) {
        Cat cata = new Cat();
        System.out.println("cata"+cata);
        cata.print();
        System.out.println("-----------------");
        Cat catb = new Cat();
        System.out.println("catb"+catb);
        catb.print();
    }


}
