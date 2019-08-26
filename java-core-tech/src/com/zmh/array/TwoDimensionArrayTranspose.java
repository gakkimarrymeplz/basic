package com.zmh.array;

/**
 * @author Administrator
 * @title: TwoDimensionArrayTranspose
 * @projectName basic
 * @description: TODO
 * @date 2019/8/2622:03
 */
public class TwoDimensionArrayTranspose {
    public static void main(String[] args) {
        int data[][] = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr = transpose(data);
        for(int x=0;x<arr.length;x++) {
            for(int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+"、");
            }
            System.out.println();
        }


    }

    public static int[][] transpose(int arr[][]) {
        for(int x=0;x<arr.length;x++) {
            for(int y=x;y<arr[x].length;y++) {
                if(x!=y) {
                    int temp=arr[x][y];
                    arr[x][y]=arr[y][x];
                    arr[y][x]=temp;
                }
            }
        }

        return arr;
    }
}
