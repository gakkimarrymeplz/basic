package com.zmh.keywords_this;

/**
 * @author zmh
 * @date 2019/8/28 11:05
 * this表示当前对象的思考题
 */
class A{
    private B b;
    public A() {//2.执行A类的构造
        //3.为B类对象B实例化
        this.b=new B(this);//4.this就是temp
        this.b.get();//7.调用B类的get方法
    }
    public void print() {//10.调用print输出
        System.out.println("Hello World !啊");

    }
}
class B{
    private A a;
    public B(A a) {//5.参数a=temp
        this.a=a;//6.保存A对象(保存temp)
    }
    public void get() {//8.调用此方法
        this.a.print();//9.this.a=temp
    }
}
public class ThisDemo4 {
    public static void main(String[] args) {
        //1.实例化A类对象，要调用A类的无参构造(由于代码
        // 从右往左执行，执行new A()的时候temp还没有赋值，但为了表述清楚一点就假设temp已经是A类对象名了)
        A temp=new A();
    }
}
