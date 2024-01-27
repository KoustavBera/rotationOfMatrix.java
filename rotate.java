package lec21_2DArrays.java;

import java.util.Scanner;

public class rotate {
/*LOGIC:
1)transpose
2)row reverse

* */
public static void print2DArray(int[][] array, int row, int column) {
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
}

    public static void transposeWithoutCreatingArray(int[][] array, int row, int column) {

        //transversing the ans array
        for (int i = 0; i < column; i++) {
            for (int j = i; j < row; j++) {
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }

    }
    public static void reverse(int[]arr){
    int i=0,j=arr.length-1;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    }
    public static void rotationOfArray(int[][]array,int row,int column){
    //transpose
    transposeWithoutCreatingArray(array,row,column);
    //reverse
        for(int i=0;i<row;i++){
            reverse(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter " + row * column + " elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input ARRAY:");
        print2DArray(array, row, column);

        System.out.println("Output ARRAY");
        rotationOfArray(array,row,column);
        print2DArray(array,row,column);
    }
}
