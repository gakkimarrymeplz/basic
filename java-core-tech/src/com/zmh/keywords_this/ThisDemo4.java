package com.zmh.keywords_this;

/**
 * @author zmh
 * @date 2019/8/28 11:05
 * this��ʾ��ǰ�����˼����
 */
class A{
    private B b;
    public A() {//2.ִ��A��Ĺ���
        //3.ΪB�����Bʵ����
        this.b=new B(this);//4.this����temp
        this.b.get();//7.����B���get����
    }
    public void print() {//10.����print���
        System.out.println("Hello World !��");

    }
}
class B{
    private A a;
    public B(A a) {//5.����a=temp
        this.a=a;//6.����A����(����temp)
    }
    public void get() {//8.���ô˷���
        this.a.print();//9.this.a=temp
    }
}
public class ThisDemo4 {
    public static void main(String[] args) {
        //1.ʵ����A�����Ҫ����A����޲ι���(���ڴ���
        // ��������ִ�У�ִ��new A()��ʱ��temp��û�и�ֵ����Ϊ�˱������һ��ͼ���temp�Ѿ���A���������)
        A temp=new A();
    }
}
