package com.zmh.array;
/**
 * ����ת��2 �����㷨����һ�����������ת��
 * @author Administrator
 */
public class ArrayTranspose2 {
	public static void main(String[] args) {
		int data[] = new int[] {1,2,3,4,5,6,7,8,9};
		transpose(data);
		
		
	}
	
	public static void transpose(int temp[]) {
		
		int head=0;//�����ƶ�ͷ
		int nail=temp.length-1;//�����ƶ�β
		int tp=0;//������ʱ����
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
				System.out.print(temp[x]+"��");
			}else {
				System.out.print(temp[x]);
			}
			
		}
	}
}
