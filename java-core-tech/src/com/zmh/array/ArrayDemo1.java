package com.zmh.array;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int data[] = new int[] {1,2,3};
		change(data);
		for(int x=0;x<data.length;x++) {
			System.out.println(data[x]);
		}
		
	}
	public static void change(int temp[]) {
		for(int x=0;x<temp.length;x++) {
			temp[x]*=2;
		}
	}
}
