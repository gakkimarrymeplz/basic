package com.zmh.array;

public class ArrayCopy {
	public static void main(String[] args) {
		int arrA[] = new int[] {1,2,3,4,5,6,7};
		int arrB[] = new int[] {11,22,33,44,55,66,77};
		System.arraycopy(arrA, 4, arrB, 2, 3);
		for(int x=0;x<arrB.length;x++) {
			System.out.println(arrB[x]);
		}
	}

}
