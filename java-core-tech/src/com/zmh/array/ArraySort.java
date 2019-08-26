package com.zmh.array;

//简单冒泡排序
//在方法中对引用数据类型的修改会影响原始数据
public class ArraySort {
	public static void main(String[] args) {
		int data[] = new int[] {5,1,3,2,4};
		sort(data);
		for(int x=0;x<data.length;x++) {
			System.out.print(data[x]+"、");
		}
	}
	public static void sort(int temp[]) {
		for(int y=0;y<temp.length;y++) {
			//外层控制排序总体次数
			for(int x=0;x<temp.length-1;x++) {
				//内层控制每次的排序控制
				if(temp[x]>temp[x+1]) {
					//前面的数大于后面的数，交换
					int t = temp[x];
					temp[x]=temp[x+1];
					temp[x+1]=t;
				}
			}
		}
	}
}
