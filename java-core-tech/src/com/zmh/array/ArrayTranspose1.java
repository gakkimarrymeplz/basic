package com.zmh.array;
/**
 * 数组转置
 * @author Administrator
 *思路一：定义一个新的数组，把数组倒序插入新数组中然后将旧数组指向新数组
 *虽然此这个方法实现了转置操作，但是遗憾的是，代码中会产生垃圾
 */
public class ArrayTranspose1 {
 public static void main(String[] args) {
  int data[] = new int[] {1,2,3,4,5,6,7,8};
  transpose(data);
  
  
 }
 
 public static void transpose(int temp[]) {
	 int trans[]=new int[temp.length];//首先定义一个数组，长度与原始数组一致
	 int foot=temp.length-1;//定义数组的角标
	 for(int x=0;x<temp.length;x++) {
	 trans[x]=temp[foot];//将原数组元素倒序插入新数组中
     foot--;//移动角标
  }
	 temp=trans;//将原数组的引用指向新数组，原数组的堆空间成为垃圾
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