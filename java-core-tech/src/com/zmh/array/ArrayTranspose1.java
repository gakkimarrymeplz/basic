package com.zmh.array;
/**
 * ����ת��
 * @author Administrator
 *˼·һ������һ���µ����飬�����鵹�������������Ȼ�󽫾�����ָ��������
 *��Ȼ���������ʵ����ת�ò����������ź����ǣ������л��������
 */
public class ArrayTranspose1 {
 public static void main(String[] args) {
  int data[] = new int[] {1,2,3,4,5,6,7,8};
  transpose(data);
  
  
 }
 
 public static void transpose(int temp[]) {
	 int trans[]=new int[temp.length];//���ȶ���һ�����飬������ԭʼ����һ��
	 int foot=temp.length-1;//��������ĽǱ�
	 for(int x=0;x<temp.length;x++) {
	 trans[x]=temp[foot];//��ԭ����Ԫ�ص��������������
     foot--;//�ƶ��Ǳ�
  }
	 temp=trans;//��ԭ���������ָ�������飬ԭ����Ķѿռ��Ϊ����
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