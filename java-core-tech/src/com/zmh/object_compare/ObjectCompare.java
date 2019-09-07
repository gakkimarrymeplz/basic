package com.zmh.object_compare;

/**
 * @author zmh
 * @title: ObjectCompare
 * @projectName java-core-tech
 * @description: TODO
 * @date 2019/9/80:52
 */

class Book{
    private String title;
    private Double price;

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }


    public boolean compare(Book book) {
        if(book==null) {
            return false;
        }
        if(this==book) {
            return true;
        }
        if(this.title==book.title && this.price==book.price) {
            return true;
        }else {
            return false;
        }
    }
}
public class ObjectCompare {

    public static void main(String[] args) {
        Book b1 = new Book("Java开发",79.8);
        Book b2 = new Book("Java开发",79.8);
        if(b1.compare(b2)) {
            System.out.println("是一个对象!");
        }else {
            System.out.println("不是一个对象!");
        }
    }
}
