package com.zmh.array;

//��ð������
//�ڷ����ж������������͵��޸Ļ�Ӱ��ԭʼ����
public class ArraySort {
	public static void main(String[] args) {
		int data[] = new int[] {5,1,3,2,4};
		sort(data);
		for(int x=0;x<data.length;x++) {
			System.out.print(data[x]+"��");
		}
	}
	public static void sort(int temp[]) {
		for(int y=0;y<temp.length;y++) {
			//�����������������
			for(int x=0;x<temp.length-1;x++) {
				//�ڲ����ÿ�ε��������
				if(temp[x]>temp[x+1]) {
					//ǰ��������ں������������
					int t = temp[x];
					temp[x]=temp[x+1];
					temp[x+1]=t;
				}
			}
		}
	}
}
