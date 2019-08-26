package com.zmh.array;
/**
 * 对象数组 数组是引用类型 对象是引用类型 对象数组表示一个引用类型里面嵌套其他引用类型
 * @author Administrator
 *
 */
class Book{
	private String title;
	private Double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Book(String title, Double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getInfo() {
		return "书名为"+title+",价格为"+price;
	}
	
	
}
public class ObjectArray {
	public static void main(String[] args) {
		Book bk[] = new Book[]{
				new Book("JSP开发", 91.8),
				new Book("Android开发", 81.8),
				new Book("Java开发", 61.8)
		};
		
		for(int x=0;x<bk.length;x++) {
			System.out.println(bk[x].getInfo());
		}
	}
}
