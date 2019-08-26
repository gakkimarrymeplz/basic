package com.zmh.stream;



class Book{
	
	
	private String title;
	private Double price;
	
	public Book() {
		System.out.println("************");
	}
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
	
	
}
public class ConstructMethod {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		
	}

}
