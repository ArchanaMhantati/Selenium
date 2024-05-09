package archana.java100programs.matrixprogarm;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionAndSubOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row  = sc.nextInt();
        System.out.println("Enter number of columns");
        int column = sc.nextInt();

         int [][] firstMatrix = new int[row][column];
        System.out.println("Enter the data of firstMatrix");
        for (int i=0;i<row; i++){
            for (int j =0;j<column; j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print first matrix");
        for (int[] f :firstMatrix){
            System.out.println(Arrays.toString(f));
        }
        int[][] secondMatrix = new int[row][column];
        System.out.println("Enter the data of second Matrix");
        for (int i =0; i<row; i++){
            for (int j= 0; j<column; j++){
                secondMatrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Print second matrix");
        for (int [] s :secondMatrix){
            System.out.println(Arrays.toString(s));
        }
        int [][] sumOfMatrix = new int[row][column];
        System.out.println("Sum of matrices");
        for (int i =0 ; i<row; i++){
            for (int j =0; j<column; j++){
                sumOfMatrix[i][j] = firstMatrix[i][j]+secondMatrix[i][j];
                System.out.print(sumOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
        int [][] subOfMatrix = new int[row][column];
        System.out.println("Subtraction Of Two Matrix");
        for (int i =0 ; i<row; i++){
            for (int j =0; j<column; j++){
                subOfMatrix[i][j] = firstMatrix[i][j]-secondMatrix[i][j];
                System.out.print(subOfMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
