package com.zmh.keywords_this;

/**
 * @author zmh
 * @date 2019/8/28 10:38
 * this表示当前对象
 */
class Cat{
    public void print() {
        System.out.println("this="+this);
    }
}
public class ThisDemo3 {
    public static void main(String[] args) {
        Cat cata = new Cat();
        System.out.println("cata"+cata);
        cata.print();
        Cat catb = new Cat();
        System.out.println("catb"+catb);
        catb.print();
    }


}
