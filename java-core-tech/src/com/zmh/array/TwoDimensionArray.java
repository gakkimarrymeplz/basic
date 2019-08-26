package com.zmh.array;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int [][] data = new int [][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int x=0;x<data.length;x++) {
			for(int y=0;y<data[x].length;y++) {
				System.out.print(data[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
