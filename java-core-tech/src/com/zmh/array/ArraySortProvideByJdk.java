package com.zmh.array;

import java.util.Arrays;

public class ArraySortProvideByJdk {
	public static void main(String[] args) {
		int  arr[] = new int[]{5,1,4,3,8};
		Arrays.sort(arr);
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x]+"¡¢");
		}
	}

}
