package com.zmh.array;
/**
 * �������� �������������� �������������� ���������ʾһ��������������Ƕ��������������
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
		return "����Ϊ"+title+",�۸�Ϊ"+price;
	}
	
	
}
public class ObjectArray {
	public static void main(String[] args) {
		Book bk[] = new Book[]{
				new Book("JSP����", 91.8),
				new Book("Android����", 81.8),
				new Book("Java����", 61.8)
		};
		
		for(int x=0;x<bk.length;x++) {
			System.out.println(bk[x].getInfo());
		}
	}
}
