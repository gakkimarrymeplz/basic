package com.zmh.data_mapping_entity;

/**
 * @author zmh
 * @title: OneToManyModel_ISP
 * @projectName java-core-tech
 * @description: TODO
 * @date 2019/9/423:25
 */

class Item{
    private Integer iid;
    private String name;
    private String note;
    private Subitem[] subitems;
    private Product[] products;

    public Subitem[] getSubitems() {
        return subitems;
    }

    public void setSubitems(Subitem[] subitems) {
        this.subitems = subitems;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Item(Integer iid, String name, String note) {
        this.iid = iid;
        this.name = name;
        this.note = note;
    }

    public String getInfo() {
        return "栏目编号:"+this.iid+",名称"+this.name+"描述"+this.note;
    }
}

class Subitem{
    private Integer sid;
    private String name;
    private String note;
    private Item item;
    private Product[] products;
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Subitem(Product[] products) {
        this.products = products;
    }

    public Subitem(Integer sid, String name, String note) {
        this.sid = sid;
        this.name = name;
        this.note = note;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getInfo() {
        return "子栏目编号:"+this.sid+",名称"+this.name+",描述"+this.note;
    }
}
class Product{
    private Integer pid;
    private String name;
    private Double price;
    private Item item;
    private Subitem subitem;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Subitem getSubitem() {
        return subitem;
    }

    public void setSubitem(Subitem subitem) {
        this.subitem = subitem;
    }

    public Product(Integer pid, String name, Double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public Product(Integer pid, Double price) {
        this.pid = pid;

        this.price = price;
    }
    public String getInfo() {
        return "商品编号:"+this.pid+",商品名称:"+this.name+",商品价格"+this.price;
    }
}
public class OneToManyModel_ISP {

    public static void main(String[] args) {
        Item item = new Item(101,"厨房用具","-");
        Subitem s1 = new Subitem(1001,"炊具","-");
        Subitem s2 = new Subitem(1002,"刀具","-");
        Subitem s3 = new Subitem(1003,"餐具","-");
        Product p1 = new Product(10001,"不粘锅",2000.0);
        Product p2 = new Product(10002,"砂锅",400.0);
        Product p3 = new Product(10003,"麒麟刀",12000.0);
        Product p4 = new Product(10004,"水果刀",10.0);
        Product p5 = new Product(10005,"青花瓷",2000.0);
        Product p6 = new Product(10006,"象牙筷",80000.0);
        item.setSubitems(new Subitem[]{s1,s2,s3});
        item.setProducts(new Product[]{p1,p2,p3,p4,p5,p6});
        s1.setItem(item);
        s2.setItem(item);
        s3.setItem(item);
        s1.setProducts(new Product[]{p1,p2});
        s2.setProducts(new Product[]{p3,p4});
        s3.setProducts(new Product[]{p5,p6});
        p1.setItem(item);
        p2.setItem(item);
        p3.setItem(item);
        p4.setItem(item);
        p5.setItem(item);
        p6.setItem(item);
        p1.setSubitem(s1);
        p2.setSubitem(s1);
        p3.setSubitem(s2);
        p4.setSubitem(s2);
        p5.setSubitem(s3);
        p6.setSubitem(s3);

        for (Subitem subitem : item.getSubitems()) {
            System.out.println(subitem.getInfo());
        }
        System.out.println("---------------------");
        for (Product product : item.getProducts()) {
            System.out.println(product.getInfo());
            System.out.println(product.getSubitem().getInfo());
        }
        System.out.println("-------------------------");
        for (Product product : s2.getProducts()) {
            System.out.println(product.getInfo());
        }
    }
}
