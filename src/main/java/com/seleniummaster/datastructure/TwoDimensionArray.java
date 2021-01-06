package com.seleniummaster.datastructure;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //different type of syntax:
        int[][] array=new int[3][5];
        int[][] array1=new int[3][];
        int[][] array3=new int[][]{};
        int[] a[]={};

        int[][] array4=new int[][] {
                {1,2,3},
                {4,5,6,7,9,10},
                {9,10,11,15}
        };
        System.out.println(array4.length);
        System.out.println(array4[0].length);
        System.out.println(array4[1].length);
        System.out.println(array4[0][1]);
        System.out.println(array4[2][3]);

        int sum=0;
        for (int i=0; i<array4.length; i++) {
            for (int j=0; j<array4[i].length; j++) {
                sum=sum+array4[i][j];
                System.out.print(array4[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("Sum of all numbers is: " +sum);

    }
}
