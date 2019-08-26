package com.zmh.array;
/**
 * 数组转置2 利用算法，在一个数组上完成转置
 * @author Administrator
 */
public class ArrayTranspose2 {
	public static void main(String[] args) {
		int data[] = new int[] {1,2,3,4,5,6,7,8,9};
		transpose(data);
		
		
	}
	
	public static void transpose(int temp[]) {
		
		int head=0;//定义移动头
		int nail=temp.length-1;//定义移动尾
		int tp=0;//定义临时变量
		for(int x=0;x<temp.length;x++) {
			if(head<=nail) {
				tp=temp[head];
				temp[head]=temp[nail];
				temp[nail]=tp;
				
				
			}
			head++;
			nail--;
		}
		print(temp);
	}
	public static void print(int temp[]) {
		for(int x=0;x<temp.length;x++) {
			if(x<temp.length-1) {
				System.out.print(temp[x]+"、");
			}else {
				System.out.print(temp[x]);
			}
			
		}
	}
}
