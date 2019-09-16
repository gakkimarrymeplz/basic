package com.zmh.keywords_this;

/**
 * @author zmh
 * @date 2019/8/28 8:57
 * 1、this调用属性
 * 2、this调用方法
 * 3、this表示当前对象
 */

class Book{
    private String title;
    private double price;

    //getter、setter略
    public Book(String title,double price) {
        /*
         public Book(String t,double p) {
            title=t;
            price=p;
          }
        * 此处使用的是一个构造方法，而这个构造方法的主要功能是为title与price两个属性初始化使用，
        * 可是有一点不好，就是我们方法中的参数名称不好。既然构造方法中参数的目的是为了类中的属性
        * 初始化，那么最好的做法是直接将参数设置为与属性名称保持一致。
        *
          public Book(String title,double price) {
            title=title;
            price=price;
          }
        * 修改为以上的参数形式的作用就算是合理了，但是发现最终在构造方法中传递的参数内容并没有传递
        * 到属性之中。
        *
          public Book(String title,double price) {
            this.title=title;
            this.price=price;
          }
        * 在Java程序里面它是以”{}“为界限。如果现在属性名称与参数名称出现了重名的情况下，那么默认情况
        * 下如果没有加入任何的限制，指的都是最近的”{}“内的变量名称。所有在这种情况下为了可以明确的找
        * 到要访问的变量属于类中属性的时候，需要在变量前加上this，这样就可以准确的进行属性的标记。
        *
        * 在以后的开发之中，只要是访问类中的属性前面必须加上this。
        * */
        this.title=title;
        this.price=price;
    }
    public String getInfo() {
        return "书名"+this.title+",价格"+this.price;
    }
}
public class ThisDemo1 {
    public static void main(String[] args) {
        Book book = new Book("Java开发",79.8);
        System.out.println(book.getInfo());
    }
}
